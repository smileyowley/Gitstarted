package com.smileyowley.Gitstarted.user;

import java.util.ArrayList;

public interface IUserDAO {
	
	public ArrayList<User> getAllUsers();
	public User getUser(int userID);
	public int addUser( User aUser);
	public void updateUser( User aUser);
	public void deleteUser( User aUser);
	public String printUser( int userID);

}
