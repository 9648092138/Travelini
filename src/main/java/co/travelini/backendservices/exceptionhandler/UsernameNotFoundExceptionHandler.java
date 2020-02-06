package co.travelini.backendservices.exceptionhandler;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;

@RestControllerAdvice
public class UsernameNotFoundExceptionHandler {

	@ExceptionHandler(UsernameNotFoundException.class)
	public ResponseEntity<GenericResponse<Void>> handle(UsernameNotFoundException exception) {

		exception.printStackTrace();

		GenericResponse<Void> response = new GenericResponse<>(ResponseCode.ERR_ACCOUNT_NOT_FOUND);
		return ResponseEntity.badRequest().body(response);

	}

}
