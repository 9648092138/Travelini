package co.travelini.backendservices.dto.response.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;



@JsonPropertyOrder({ "field", "error-message", "rejected-value" })

public class FieldValidationError {

	@JsonProperty("field")
	private String fieldName;

	@JsonProperty("error-message")
	private String errorMessage;

	@JsonProperty("rejected-value")
	private Object rejectedValue;

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Object getRejectedValue() {
		return rejectedValue;
	}

	public void setRejectedValue(Object rejectedValue) {
		this.rejectedValue = rejectedValue;
	}
	
	

}
