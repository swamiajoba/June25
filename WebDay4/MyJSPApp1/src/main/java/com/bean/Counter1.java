package com.bean;
public class Counter1
{
	int count;
	public Counter1()
	{
		count=0;
	}

	public int getCount()
	{
		return ++count;
	}
	public void setCount(int c)
	{
		count=c;
	}
}