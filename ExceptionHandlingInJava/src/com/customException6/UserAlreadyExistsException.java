package com.customException6;

public class UserAlreadyExistsException extends Exception{
	public UserAlreadyExistsException(String msg)
	{
		super(msg);
	}
}
