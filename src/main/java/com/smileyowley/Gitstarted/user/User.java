package com.smileyowley.Gitstarted.user;

/*****************************************************************
*	Date: March 2018
*	@author smileyowley
*  
* User class
* 
*****************************************************************/

public class User {
	
	// DATA
	//............................................................
	//declare objects
	
	private int 	userID;
	private String userName;
	private String userEmail;
	private String userRole;
	private String userToken;
	private int 	userStatus;
	private String userLastUpdate;
	
	// CONSTRUCTORS
	//............................................................
	
	public User(int userID, String userName, String userEmail, String userRole, String userToken, int userStatus,
			String userLastUpdate) {
		this.userID = userID;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userRole = userRole;
		this.userToken = userToken;
		this.userStatus = userStatus;
		this.userLastUpdate = userLastUpdate;
	}
	
	// METHODS - Gets and Sets
	//............................................................

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserLastUpdate() {
		return userLastUpdate;
	}

	public void setUserLastUpdate(String userLastUpdate) {
		this.userLastUpdate = userLastUpdate;
	}
	
	// METHODS 
	//............................................................

	@Override
	public String toString() {
		return String.format(
				"User [userID=%s, userName=%s, userEmail=%s, userRole=%s, userToken=%s, userStatus=%s, userLastUpdate=%s]",
				userID, userName, userEmail, userRole, userToken, userStatus, userLastUpdate);
	}
	
	public void display() {
		System.out.println(this.toString());
	}
	
}//EOC
