package com;

public class BookOutofBoundException extends RuntimeException
{
@Override
public String toString() 
{
	return getClass()+": The Book is not found";
}
}
