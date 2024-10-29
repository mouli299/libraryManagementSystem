package com;

public class AuthorMissMatchException extends RuntimeException
{
@Override
public String toString() 
{
	return getClass()+": Auther name is Miss Matches...Author name should be james||alean||scott";
}
}
