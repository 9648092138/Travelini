package co.travelini.backendservices.exceptionhandler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import co.travelini.backendservices.dto.response.GenericResponse;
import co.travelini.backendservices.dto.response.ResponseCode;
import co.travelini.backendservices.dto.response.error.FieldValidationError;
import co.travelini.backendservices.exception.TraveliniException;

@RestControllerAdvice
public class GenericExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<GenericResponse<FieldValidationError>> handle(MethodArgumentNotValidException exception) {
		exception.printStackTrace();

		BindingResult bindingResult = exception.getBindingResult();

		List<FieldValidationError> fieldValidationErrors = new ArrayList<>();

		for (FieldError fieldError : bindingResult.getFieldErrors()) {

			FieldValidationError fieldValidationError = new FieldValidationError();

			fieldValidationError.setFieldName(fieldError.getField());
			fieldValidationError.setErrorMessage(fieldError.getDefaultMessage());
			fieldValidationError.setRejectedValue(fieldError.getRejectedValue());

			fieldValidationErrors.add(fieldValidationError);
		}

		GenericResponse<FieldValidationError> response = new GenericResponse<>(ResponseCode.ERR_VALIDATION_ERROR,
				fieldValidationErrors);
		return ResponseEntity.badRequest().body(response);

	}
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<GenericResponse<Void>> handle(HttpMessageNotReadableException exception) {
		exception.printStackTrace();
		
		GenericResponse<Void> response = new GenericResponse<>(ResponseCode.ERR_REQUEST_BODY_ILLFORMED);
		return ResponseEntity.badRequest().body(response);
	}

	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<GenericResponse<Void>> handle(HttpRequestMethodNotSupportedException exception) {
		exception.printStackTrace();

		GenericResponse<Void> response = new GenericResponse<>(ResponseCode.ERR_METHOD_NOT_SUPPORTED);
		return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(response);
	}

	@ExceptionHandler(TraveliniException.class)
	public ResponseEntity<GenericResponse<Void>> handle(TraveliniException exception) {
		exception.printStackTrace();

		GenericResponse<Void> response = new GenericResponse<>(exception.getErrorCode());
		return ResponseEntity.badRequest().body(response);
	}

	@ExceptionHandler(ServletRequestBindingException.class)
	public ResponseEntity<GenericResponse<Void>> handle(ServletRequestBindingException exception) {
		exception.printStackTrace();

		GenericResponse<Void> response = new GenericResponse<>(ResponseCode.ERR_GENERIC);
		return ResponseEntity.badRequest().body(response);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<GenericResponse<Void>> handle(Exception exception) {

		exception.printStackTrace();

		GenericResponse<Void> response = new GenericResponse<>(ResponseCode.ERR_GENERIC);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
	}

}
