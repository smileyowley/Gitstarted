package com.smileyowley.Gitstarted.menu;

public class FactoryException extends Exception
{
	public FactoryException() {}
	
  /**
   * generate an exception and send a context specific message
   *
   **/
	
	public FactoryException(String s)
	{
		super(s);
	}
	
  /**
   * generate an exception with the message from another exception
   * i.e. ClassNotFoundException
   *
   **/
	
	public FactoryException(Exception e)
	{
		super(e.toString());
	}

}//eoc