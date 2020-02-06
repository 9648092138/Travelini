package co.travelini.backendservices.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class ProfileImage 
{
		@Id
		@GeneratedValue(generator="system-uuid")
		@GenericGenerator(name="system-uuid", strategy = "uuid")
	    private String id;

	    private String fileName;

	    private static String fileType;

	    @Lob
	    private byte[] data;

		public ProfileImage()
		{
			super();
		
		}

		
		public ProfileImage( String fileName, String fileType, byte[] data) {
			super();
		
			this.fileName = fileName;
			ProfileImage.fileType = fileType;
			this.data = data;
		}


		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getFileName() {
			return fileName;
		}


		public void setFileName(String fileName) {
			this.fileName = fileName;
		}


		public static String getFileType() {
			return fileType;
		}


		public void setFileType(String fileType) {
			ProfileImage.fileType = fileType;
		}


		public byte[] getData() {
			return data;
		}


		public void setData(byte[] data) {
			this.data = data;
		}


	

	  

}
