package com.abhi.hotel.exception;

public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException() {
		super("Resource that you are loking not found");
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
