package co.travelini.backendservices.service;
                          
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import co.travelini.backendservices.dto.request.PartnerServiceDTO;
import co.travelini.backendservices.entity.FavouriteList;
import co.travelini.backendservices.entity.ItineraryFlights;
import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.repo.TraveliniAccountRepo;

@Service
public class PartnerServiceMailSender {

	@Autowired
	private JavaMailSender emailSender;
	
	@Autowired
	private TemplateService templateService;

	@Value("${travelini.sender.emailaddress}")
	private String fromEmailAddress;

//	@Value("${travelini.verificationmail.subject}")
//	private String subject;

	private String subject;
	@Autowired
	TraveliniAccount traveliniAccount;
	
	@Autowired
	TraveliniAccountRepo repo;
	
	
	//ItineraryFlights itineraryFlight;
				
	
	
	public void sendUserTransaction(Long AccountId, PartnerServiceDTO partnerServiceDTO, String TransactionId) 
	{
				try
				{
							
			    traveliniAccount = repo.findByAccountId(AccountId);
			
			    String toEmail = traveliniAccount.getEmail();
		         String AdminMail = "bookings@travelini.co";
			     String AdminMail1 = "ankur@baymediasoft.com";
			    
			   // String AdminMail = "sandeep.joshi@ftechiz.com";
			   // String AdminMail1 = "jayant.kumar@ftechiz.com";
				String content = templateService.PartnerTransactionBuild(partnerServiceDTO,TransactionId);
		        
				
				MimeMessage Usermessage = emailSender.createMimeMessage();
		 		MimeMessageHelper Userhelper = new MimeMessageHelper(Usermessage,true);
				
		 		Userhelper.setFrom(fromEmailAddress);
				Userhelper.setTo(toEmail);
				if(partnerServiceDTO.getType().toString().contains("INSURANCE")) {
				Userhelper.setSubject("Application for Travel Insurance Quote Received");
				}
				else if(partnerServiceDTO.getType().toString().contains("VISA")) {
		 			Userhelper.setSubject("Request for VISA Application Service Recieved");
					}
				else if(partnerServiceDTO.getType().toString().contains("FOREX")) {
					Userhelper.setSubject("Application for Forex Received");
				}
				else if(partnerServiceDTO.getType().toString().contains("DRIVING")) {
					Userhelper.setSubject("Application for International License Received");
				}
				Userhelper.setText(content,true);
				
				//sending mail to user
				emailSender.send(Usermessage);
				System.out.println("message send to user");
				//sending mail to admin
				MimeMessage Adminmessage = emailSender.createMimeMessage();
		 		MimeMessageHelper Adminhelper = new MimeMessageHelper(Adminmessage,true);
				
		 		Adminhelper.setFrom(fromEmailAddress);
		 		Adminhelper.setTo(AdminMail);
		 		Adminhelper.setTo(AdminMail1);
		 		if(partnerServiceDTO.getType().toString().contains("INSURANCE")) {
		 			Adminhelper.setSubject("Application for Travel Insurance Quote Received");
					}
		 		else if(partnerServiceDTO.getType().toString().contains("VISA")) {
		 			Adminhelper.setSubject("Request for VISA Application Service Recieved");
					}
		 
				else if(partnerServiceDTO.getType().toString().contains("FOREX")) {
					Adminhelper.setSubject("Application for Forex Received");
				}
				else if(partnerServiceDTO.getType().toString().contains("DRIVING")) {
					Adminhelper.setSubject("Application for International License Received");
				}
		 		
		 		Adminhelper.setText(content,true);
				
				//sending mail to user
				emailSender.send(Adminmessage);
				System.out.println("detail send to admin");
					}
					catch(Exception e)
							{
							e.printStackTrace();
							System.out.print(e);
							}
}                        
	
	

	
	
	public void sendActivity(String email,FavouriteList post) {
		// TODO Auto-generated method stub
		try {
			System.out.println("send to email " + email);
			String AdminMail = "bookings@travelini.co";

			String acontent = templateService.activityBuild(post);

			MimeMessage Usermessage = emailSender.createMimeMessage();
			MimeMessageHelper Userhelper = new MimeMessageHelper(Usermessage, true);

			Userhelper.setFrom(fromEmailAddress);
			Userhelper.setTo(email);
			Userhelper.setSubject(subject);
			Userhelper.setText(acontent, true);
			// Userhelper.setText("attached the activity detail");
			
			// sending to mail to user
			emailSender.send(Usermessage);
			System.out.println("detail send to user");
			
			//sending mail to admin
			MimeMessage Adminmessage = emailSender.createMimeMessage();
	 		MimeMessageHelper Adminhelper = new MimeMessageHelper(Adminmessage,true);
			
	 		Adminhelper.setFrom(fromEmailAddress);
	 		Adminhelper.setTo(AdminMail);
	 		Adminhelper.setSubject(subject);
	 		Adminhelper.setText(acontent,true);
			
			//send mail to admin
			emailSender.send(Adminmessage);
			System.out.println("detail send to admin");
			
			
			
			
			
		} catch (MailException e) {
			// TODO Auto-generated catch block
			//System.out.println("exception -"+e);
			System.out.println(" detail not  send to admin");
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	

	public void sendflightdetails(ItineraryFlights flights) {
		// TODO Auto-generated method stub
		try
		{
					
	   // traveliniAccount = repo.findByAccountId(AccountId);
	
	    String toEmail = flights.getUserEmail();
	    System.out.println("user e mail is "+flights.getUserEmail());
	    String AdminMail = "bookings@travelini.co";
	    
		//String content = templateService.flightdetail(flights);
        
		
		MimeMessage Usermessage = emailSender.createMimeMessage();
 		MimeMessageHelper Userhelper = new MimeMessageHelper(Usermessage,true);
		
 		Userhelper.setFrom(fromEmailAddress);
		Userhelper.setTo(toEmail);
		Userhelper.setSubject(subject);
		Userhelper.setText("file not attach only for test");
		
		//sending mail to user
		emailSender.send(Usermessage);
		System.out.println("detail send to user");
		
		//sending mail to admin
		MimeMessage Adminmessage = emailSender.createMimeMessage();
 		MimeMessageHelper Adminhelper = new MimeMessageHelper(Adminmessage,true);
		
 		Adminhelper.setFrom(fromEmailAddress);
 		Adminhelper.setTo(AdminMail);
 		Adminhelper.setSubject(subject);
		Adminhelper.setText("flight detail not attached only for test");
		
		//sending mail to user
		emailSender.send(Adminmessage);
		System.out.println("detail send to admin");
			}
			catch(Exception e)
					{
					e.printStackTrace();
					//System.out.print(e);
					}
	}
	
}
