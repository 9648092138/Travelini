package co.travelini.backendservices.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import co.travelini.backendservices.dto.request.PartnerServiceDTO;
import co.travelini.backendservices.entity.FavouriteList;
import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.entity.master.SupportedCurrency;
import co.travelini.backendservices.exception.TraveliniException;
import co.travelini.backendservices.repo.TraveliniAccountRepo;
import co.travelini.backendservices.repo.master.CountryRepo;
import co.travelini.backendservices.repo.master.SupportedCurrencyRepo;
import co.travelini.backendservices.util.OriginDestinationDetails;



@Service
public class TemplateService 
{

	private TemplateEngine templateEngine;
	
	@Autowired
	protected TraveliniAccountRepo traveliniAccountRepo;
	
	@Autowired
	private TraveliniAccount account;
	
	@Autowired
	private TraveliniAccountService travelingservice;
	
	@Autowired
	CountryRepo countryRepo;
	
	@Autowired
	TraveliniAccountRepo accountRepo;
	
	@Autowired
	SupportedCurrencyRepo supportedCurrencyRepo;
	@Autowired
    public void MailContentBuilder(TemplateEngine templateEngine)
    {
        this.templateEngine = templateEngine;
    }
 
    public String build(String random)
    {
        Context context = new Context();
        
        context.setVariable("random", random);
        
        
        return templateEngine.process("Hello", context);
        
       
    }
    
    public String OTPBuild(String otp)
    {
        Context context = new Context();
        
        context.setVariable("resetcode", otp);
        System.out.println("Reset code = "+otp);        
        return templateEngine.process("OTP", context);
        
       
    } 
    
