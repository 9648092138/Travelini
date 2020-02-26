package co.travelini.backendservices.service;

import java.io.IOException;

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

import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.util.EncodingUtil;
import co.travelini.backendservices.util.EncryptionUtil;

@Service
public class VerificationCodeEmailerService  {

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

//using sendgrid
	//@Autowired
	//SendGrid sendGrid;


	
	





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
	

	//using sandrill
//	public void sendSimpleMessage(TraveliniAccount traveliniAccount, String token) 
//	{
//try
//{
//		String accountId = Long.toString(traveliniAccount.getAccountId());
//
//		String encryptedAccountId = EncodingUtil.encodeBase64(EncryptionUtil.encryptString(accountId));
//		String encryptedToken = EncodingUtil.encodeBase64(EncryptionUtil.encryptString(token));
//
//		String text = verification_text.//
//				replace("<account-id>", encryptedAccountId).//
//				replace("<token>", encryptedToken);
//  
//	       System.out.println("send verifiction token"+text );
//		
//		String toEmail = traveliniAccount.getEmail();
//         String content = templateService.build(text);
//
// 		Email from = new Email(fromEmailAddress);
// 		Email to = new Email(toEmail);
// 		Content contentText = new Content("text/plain",content);
// 	
// 		Mail mail = new Mail(from, subject, to,contentText);
// 		System.out.println("token "+content);
// 		
// 		Request request = new Request();
// 		
//		//helper.setFrom(fromEmailAddress);
//		//helper.setTo(toEmail);
//		//helper.setSubject(subject);
//		//helper.setText(content,true);
// 		try {
//            request.setMethod(Method.POST);
//            request.setEndpoint("mail/send");
//            request.setBody(mail.build());
//            
//            Response response = this.sendGrid.api(request);
//            sendGrid.api(request);
//
//            // ...
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//		
//}
//catch(Exception e)
//{
//	e.printStackTrace();
//	System.out.print(e);
//}
//}
}
