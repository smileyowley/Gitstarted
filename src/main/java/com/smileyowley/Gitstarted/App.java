package com.smileyowley.Gitstarted;

import java.util.Date;
import java.util.Scanner;
/*********************************************************************
 * @author: smileyowley
 * Project: SD2 TY Music App
 * Date: 2018
 * Tools: GIT, MAVEN, ECLIPSE
 * Java concepts: OOP, Project file structure layout, MAVEN Archetype
 ********************************************************************/
public class App 
{
    public static void main(String[] args)
    {
    	System.out.println( "Hello World!" );
    	
    	//View arguments being entered
    	seeCommandlineInput(args);
    	//Instantiate App class based in parameters entered at the commandline
    	//actionCommandlineInput(args);
    }

    //DATA, define attributes
    private Scanner someInput;
    private Date today;
    
    //CONSTRUCTORS 
    public App()
    {
    	this.someInput = new Scanner(System.in);
    	
    	//why don't you do something?
    	System.out.println("Functions are coming... ;)");
    	
    	//pause before exit, used if an error occurs
    	System.out.println("Press enter to exit the program");
    	this.someInput.nextLine();
    	
    	//close program without error
    	System.exit(0);
    }
    
    //METHODS used by main() or static debug methods	
    private static void actionCommandInput ( String args[] )
    {
    	//no special instantiation yet as don't pass args to it
    	App anApp = new App();
    }
    
    private static void seeCommandlineInput ( String args[] )
    {
    	if (args.length == 0)
    	{
    		System.out.println("There were no command line arguments passed!");
    	}
    	else
    	{
    		//display the command line entered
    		for(int i = 0; 1 < args.length; i++)
    		{
    			System.out.println(args[i]);
    		}
    	}
    } 
}//EDC