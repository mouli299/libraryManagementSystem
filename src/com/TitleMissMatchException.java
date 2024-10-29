package com;

import java.util.Arrays;

public class TitleMissMatchException extends RuntimeException
{

	@Override
	public String toString() {
		return getClass()+": You Enter Title is Miss Matched title should be java || sql||Python";
	}
	
}
