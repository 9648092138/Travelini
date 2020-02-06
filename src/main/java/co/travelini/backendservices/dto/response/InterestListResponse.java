package co.travelini.backendservices.dto.response;

public class InterestListResponse {
	
	private Long interestId;
	private String interestImage;
	private String interestTitle;
	

	public InterestListResponse() {
		super();
	}
	public InterestListResponse(Long interestId, String interestImage, String interestTitle) {
		super();
		this.interestId = interestId;
		this.interestImage = interestImage;
		this.interestTitle = interestTitle;
	}
	public Long getInterestId() {
		return interestId;
	}
	public void setInterestId(Long interestId) {
		this.interestId = interestId;
	}
	public String getInterestImage() {
		return interestImage;
	}
	public void setInterestImage(String interestImage) {
		this.interestImage = interestImage;
	}
	public String getInterestTitle() {
		return interestTitle;
	}
	public void setInterestTitle(String interestTitle) {
		this.interestTitle = interestTitle;
	}

}
