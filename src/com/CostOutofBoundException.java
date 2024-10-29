package com;

public class CostOutofBoundException extends RuntimeException
{
	@Override
	public String toString() {
		 
		return getClass()+": You Entered invalid Cost";
	}
}
