package com.customException5;

public class PasswordTooShortException extends Exception{
	public PasswordTooShortException(String msg)
	{
		super(msg);
	}
}
