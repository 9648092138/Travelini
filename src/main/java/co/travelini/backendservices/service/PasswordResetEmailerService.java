package co.travelini.backendservices.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.repo.TraveliniAccountRepo;
import co.travelini.backendservices.util.EncryptionUtil;




@Service
public class PasswordResetEmailerService {

	@Autowired
	private JavaMailSender emailSender;

	@Autowired
	private TraveliniAccountRepo repo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private TemplateService templateService;
	
	@Value("${travelini.sender.emailaddress}")
	private String fromEmailAddress;

	@Value("${travelini.passwordreset.subject}")
	private String subject;

	@Value("${travelini.passwordreset.text}")
	private String passwordResetText;

	public void sendSimpleMessage(String rawPassword, TraveliniAccount traveliniAccount) {

		try {
			String text = passwordResetText.//
					replace("<new-password>", rawPassword);

			String toEmail = traveliniAccount.getEmail();
				/* SimpleMailMessage message = new SimpleMailMessage(); */
			 MimeMessage message = emailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message,true);
			String content = templateService.OTPBuild(text);
			System.out.println(content);
			
			helper.setFrom(fromEmailAddress);
			helper.setTo(toEmail);
			helper.setSubject(subject);

			
			helper.setText(content,true);
					
					//final String htmlContent = templateEngine.process("template/OTP.html", ctx);
					 
			emailSender.send(message);
		} catch (MailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String encryptPassword(String password)
	{
		return EncryptionUtil.encryptPassword(password);
	}
		
	public String resetPassword(String email,String otp, String password, String confirmPassword) 
	{
		
	
		String inputOtp = otp;
		
		System.out.println(inputOtp);
		

		
	TraveliniAccount oldEmail = repo.findByEmail(email); 
		//TraveliniAccount oldEmail = repo.findEmail(email);
	String dataOtp = oldEmail.getOtp();
	
	if(oldEmail.getEmail() != null)
	{
		System.out.println(passwordEncoder.matches(inputOtp, dataOtp));
		if(passwordEncoder.matches(inputOtp, dataOtp) )
		{
			

			
		
		if(password.equals(confirmPassword))
		{

			oldEmail.setPassword(encryptPassword(password));

			oldEmail.setOtp(null);
			
			repo.save(oldEmail);
		return "password changing successful";
		}
		else
		{
			
			return "Password does not match";
		}
	}
		else
		{
			return "otp does not exist";
		}
		
		
	}
	else
	{
		
		return null;
	}
	
		
	}

}
