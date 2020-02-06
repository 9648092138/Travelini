package co.travelini.backendservices.service;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Random;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import co.travelini.backendservices.configurationproperties.FileStorageProperties;
import co.travelini.backendservices.entity.TraveliniAccount;
import co.travelini.backendservices.repo.TraveliniAccountRepo;






@Service
public class FileStorageService extends HttpServlet
{

	//private final Path fileStorageLocation;

	
	
	@Autowired
	private TraveliniAccountRepo traveliniAccountRepo;
	


	
	 @Autowired
	 private ServletContext servletContext;
//	
//	@Autowired
//	public FileStorageService(FileStorageProperties fileStorageProperties) throws Exception
//	{
//		
//		 this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
//	                  .toAbsolutePath().normalize();
//		 
//		try
//		{
//			
//			Files.createDirectories(this.fileStorageLocation);
//		
//		}
//		catch(Exception e)
//		{
//	        throw new Exception("Could not create the directory where the uploaded files will be stored.", e);		
//		}
//
//	}
	
	
	public String StoreFile(MultipartFile file,long id) throws Exception
	{
	
			String address = "/images/";
			
			byte[] bytes = file.getBytes();
			Random t = new Random();
		
			String fileName = StringUtils.cleanPath(t.nextInt()+""+id+"Accountid.jpg");
			String destination = System.getProperty("user.dir");
			String fullPath = destination +"/../webapps" + address;
			String serverPath = "http://ec2-3-17-156-146.us-east-2.compute.amazonaws.com:8080/images/"+fileName;
		
			File dir = new File(fullPath+ File.separator );
			if (!dir.exists())
				dir.mkdirs();
			File serverFile = new File(dir.getAbsolutePath()
											+ File.separator + fileName);
			
			BufferedOutputStream stream = new BufferedOutputStream(
											new FileOutputStream(serverFile));
			stream.write(bytes);
			
		TraveliniAccount TraveliniAccountId = traveliniAccountRepo.getOneByAccountId(id);
         System.out.println("image path -> "+fullPath);
	     TraveliniAccountId.setImageLocation(serverPath);     
		 traveliniAccountRepo.save(TraveliniAccountId);
					
		
		 try {
	            // Check if the file's natargetLocationme contains invalid characters
	            if(fileName.contains("..")) 
	            {
	                throw new Exception("Sorry! Filename contains invalid path sequence " + fileName);
	            }
	            Path p= Paths.get(fullPath);
	        //   Path targetLocation = this.fileStorageLocation.resolve(fullPath);
	         //   Path targetLocation = Paths.get(destination+address);
	   //        Path targetLocation = this.fileStorageLocation.resolve(p);
	           
	          
	        //  Files.copy(file.getInputStream(),p.getFileName(), StandardCopyOption.REPLACE_EXISTING);
	          

	           
	           
	            
	        } catch (IOException ex) {
	            throw new Exception("Could not store file " + fileName + ". Please try again!", ex);
	        }
		return fileName;		 
		
	}
	public void init() throws ServletException {
	

	    System.out.println( System.getProperty("travelini.dir"));


        System.out.println(Paths.get("").toAbsolutePath().toString());

	}



	


}
