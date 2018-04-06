package com.smileyowley.Gitstarted.menu;

/*****************************************************************
*
*	Date: 2018
*	@author smileyowley
*
* 	Ref: https://github.com/bethrobson/Head-First-Design-Patterns/tree/master/src/headfirst/designpatterns/composite/menu
* 
*****************************************************************/

public class MenuItem extends MenuWidget{

	String name;
	String description;
	int itemID;
	boolean executable;
	String executor;
  
	// CONSTRUCTORS............................................................
	
	public MenuItem(int id, String name, String description) {
		this (id, name, description, "sayInvalidOption", false);
	}
	
	public MenuItem(int id, String name, String description, String className) {
		this (id, name, description, className , true);
	}
	
	// METHODS............................................................
	
	private MenuItem(int id, String name, String description, String className, boolean canExecute) {
		this.itemID = id;
		this.name = name;
		this.description = description;
		this.executable = canExecute;
		this.executor = className;	
	}
 
	public int getID() {
		return this.itemID;
	}
 
	public String getDisplayName() {
		return this.name;
	}
 
	public String getDescription() { 
		return this.description;
	}
	
	public boolean isExecutable() {
		return this.executable;
	}
	
	public String getExecutor() { 
		return this.executor;
	}
 
	public void print() {

		System.out.print("ID: " + getID());
		System.out.print(", Display: " + getDisplayName());
		System.out.print(", "+ getDescription());
		System.out.print(", "+ isExecutable());
		System.out.println(", Class: "+ getExecutor());
		
	}//EOM
	
    public String toString()
    {   
    		return String.format( "ID: %x Display: %s, %s, %b, Class: %s \n", getID(), getDisplayName(), getDescription(), isExecutable(), getExecutor() );
    }
	
}