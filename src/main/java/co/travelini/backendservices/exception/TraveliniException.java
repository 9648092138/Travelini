package co.travelini.backendservices.exception;

import co.travelini.backendservices.dto.response.ResponseCode;

public class TraveliniException extends Exception {

	/**
	 * Auto Generated Serial Version UID
	 */
	private static final long serialVersionUID = 145364190414369844L;

	private ResponseCode responseCode;
	
	public TraveliniException() {
		super(ResponseCode.ERR_GENERIC.getMessage());
		this.responseCode = ResponseCode.ERR_GENERIC;
	}

	public TraveliniException(final ResponseCode responseCode) {
		super(responseCode.getMessage());
		this.responseCode = responseCode;
	
	}

	public ResponseCode getErrorCode() {
		return this.responseCode;
	}

}