    public String PartnerTransactionBuild(PartnerServiceDTO obj,String TransactionId) throws ParseException
    {
        Context context = new Context();
        
        	String email = obj.getPrimaryContactDTO().getEmailId();
        	
        	TraveliniAccount account = accountRepo.findByEmail(email);
        	
        	String nationality = account.getTraveliniAccountSetting().getNationality();
        	
        	System.out.println("nationality" +nationality);
        	
        if(obj.getType().toString().equals("INSURANCE")) {
        	
        	context.setVariable("msg","Hello"+",");
        	context.setVariable("UserName","User Name : "+ obj.getPrimaryContactDTO().getEmailId());
        	System.out.println( obj.getPrimaryContactDTO().getEmailId());
            context.setVariable("Transactiontype","Service Request Type: "+" Travel Insurance");
            context.setVariable("TransactionCode","Service Request Id : "+TransactionId);
            context.setVariable("Name","Name of Applicant :"+ obj.getPrimaryContactDTO().getName());
                        
            List<OriginDestinationDetails> OriginDestList = new ArrayList<>();
            
            for(int i = 0;i<obj.getOriginDestinationDetailDTOList().size();i++) {
            	
            	OriginDestinationDetails OriginObj = new OriginDestinationDetails();
            	
            	if(i==0) {
	            	OriginObj.setAdultCount("Number Of Adults : "+obj.getOriginDestinationDetailDTOList().get(i).getAdultCount());
	            	OriginObj.setChildCount("Number Of Childs : " +obj.getOriginDestinationDetailDTOList().get(i).getChildCount());
	            	OriginObj.setOriginCountry("Origin Country : " +countryRepo.findById(obj.getOriginDestinationDetailDTOList().get(i).getOriginCountryId()).get().getName());
	            	OriginObj.setDestinationCountry("Destination Country : "+countryRepo.findById(obj.getOriginDestinationDetailDTOList().get(i).getDestinationCountryId()).get().getName());
	            	OriginObj.setEndDate("EndDate : " + obj.getOriginDestinationDetailDTOList().get(i).getEndDate().toString());
	            	OriginObj.setStartDate("StartDate : " + obj.getOriginDestinationDetailDTOList().get(i).getStartDate().toString());
	            	}else {
	            		OriginObj.setAdultCount("Number Of Adults : " +obj.getOriginDestinationDetailDTOList().get(i).getAdultCount());
		            	OriginObj.setChildCount("Number Of Childs : "  +obj.getOriginDestinationDetailDTOList().get(i).getChildCount());
		            	OriginObj.setDestinationCountry("Destination Country : " +countryRepo.findById(obj.getOriginDestinationDetailDTOList().get(i).getDestinationCountryId()).get().getName());
		            	OriginObj.setEndDate("EndDate : " + obj.getOriginDestinationDetailDTOList().get(i).getEndDate().toString());
		            	OriginObj.setStartDate("StartDate :" + obj.getOriginDestinationDetailDTOList().get(i).getStartDate().toString());
	            	}
            	OriginDestList.add(OriginObj);
            }
                        
              context.setVariable("originDestinationDetails",OriginDestList);  
              context.setVariable("Mobilenumber","Mobile Number :" +obj.getPrimaryContactDTO().getPhoneNum());
	          context.setVariable("Email", "Email :"+ obj.getPrimaryContactDTO().getEmailId());
	          context.setVariable("Address","Address :" +obj.getPrimaryContactDTO().getAddress());
	          context.setVariable("Nationality","Nationality :" +nationality);
	          SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	          Date date = new Date();  
	          System.out.println(formatter.format(date));
	          
	          context.setVariable("TransactionDate","Date and Time:"+formatter.format(date));
	   
	        }
	       
        
        else if(obj.getType().toString().equals("VISA")){
        	
        	context.setVariable("msg","Hello " + ",");
        	context.setVariable("UserName","User Name :"+ obj.getPrimaryContactDTO().getEmailId());
            context.setVariable("Transactiontype","Service Request Type: "+" Visa Application Service");
            context.setVariable("TransactionCode","Service Request Id : "+ TransactionId);
            context.setVariable("Mobilenumber","Mobile Number :"+ obj.getPrimaryContactDTO().getPhoneNum());
	        context.setVariable("Email", "Email :"+ obj.getPrimaryContactDTO().getEmailId());
	         context.setVariable("Address","Address :"+ obj.getPrimaryContactDTO().getAddress());
	          context.setVariable("Nationality","Nationality :"+ nationality);
	          
	          List<OriginDestinationDetails> OriginDestList = new ArrayList<>();
	            
	            for(int i = 0;i<obj.getOriginDestinationDetailDTOList().size();i++) {
	            	
	            	OriginDestinationDetails OriginObj = new OriginDestinationDetails();
	            	
	                  	OriginObj.setDestinationCountry("Destination Country : "+countryRepo.findById(obj.getOriginDestinationDetailDTOList().get(i).getDestinationCountryId()).get().getName());
		            	OriginObj.setEndDate("EndDate : " + obj.getOriginDestinationDetailDTOList().get(i).getEndDate().toString());
		            	OriginObj.setStartDate("StartDate :" + obj.getOriginDestinationDetailDTOList().get(i).getStartDate().toString());
		            	OriginObj.setNumberOfVisas("Number Of Visas : "+obj.getOriginDestinationDetailDTOList().get(i).getVisaCount());
	            	
	            	OriginDestList.add(OriginObj);
	            }
	                        
	              context.setVariable("originDestinationDetails",OriginDestList); 
	          
	          for(int i=0;i<obj.getForexAmountsDTOList().size();i++) {
	          context.setVariable("PaymentAmount", "Payment Amount:" +" "+countryRepo.findById(obj.getForexAmountsDTOList().get(i).getCurrencyId()).get().getCurrencyCode()+" "+obj.getForexAmountsDTOList().get(i).getAmount());
	          context.setVariable("PaymentId","Payment Id :" +obj.getServiceTransactionList().get(i).getTransactionNumber());
	          SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	          Date date = new Date();  
	          System.out.println(formatter.format(date));
	          
	          context.setVariable("TransactionDate","Date and Time:"+formatter.format(date));
        
        }
        }
	          else if(obj.getType().toString().equals("DRIVING")){
	          	context.setVariable("msg","Hello"+",");
	          	context.setVariable("UserName","User Name :"+obj.getPrimaryContactDTO().getEmailId());
	            for(int i=0;i<obj.getForexAmountsDTOList().size();i++) {
	          		String amount = obj.getPrimaryContactDTO().getAmount();
	          		int amountcost =Integer.valueOf(amount);
	          		context.setVariable("PaymentAmount","Payment Amount :" +supportedCurrencyRepo.findById(obj.getForexAmountsDTOList().get(i).getCurrencyId()).get().getCode() + " "+amount);
	          		if(amountcost >300 || amountcost==300) {
	          			 context.setVariable("Transactiontype","Service Request Type: "+"Urgent Driver's License");
	          		}
	          		else {
	          			 context.setVariable("Transactiontype","Service Request Type: "+"Standard Driver's License");
	          		}
	          			
	          		}
	            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		          Date date = new Date();  
		          System.out.println(formatter.format(date));
	             context.setVariable("TransactionCode","Service Request Id : "+TransactionId);
	             context.setVariable("Name","Name of Applicant :"+obj.getPrimaryContactDTO().getName());
	             context.setVariable("Mobilenumber","Mobile Number :"+obj.getPrimaryContactDTO().getPhoneNum());
		          context.setVariable("Email", "Email :"+ obj.getPrimaryContactDTO().getEmailId());
		          context.setVariable("Address","Address :"+obj.getPrimaryContactDTO().getAddress());
		          context.setVariable("Nationality","Nationality :"+nationality);
		          
		          for(int i=0;i<obj.getForexAmountsDTOList().size();i++) {
	          if(i==0) {
	           context.setVariable("PaymentId","Payment Id :"+obj.getServiceTransactionList().get(i).getTransactionNumber());}
	         
		          
		          }
		          context.setVariable("TransactionDate","Date and Time:"+formatter.format(date));
		          }
        
        
	        
	          else if(obj.getType().toString().equals("FOREX")) {
	        		context.setVariable("msg","Hello"+",");
	            	context.setVariable("UserName","User Name :" +obj.getPrimaryContactDTO().getEmailId());
	                context.setVariable("Transactiontype","Service Request Type: "+"Forex Card");
	                context.setVariable("TransactionCode","Service Request Id : "+TransactionId);
	                
	                List<OriginDestinationDetails> OriginDestList = new ArrayList<>();
	               
//	                for(int i=0;i<obj.getForexAmountsDTOList().size();i++) 
//	                {
//	                	// OriginDestinationDetails OriginObj = new OriginDestinationDetails();
//	                  // OriginObj.setAdultCount("Number Of Adults : "+obj.getOriginDestinationDetailDTOList().get(i).getAdultCount()); 
//	                   context.setVariable("PaymentAmount","Payment Amount :"+obj.getForexAmountsDTOList().get(i).getAmount());
//	     	           context.setVariable("PaymentId","Payment Id :"+obj.getServiceTransactionList().get(i).getTransactionNumber());
//	     	        }
	                context.setVariable("Name","Name of Applicant :" +obj.getPrimaryContactDTO().getName());
	               // 
	                for(int i=0;i<obj.getForexAmountsDTOList().size();i++) {
	                	OriginDestinationDetails OriginObj = new OriginDestinationDetails();
	                	
	                	
	                	
	                	long id =obj.getForexAmountsDTOList().get(i).getCurrencyId();
	                	
	                	  Optional<SupportedCurrency> cur = supportedCurrencyRepo.findById(id);   
	                	  OriginObj.setNameOfCurrency("Name of Currency :" +cur.get().getName());
		                  OriginObj.setAmountOfInvest("Amount Of Invest :" +obj.getForexAmountsDTOList().get(i).getAmount()); 
		                 
	                
	                	
		                 //  OriginDestList.add(OriginObj);
	                	  OriginDestList.add(OriginObj);
	                	   //context.setVariable("AmountToInvest","Amount To Invest"+obj.getForexAmountsDTOList().get(i).getAmount());
	                }
	                for(int i=0;i<obj.getForexAmountsDTOList().size();i++) {
	                	if(i==0) {
	      	          context.setVariable("PaymentAmount", "Payment Amount:" +" "+supportedCurrencyRepo.findById(obj.getForexAmountsDTOList().get(i).getCurrencyId()).get().getCode()+" "+obj.getForexAmountsDTOList().get(i).getAmount());
	      	          context.setVariable("PaymentId","Payment Id :" +obj.getServiceTransactionList().get(i).getTransactionNumber());
	      	         // SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	      	          //Date date = new Date();  
	      	         // System.out.println(formatter.format(date));
	      	          
	      	         // context.setVariable("TransactionDate","Date and Time:"+formatter.format(date));
	                	}else {
	                		
	                	}
	              }
	                
	                  context.setVariable("originDestinationDetails",OriginDestList);
	                  context.setVariable("Mobilenumber","Mobile Number :"+obj.getPrimaryContactDTO().getPhoneNum());
			          context.setVariable("Email", "Email :"+ obj.getPrimaryContactDTO().getEmailId());
			          context.setVariable("Address","Address :"+obj.getPrimaryContactDTO().getAddress());
			          context.setVariable("Nationality","Nationality :"+nationality);
			          SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
			          Date date = new Date();  
			          System.out.println(formatter.format(date));
			          
			          context.setVariable("TransactionDate","Date and Time:"+formatter.format(date));
	          }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      //  context.setVariable("PrimaryContactId","PrimaryContact Id :"+obj.getPrimaryContactDTO().getPrimaryContactId());
       
        

        try {
			 travelingservice.retrieveAccountByAccountId(Long.valueOf(obj.getAccId())).ifPresent(user ->{
				user.getName();
				context.setVariable("TravelerName","Traveller Name: "+user.getName());
				context.setVariable("Time","Time:"+user.getCreationTime());
			});
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TraveliniException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
        return templateEngine.process("PartnerTransaction", context);
        
       
    } 
    
    
    public String verified()
    {
    	Context context = new Context();
    	return templateEngine.process("Template", context);
    }

	public String activityBuild(FavouriteList flist) {
		// TODO Auto-generated method stub
		  Context ativitycontext = new Context();
		  
		  ativitycontext.setVariable("title","Title : "+flist.getTitle());
		  System.out.println("title "+flist.getTitle());
		  
		  ativitycontext.setVariable("country"," Country : "+flist.getCountry());
		  
		  ativitycontext.setVariable("availability","Availability : "+flist.getAvailability());
		  
		  ativitycontext.setVariable("duration","Duration : "+flist.getDuration());
		  
		  ativitycontext.setVariable("validity","Validity : "+flist.getValidity());
		  
		  ativitycontext.setVariable("price","Price : "+flist.getCurrency()+" "+flist.getPrice());
		  
		  ativitycontext.setVariable("bucketTitle","BucketTitle : "+flist.getBucketTitle());
		  // "bucketTitle": "Activities",
		return templateEngine.process("activity",ativitycontext);
	}
}