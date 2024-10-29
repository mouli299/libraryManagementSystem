package com;

public class IdOutOfBoundException extends RuntimeException
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass()+": Your Id is Out Of Bound ";
	}
}
