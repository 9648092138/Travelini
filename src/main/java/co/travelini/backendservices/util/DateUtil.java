package co.travelini.backendservices.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	
	
	public static long getNoOfDays(String startDate, String endDate) throws ParseException {
	 
		   DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		   Date start = formatter.parse(startDate);
		   Date end = formatter.parse(endDate);
		   
		   

Calendar cal = Calendar.getInstance();
cal.setTime(start);
String formatedDate1 = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" +         cal.get(Calendar.YEAR);
cal.setTime(end);
String formatedDate2 = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" +         cal.get(Calendar.YEAR);
		System.out.println(formatedDate1);
		System.out.println(formatedDate2);
		
		
		SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
	      
	      Date startdate = format.parse(formatedDate1);

			SimpleDateFormat format2= new SimpleDateFormat("dd/MM/yyyy");
		      
		      Date enddate = format2.parse(formatedDate2);
	      
		
       long difference =  (enddate.getTime()-startdate.getTime())/86400000; 
       	return difference;


	     }
}