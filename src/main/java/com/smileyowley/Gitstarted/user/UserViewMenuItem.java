package com.smileyowley.Gitstarted.user;

import com.smileyowley.Gitstarted.data.DataManagerSQLite;
import com.smileyowley.Gitstarted.menu.IExecutable;

public class UserViewMenuItem implements IExecutable {
	
	public UserViewMenuItem(){}
	
	public void execute()
	{
		//System.out.println("I ran: " + UserViewMenuItem.class.getName());
		
		//Get the User data
		UserDAO model = new UserDAO( DataManagerSQLite.getInstance() );
		UserConsoleListView view = new UserConsoleListView();
		UserController controller = new UserController( view, model);
		controller.display();
		
	}
	
}
