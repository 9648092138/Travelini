package co.travelini.backendservices.dto.response;

public class ImageResponse
{
	private String fileName;
	private String fileDownloadUri;	

private String fileSize;
private long size;


public ImageResponse() 
{
	super();

}











public ImageResponse(String fileName, String fileDownloadUri, String fileSize, long size) {
	super();
	this.fileName = fileName;
	this.fileDownloadUri = fileDownloadUri;
	this.fileSize = fileSize;
	this.size = size;
}











public String getFileName() {
	return fileName;
}











public void setFileName(String fileName) {
	this.fileName = fileName;
}











public String getFileDownloadUri() {
	return fileDownloadUri;
}











public void setFileDownloadUri(String fileDownloadUri) {
	this.fileDownloadUri = fileDownloadUri;
}











public String getFileSize() {
	return fileSize;
}











public void setFileSize(String fileSize) {
	this.fileSize = fileSize;
}











public long getSize() {
	return size;
}











public void setSize(long size) {
	this.size = size;
}







}
