package com.smileyowley.Gitstarted;

import java.util.Date;
import java.util.Scanner;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

/*********************************************************************
 * @author: smileyowley
 * Project: SD2 TY Music App
 * Date: 2018
 * 
 * Tools: GIT, MAVEN, ECLIPSE
 * Java concepts: OOP, Project file structure layout, MAVEN Archetype, log4j2
 ********************************************************************/
public class App
{
    public static void main( String[] args )
    {
    	//View arguments being entered
    	seeCommandlineInput(args);
    	//Instantiate App class based on parameters entered at the commandline
    	actionCommandlineInput(args);
    }

    //DATA, define attributes..................................................................
    private Scanner someInput;
    private Date today;
    
    //Added to every class that needs to log with 1 change, getLogger() contains its class name
    //private static Logger LOG;
    
    //CONSTRUCTORS............................................................................ 
    public App()
    {
    	//associate logging with this class to know messages coming from its objects
    	//LOG = LogManager.getLogger(App.class);
       
    	//log tester
    	//testLogOutput();
    	
    	this.someInput = new Scanner(System.in);
    	
    	//do something here
    	System.out.println("\n Functions are coming... ;)");
    	
    	//pause before exit, used if for errors
    	System.out.println("\n Press enter to exit the program");
    	this.someInput.nextLine();
    	
    	//close program without error
    	System.exit(0);
    }
      	   	       
    // Static METHODS used by main() or static debug methods....................................
    
    // action arguments at commandline
    private static void actionCommandlineInput( String args[] )
    {
    	//no special instantiation yet as don't pass args to it
    	App anApp = new App();
    }
    
    // view arguments at commandline for debug and demo
    private static void seeCommandlineInput ( String args[] )
    {
    	if (args.length == 0)
    	{
    		System.out.println("There were no command line arguments passed!");
    	}
    	else
    	{
    		//display command line entered
    		for(int i = 0; 1 < args.length; i++)
    		{
    			System.out.println(args[i]);
    		}
    	}
    }//EOM
    
    // Test Log4J2 logging......................................................................
    /*private static void testLogOutput()
    {
    	LOG.debug("Log test: Test printed on debug");
    	LOG.info("Log test: Test printed on info");
    	LOG.warn("Log test: Test printed on warn");
    	LOG.error("Log test: Test printed on error");
    	LOG.fatal("Log test: Test printed on fatal");
       	LOG.info("Appending string: {}. ", "Application log test message - Hi");
    }//EDC*/

}//EDC