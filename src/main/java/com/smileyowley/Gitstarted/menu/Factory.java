package com.smileyowley.Gitstarted.menu;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *  Instantiate an object of a classed based on being supplied the class name
 *  as a string parameter. The object is returned as an object of class Object
 *  the lowest level Java class from which all other classes extend. The
 *  returned object must be cast to the class required.
 *
 *  REMEMBER to check if the returned object is of the required type before
 *  casting or a run time exception will occur i.e. obj.getClass().isInstance(className)
 *  returns true if is.
 *
 *  WARNING this current version does not work where primitives are submitted as parameters
 *  to use primitives wrap them in their respective classes i.e. int use Integer, boolean use Boolean
 *  it will also be necessary to change the class constructor to these wrapper classes or add a
 *  constructor
 *
 *  example 1:
 *
 *  The instanciation of an object with no parameters
 *  Note the name of the class must contain its URL or package path.
 *
 *  // get a factory object
 *  Factory f = Factory.getFactory();
 *
 *  // ask it to return an object of the class given as a string parameter
 *  Object obj  = f.getObject(  "com.oreallyoreilly.Firefish.theClass"   );
 *
 *  // check if object is the same class as the class you expected returned
 *
 *
 **/

public class Factory {
	
	private static Factory theFactory   = null;

	// CONSTRUCTORS
	//............................................................
	
	private Factory(){}
	
	// METHODS 
	//............................................................
	
	public static Factory getFactory()
	{
	    if ( theFactory == null)
	    {
	      theFactory = new Factory();
	    }
	    return theFactory;
	}
	
	public static void removeFactory()
	{
	    if ( theFactory != null)
	      theFactory = null;
	}	
		
    /**
     * return an object of a class which has no parameters
     **/

	public Object getObject(String className) throws FactoryException
	{
		Object[] parameters = new Object[0];
		String[] parameterNames = new String[0];
		return createObject(className, parameters, parameterNames);
	}
	
	/**
	 * return an object of a class which has one parameter
	 **/

	public Object getObject( String className,
	                           Object parameter,
	                           String parameterName)
	throws FactoryException
	{
			Object[] parameters = new Object[1];          // array of size 1
			parameters[0] = parameter;                    // init first element
			String[] parameterNames = new String[1];
			parameterNames[0] = parameterName;
			return createObject(className, parameters, parameterNames);
	}

	/**
	 * return an object of a class which has more than one parameter
	 **/

	public Object getObject( String className,
	                           Object[] parameters,
	                           String[] parameterNames)
	throws FactoryException
	{
			return createObject(className, parameters, parameterNames);
	}

  /**
   * create an object of the class provides constructed with the parameters
   * provided
   *
   * @params className
   * Must supply the fully qualified classname ie. "jermuck.factory.BasicFactory" or
   * "java.lang.Thread" for the class you wish to instanciate
   *
   * @params parameters
   * an object array of the actual parameter objects to be used by the constructor of
   * of the class. The parameters are all in the form of Object classes
   *
   * @params parameterClassNames
   * a string array with the corresponding class names of the parameters contained
   * in the parameters object array. This is required for searching for the right
   * constructor and casting the objects back to their correct class type before
   * executing the constructor
   *
   **/

   public Object createObject( String className,
                              Object[] parameters,
                              String[] parameterClassNames )
   throws FactoryException
   {
		int x = 0;         // counters

		Class theClass;    // represents a classes and interfaces in a running java application

		// see if class exists and can be initialised
		
		try
		{
			theClass = Class.forName(className);    //causes the class to be initilised
		}
		catch (ClassNotFoundException e)
		{
			throw new FactoryException(e);
		}

		// provides information about, and access to, a single constructor for a class.
		Constructor con;   
              
	    // Find the class types of the parameters so the right constructor can be used
	    // 1. create an array of Class objects equal to the parameters array size
	    // 2. loop through the parameters class names and initialise instances of
	    //    their classes

		Class[] classParams = new Class[parameters.length];

		try
		{
			for (x = 0; x < parameters.length; x++)
			{
				classParams[x] = Class.forName(parameterClassNames[x]);
			}
		}
		catch (ClassNotFoundException e)
		{
			throw new FactoryException(e);
		}


		// look for a constructor matching the parameter signature
		try
		{
			con = theClass.getConstructor(classParams);
		}
		catch (NoSuchMethodException e)
		{
			throw new FactoryException(e);
		}
		catch (SecurityException e)
		{
			throw new FactoryException(e);
		}

		// instantiate the object using the constructor
		try
		{
			return (Object)con.newInstance(parameters);
		}
		catch (InstantiationException e)
		{
			throw new FactoryException(e);
		}
		catch (IllegalAccessException e)
		{
			throw new FactoryException(e);
		}
		catch (IllegalArgumentException e)
		{
			throw new FactoryException(e);
		}
		catch (InvocationTargetException e)
		{
			e.getTargetException().getMessage();
			e.getTargetException().printStackTrace();
			throw new FactoryException(e);
		}
		
	}//EOM

}