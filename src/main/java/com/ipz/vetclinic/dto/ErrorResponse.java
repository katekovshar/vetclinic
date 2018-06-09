package com.ipz.vetclinic.dto;

public class ErrorResponse {

	public String state = "error";
	public boolean isErrorPresent = true;
	public String message;

	public ErrorResponse(String message) {
		this.message = message;
	}

}
