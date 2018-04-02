package com.smileyowley.Gitstarted;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

import joptsimple.OptionException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*****************************************************************
 *
 *	Date: 2017
 *	@author COR
 *
 * 
 * The purpose of this application is to provide an example for the following:
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
		// To view the arguments being entered
		seeCommandlineInput(args);
			
		// To instantiate App class based in the parameters entered at the commandline
		actionCommandlineInput(args);
    }
    
	// DATA define attributes..............................................................................
	private	Scanner someInput;
	private Date today;
	
	// Added to every class needing to log with one change, getLogger( ) contains name of the class its in
	private static Logger LOG;
	
	private static String VERSION = "0.4";
	
	//SQLite db name + URL, (remove db name hard coding + location, pass in as parameter in next version)
	private String databaseFile = "jdbc:sqlite:C://path/database/smileyowley.db";
	
	// CONSTRUCTORS.........................................................................................
	
	public App( Level logLevel )
	{		
		//associate logging with this class so know the messages that came from objects of this class
		LOG = LogManager.getLogger(App.class);
		Configurator.setLevel(LOG.getName(), logLevel);
		
		// Check the log level requested
		LOG.info("Commandline requested log level:" + logLevel );		
		LOG.info("Application started with log level debug:" + LOG.isDebugEnabled());
		
		//test the logging - uncomment if needed
	//	testLogOutput();
				
		this.someInput = new Scanner(System.in);
		
		//do something here: Display the list of users from the database
		showListOfUsers();
		
		//pause before exit (this is only useful if an error occurs)
        System.out.println(" \n Press enter to exit the program");
		this.someInput.nextLine();

		//close the program without error
		System.exit(0);
	}
	
	public App()
	{
		this( Level.INFO );
	}
    
    
	// METHODS used by main() or debug methods (static methods).....................................
	
	// write out users in a users table for the database specified
	private void showListOfUsers()
	{
		this.today = new Date();
		LOG.debug("Getting list of Users from Database as of " + today);
		
		//if log level id debug e.g. -v parameter used then show database file being used
		LOG.debug("Database file:" + this.databaseFile);
		
		// Get JDBC connection to database
		Connection connection = null;
		
        try
        {
        	  // create a database connection
        	  connection = DriverManager.getConnection( this.databaseFile);
        	
          Statement statement = connection.createStatement();
          statement.setQueryTimeout(30);  // set timeout to 30 sec.
          
          // Run the query
          ResultSet resultSet = statement.executeQuery("select * from user");
          
          // iterate through the results create User objects put in the ListArray
          while(resultSet.next())
          {
              LOG.debug( "User found: " + resultSet.getString("userName") );
          }
        	  
        }
        catch(SQLException e)
        {
          // if the error message is "out of memory",
          // it probably means no database file is found
          LOG.error(e.getMessage());
        } 
        finally
        {
          try
          {
            if(connection != null)
              connection.close();
          }
          catch(SQLException e)
          {
            // connection close failed.
            LOG.error(e.getMessage());
          }
        }
		
	}//EOM
	
	/**
	 * action the arguments presented at the command line
	 * instantiate the App class based on the arguments passed
	 */
	 private static void actionCommandlineInput( String args[] )
	 {
		 try
			{	
				final OptionParser optionParser = new OptionParser();
				
				//define the allowed arguments
				optionParser.acceptsAll(Arrays.asList("v", "verbose"), "Set logging level to DEBUG to see all levels of log messages").forHelp();			
				optionParser.acceptsAll(Arrays.asList("h", "help"), "Display help/usage information").forHelp();
				optionParser.acceptsAll(Arrays.asList("r", "version"), "Display program version information").forHelp();
				
				final OptionSet options = optionParser.parse(args);
				
				if (options.has("help"))
				{
					System.out.println("This program takes an SQL database with a User table as displays the users.");
					System.out.println("It is provided as an example for teaching Java programming.");
					printUsage(optionParser);
					System.exit(0);
				}
				
				if (options.has("version"))
				{
//					System.out.println("Pythia version : " + VERSION);
					System.exit(0);
				}
				
			   // valid input so start the program with the name of the database file to use
			   if (options.has("verbose") )
			   {
				   Level logLevel = Level.DEBUG;
				   System.out.println("RUN WITH: logging level requested: " + logLevel);
				   App anApp = new App(logLevel);
			   }
			   else
			   {
				   System.out.println("RUN WITH: logging level requested: " + Level.INFO);
				   App anApp = new App();
			   }
			}
	        catch (OptionException argsEx)
	        {
	        		System.out.println("ERROR: Arguments\\parameter is not valid. " + argsEx);
	        }
	 }//EOM
	 
	/**
	 * Write help message to standard output using
	 * the provided instance of {@code OptionParser}.
	 */
	 private static void printUsage(final OptionParser parser)
	 {
	      try
	      {
	         parser.printHelpOn(System.out);  
	      }
	      catch (IOException ioEx)
	      {
	         // System.out.println("ERROR: Unable to print usage - " + ioEx);
	         LOG.error("ERROR: Unable to print usage - " + ioEx);
	      }
	 }//EOM
    
	/**
	 * View the arguments presented at the commandline
	 * This is for debug and demo purposes
	 */
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
	 
	/**
	 * Test the Log4J2 logging
	 */
	 private static void testLogOutput()
	 {
		LOG.debug("Log test: Test printed on debug");
	    LOG.info("Log test: Test printed on info");
	    LOG.warn("Log test: Test printed on warn");
	    LOG.error("Log test: Test printed on error");
	    LOG.fatal("Log test: Test printed on fatal");
	
	    LOG.info("Appending string: {}.", "Application log test message - Hi");
		 
	 }//EOM
    
}//EOC
