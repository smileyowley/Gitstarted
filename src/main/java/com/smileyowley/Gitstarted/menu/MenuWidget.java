package com.smileyowley.Gitstarted.menu;

import java.util.Map;

/*****************************************************************
 *
 *	Date: 2018
 *	@author smileyowley
 *
 * Ref: https://github.com/bethrobson/Head-First-Design-Patterns/tree/master/src/headfirst/designpatterns/composite/menu
 * 
 *****************************************************************/

public abstract class MenuWidget {
	
	public void add(MenuWidget menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuWidget menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public MenuWidget getChild(int i) {
		throw new UnsupportedOperationException();
	}
  
	public int getID() {
		throw new UnsupportedOperationException();
	}
	
	public String getDisplayName() {
		throw new UnsupportedOperationException();
	}
	
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	
	// is it a menu heading or a menu item that can call a class
	
	public boolean isExecutable() {
		throw new UnsupportedOperationException();
	}
		
	public String getExecutor() {
		throw new UnsupportedOperationException();
	}

	public Map< Integer, String> getExecutorList() {
		throw new UnsupportedOperationException();
	}
	
	public void display() {
		throw new UnsupportedOperationException();
	}
	
	public void print() {
		throw new UnsupportedOperationException();
	}

}
