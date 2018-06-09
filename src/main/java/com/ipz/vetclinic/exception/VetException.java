package com.ipz.vetclinic.exception;

import com.ipz.vetclinic.dto.ErrorManagerResponse;
import com.ipz.vetclinic.dto.ErrorResponse;

/**
 * Created by d.bublik on 22.05.2018.
 */
public class VetException extends RuntimeException {

	private ErrorManagerResponse errorManagerResponse = new ErrorManagerResponse();

	public VetException(String errorName, String message) {
		errorManagerResponse.errors.put(errorName, new ErrorResponse(message));
	}

	public VetException(ErrorManagerResponse errorManagerResponse) {
		this.errorManagerResponse = errorManagerResponse;
	}

	public ErrorManagerResponse getErrorManagerResponse() {
		return errorManagerResponse;
	}

	public void setErrorManagerResponse(ErrorManagerResponse errorManagerResponse) {
		this.errorManagerResponse = errorManagerResponse;
	}

}
