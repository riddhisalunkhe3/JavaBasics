package com.customException2;

public class InvalidAgeForVotingException extends Exception{
	public InvalidAgeForVotingException(String msg)
	{
		super(msg);
	}
}
