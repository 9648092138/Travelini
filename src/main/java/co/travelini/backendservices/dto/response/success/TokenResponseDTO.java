package co.travelini.backendservices.dto.response.success;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({ "token-type", "token" })
public class TokenResponseDTO {


	private String Name;
	
	@JsonProperty("token-type")
	private String tokenType;

	@JsonProperty("token")
	private String token;

	@JsonProperty("accountId")
	private Long accountId;
	
    private boolean updateFlag;




	public TokenResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}




	public TokenResponseDTO(String name, String tokenType, String token, Long accountId,boolean updateFlag) {
		super();
		Name = name;
		this.tokenType = tokenType;
		this.token = token;
		this.accountId = accountId;
		this.updateFlag = updateFlag;
	}




	public String getName() {
		return Name;
	}




	public void setName(String name) {
		Name = name;
	}




	public String getTokenType() {
		return tokenType;
	}




	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}




	public String getToken() {
		return token;
	}




	public void setToken(String token) {
		this.token = token;
	}




	public Long getAccountId() {
		return accountId;
	}




	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}




	public boolean isUpdateFlag() {
		return updateFlag;
	}




	public void setUpdateFlag(boolean updateFlag) {
		this.updateFlag = updateFlag;
	}

	

}
