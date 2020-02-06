package co.travelini.backendservices.dto.request;

public class EmailexistResponse {

	private String Message;
	private boolean Status;
	
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean states) {
		this.Status = states;
	}
}
