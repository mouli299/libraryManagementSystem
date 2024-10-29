package com;

public class PagesOutOfBoundException extends RuntimeException
{
	@Override
	public String toString() 
	{
		return getClass()+": Book Pages are Missmatch to Range";
	}
}
