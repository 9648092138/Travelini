package co.travelini.backendservices.controller;




import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import co.travelini.backendservices.dto.response.ImageUploadResponse;
import co.travelini.backendservices.service.FileStorageService;

@RestController
public class FileController 
{
	
	 @Autowired
	 private ServletContext servletContext;
	
		@Autowired
		private FileStorageService service;


//		 private final Logger logger = LoggerFactory.getLogger(FileController.class);
		
	  
		
	@PostMapping("/UploadFile")
	public ImageUploadResponse Upload(@RequestParam("file") MultipartFile file,@RequestParam long id) throws Exception
	{
    System.out.println("file ="+ file);
	String fileName =service.StoreFile(file,id);
	
	String request = "http://ec2-3-17-156-146.us-east-2.compute.amazonaws.com:8080/";
    //String request = "file:///F:/backend services/backend-services";	
		
	String fileDownloadUri = //ServletUriComponentsBuilder.fromPath(request)
			ServletUriComponentsBuilder.fromUriString(request)
			    .path("/images/")
				.path(fileName)
			    .toUriString();
				
		         
	System.out.println(" URI -"+fileDownloadUri);
		
		return new ImageUploadResponse(fileName,fileDownloadUri,file.getContentType(),file.getSize());
	}

	

	/*
	 * @GetMapping("/getImages") public ResponseEntity<InputStreamResource>
	 * getImage(@RequestParam int id) throws IOException {
	 * 
	 * 
	 * ResponseEntity<InputStreamResource> image = service.getImage(id);
	 * 
	 * return image;
	 * 
	 * }
	 */

}

