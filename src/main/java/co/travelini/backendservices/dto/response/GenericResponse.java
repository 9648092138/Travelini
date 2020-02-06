package co.travelini.backendservices.dto.response;

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "status", "app-code", "code", "message", "data" })

public class GenericResponse<T> {

	@JsonProperty("status")
	private TraveliniResponseStatus status;

	@JsonProperty("app-code")
	private String appCode;

	@JsonProperty("code")
	private int code;

	@JsonProperty("message")
	private String message;

	@JsonProperty("data")
	private Object data;

	public GenericResponse(ResponseCode responseCode) {
		this.setState(responseCode);
		this.data = Collections.emptyList();
	}

	public GenericResponse(ResponseCode responseCode, List<T> data) {
		this.setState(responseCode);
		this.data = data;
	}

	private void setState(ResponseCode responseCode) {
		this.appCode = responseCode.name();
		this.status = responseCode.getStatus();
		this.message = responseCode.getMessage();
		this.code = responseCode.getCode();
	}

	public TraveliniResponseStatus getStatus() {
		return status;
	}

	public void setStatus(TraveliniResponseStatus status) {
		this.status = status;
	}

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}
