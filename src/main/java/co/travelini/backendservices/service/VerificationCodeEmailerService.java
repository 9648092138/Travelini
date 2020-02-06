package co.travelini.backendservices.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;

import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.util.EncodingUtil;
import co.travelini.backendservices.util.EncryptionUtil;

@Service
public class VerificationCodeEmailerService {

	@Autowired
	private JavaMailSender emailSender;
	
	@Autowired
	private TemplateService templateService;

	@Value("${travelini.sender.emailaddress}")
	private String fromEmailAddress;

	@Value("${travelini.verificationmail.subject}")
	private String subject;

	@Value("${travelini.verificationmail.text}")
	private String verification_text;


	
	
	public void sendSimpleMessage(TraveliniAccount traveliniAccount, String token) 
	{
try
{
		String accountId = Long.toString(traveliniAccount.getAccountId());

		String encryptedAccountId = EncodingUtil.encodeBase64(EncryptionUtil.encryptString(accountId));
		String encryptedToken = EncodingUtil.encodeBase64(EncryptionUtil.encryptString(token));

		String text = verification_text.//
				replace("<account-id>", encryptedAccountId).//
				replace("<token>", encryptedToken);
  
	       System.out.println("send verifiction token"+text );
		
		String toEmail = traveliniAccount.getEmail();
         String content = templateService.build(text);
//		SimpleMailMessage message = new SimpleMailMessage();
//         System.out.println("content"+content);
         MimeMessage message = emailSender.createMimeMessage();
 		MimeMessageHelper helper = new MimeMessageHelper(message,true);
		
//		message.setFrom(fromEmailAddress);
//		message.setTo(toEmail);
//		message.setSubject(subject);
//		message.setText(text);
 		
 		System.out.println("token "+content);
 		
		helper.setFrom(fromEmailAddress);
		helper.setTo(toEmail);
		helper.setSubject(subject);
	
		helper.setText(content,true);
	
		System.out.println(message.toString());
		System.out.println("This is message----->" + message);
		
		
		emailSender.send(message);
}
catch(Exception e)
{
	e.printStackTrace();
	System.out.print(e);
}
}
	


}
