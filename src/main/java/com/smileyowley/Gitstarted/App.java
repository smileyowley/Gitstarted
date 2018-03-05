package com.smileyowley.Gitstarted;

import java.util.Date;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.log4j-core\2.10.0;


/*****************************************************************
 *
 *	Date: March 2018
 *	@author smileyowley
 *	Project: TY Music -> Life skills appreciation day
 *	
 *	The purpose of this application is to teach the following:
 * 
 * - Demonstrates the use of development tools : GIT, MAVEN, Eclipse
 * - Demonstrates how to use Eclipse
 * - Provides a refresher of OOP in Java
 * - Provide an introduction to project file structure layout - MAVEN Archetype
 * - Show how to setup Log4j2
 * 
 *****************************************************************/

public class App 
{
    public static void main( String[] args )
    {
		// view arguments being entered
		seeCommandlineInput(args);
			
		// instantiate App class based on parameters entered at commandline
		actionCommandlineInput(args);
    }
    
	// DATA: define attributes..............................................................................................
	
	private	Scanner someInput;
	private Date today;
	
	// added to every class that needs to log changes, getLogger( ) contains the name of the class it's in
	private static Logger LOG;
	
	// CONSTRUCTORS.........................................................................................................
	
	public App()
	{		
		// associate logging with this class so know the messages that came from objects of this class
		//LOG = LogManager.getLogger(App.class);
		
		// test logging
		//testLogOutput();
		
		this.someInput = new Scanner(System.in);
		
		// do something here
		System.out.println(" \n Soon ... stuff will happen here");		
		
		//pause before exit (this is only useful if an error occurs)
        System.out.println(" \n Press enter to exit the program");
		this.someInput.nextLine();

		//close the program without error
		System.exit(0);
	}
    
    
	// static METHODS used by main() or debug methods.......................................................................
	
	// 1) action the arguments presented at command line 2) instantiate App class based on arguments passed
	 private static void actionCommandlineInput( String args[] )
	 {
		 // no special instantiation yet as don't pass args to it
		 App anApp = new App();
	 }
    
	// view arguments presented at commandline for debug and demo
	 private static void seeCommandlineInput( String args[] )
	 {	
		if (args.length == 0)
        {
            System.out.println("There were no commandline arguments passed!");
        }
		else
		{
			// display the command line  entered 
			for(int i = 0; i < args.length; i++) 
			{
	            System.out.println(args[i]);
	            
	        }
		}
		 
	 }//EOM
	 
	// test Log4J2 logging
	/* private static void testLogOutput()
	 {
		LOG.debug("Log test: Test printed on debug");
	    LOG.info("Log test: Test printed on info");
	    LOG.warn("Log test: Test printed on warn");
	    LOG.error("Log test: Test printed on error");
	    LOG.fatal("Log test: Test printed on fatal");
	
	    LOG.info("Appending string: {}.", "Application log test message - Hi");
		 
	 }//EOM */
}//EOC