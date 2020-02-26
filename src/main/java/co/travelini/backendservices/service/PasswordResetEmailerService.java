package co.travelini.backendservices.service;

import java.io.IOException;

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

import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Personalization;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

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
	
	 final private String sendGridApi = "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";

//	public void sendSimpleMessage(String rawPassword, TraveliniAccount traveliniAccount) {
//
//		try {
//			String text = passwordResetText.//
//					replace("<new-password>", rawPassword);
//
//			String toEmail = traveliniAccount.getEmail();
//				/* SimpleMailMessage message = new SimpleMailMessage(); */
//			 MimeMessage message = emailSender.createMimeMessage();
//			MimeMessageHelper helper = new MimeMessageHelper(message,true);
//			String content = templateService.OTPBuild(text);
//			System.out.println(content);
//			
//			helper.setFrom(fromEmailAddress);
//			helper.setTo(toEmail);
//			helper.setSubject(subject);
//
//			
//			helper.setText(content,true);
//					
//					//final String htmlContent = templateEngine.process("template/OTP.html", ctx);
//					 
//			emailSender.send(message);
//		} catch (MailException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (MessagingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

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
	
	public void sendSimpleMessage(String rawPassword, TraveliniAccount traveliniAccount) {

		try {
			String text = passwordResetText.//
					replace("<new-password>", rawPassword);

			String toEmail = traveliniAccount.getEmail();
				/* SimpleMailMessage message = new SimpleMailMessage(); */
			// MimeMessage message = emailSender.createMimeMessage();
			//MimeMessageHelper helper = new MimeMessageHelper(message,true);
			String content = templateService.OTPBuild(text);
			System.out.println(content);
			
			//helper.setFrom(fromEmailAddress);
			//helper.setTo(toEmail);
			//helper.setSubject(subject);

			
			//helper.setText(content,true);
					
					//final String htmlContent = templateEngine.process("template/OTP.html", ctx);
					 
			//emailSender.send(message);
//			 SendGrid sendgrid = new SendGrid("SENDGRID_APIKEY");
//
//			    SendGrid.Email email = new SendGrid.Email();
//
//			    email.addTo("test@sendgrid.com");
//			    email.setFrom("you@youremail.com");
//			    email.setSubject("Sending with SendGrid is Fun");
//			    email.setHtml("and easy to do anywhere, even with Java");
//
//			    SendGrid.Response response = sendgrid.send(email);
			Mail mail = new Mail();
			Email fromEmail = new Email();
			fromEmail.setEmail(fromEmailAddress);
			mail.setFrom(fromEmail);
			mail.setSubject(subject);
			
			Personalization personalization = new Personalization();
			Email to = new Email();
			to.setEmail(toEmail);
			personalization.addTo(to);
			mail.setTemplateId("Your_SendGrid_Template_Id_Here");
			Content contents = new Content();

			contents.setType("text/plain");
			contents.setValue(content);
			mail.addContent(contents);

			SendGrid sg = new SendGrid(sendGridApi);
			  sg.addRequestHeader("X-Mock", "true");

			  Request request = new Request();
			  //Mail mail = PersonalizeEmail();
			  try {
			   request.setMethod(Method.POST);
			   request.setEndpoint("mail/send");
			   request.setBody(mail.build());
			   Response response = sg.api(request);
			   System.out.println(response.getStatusCode());
			   System.out.println(response.getBody());
			   System.out.println(response.getHeaders());
			  } catch (IOException ex) {
			   ex.printStackTrace();
			  // return "Failed to send mail! " + ex.getMessage();
			  }
			 // return "Email is sent Successfully!!";
			 
			
		} catch (MailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
