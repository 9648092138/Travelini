package co.travelini.backendservices.dto.response;

import co.travelini.backendservices.util.Constants;
import co.travelini.backendservices.util.PropertiesUtil;

public enum ResponseCode {

	// Generic Messages
	SUC_GENERIC, //

	ERR_GENERIC, //
	ERR_VALIDATION_ERROR, //
	ERR_METHOD_NOT_SUPPORTED, //

	// Master Information Errors
	ERR_AIRPORT_CODE_NOT_FOUND, //
	ERR_CURRENCY_NOT_FOUND, //
	ERR_COUNTRY_NOT_FOUND, //
	ERR_SEED_DATA_CODE_NOT_FOUND, //

	// User Authentication, Authorization, Registration Errors
	SUC_ACCOUNT_SIGN_UP_WITH_EMAIL, //
	SUC_EMAIL_VERIFIED, //

	ERR_EMAIL_ALREADY_REGISTERED, //
	ERR_TOKEN_EXPIRED, //
	ERR_TOKEN_NOT_VALID, //
	ERR_TOKEN_NOT_FOUND, //
	
	//
	ERR_ACCOUNT_NOT_FOUND, //
	SUC_LOGGED_IN, //
	ERR_REQUEST_BODY_ILLFORMED, //
	ERR_INVALID_PASSWORD, //
	ERR_ACCOUNT_NOT_ENABLED, //
	ERR_SOCIAL_ACCOUNT_ALREADY_LINKED, //
	ERR_SOCIAL_ACCOUNT_LINK_NOT_FOUND, //

	// Forgot Password responses
	SUC_PASSWORD_RESET, //

	// Resend verification email
	SUC_RESEND_VERIFICATION_EMAIL, //

	ERR_INVALID_PARTNER_TYPE //
	;

	private static PropertiesUtil responseCodePropertiesUtil = new PropertiesUtil(
			Constants.RESPONSE_CODES_PROPERTIES_FILE_PATH);

	private String getProperty(String property) {
		return responseCodePropertiesUtil.getPropertyValue(this.name() + "." + property);
	}

	public TraveliniResponseStatus getStatus() {
		String enumName = this.name();

		if (enumName.startsWith(Constants.SUCCESS_PREFIX))
			return TraveliniResponseStatus.SUCCESS;
		else if (enumName.startsWith(Constants.ERROR_PREFIX))
			return TraveliniResponseStatus.ERROR;
		else
			return null;
	}

	public int getCode() {
		String strCode = this.getProperty("Code");

		int code = Integer.parseInt(strCode);
		return code;
	}

	public String getMessage() {
		return this.getProperty("Message");
	}
	

}
