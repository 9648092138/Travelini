package co.travelini.backendservices;


 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import co.travelini.backendservices.configurationproperties.FileStorageProperties;


@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class BackendServicesApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {

		SpringApplication.run(BackendServicesApplication.class, args);
	}

}