package com.bean;
public class MyUser implements java.io.Serializable
{
	private String uid;
	private String password;
	public MyUser()
	{
		this.uid="not typed";
		this.password="not typed";
	}
	public void setUid(String U)
	{
		this.uid=U;
	}
	public String getUid()
	{
		return uid;
	}
	public void setPassword(String p)
	{
		this.password=p;
	}
	public String getPassword()
	{
		return password;
	}
}

