package com.customException4;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
