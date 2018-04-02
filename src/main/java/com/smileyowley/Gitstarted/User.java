package com.smileyowley.Gitstarted;
import java.sql.Timestamp;

/*****************************************************************
*
*	Date: April 2018
*	@author smileyowley
* 
*****************************************************************/

public class User {

	//DATA...declare objects
		private int userID;
		private String userName;
		private String userEmail;
		private String userRole;
		private String userToken;
		private int userStatus;
		private Timestamp userLastUpdate;
	
	/**********************************
	 * @param userID
	 * @param userName
	 * @param userEmail
	 * @param userRole
	 * @param userToken
	 * @param userStatus
	 * @param userLastUpdate
	 **********************************/
	public User(int userID, String userName, String userEmail, String userRole, String userToken, int userStatus,
			Timestamp userLastUpdate) {
		this.userID = userID;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userRole = userRole;
		this.userToken = userToken;
		this.userStatus = userStatus;
		this.userLastUpdate = userLastUpdate;
	}

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

	public Timestamp getUserLastUpdate() {
		return userLastUpdate;
	}

	public void setUserLastUpdate(Timestamp userLastUpdate) {
		this.userLastUpdate = userLastUpdate;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", userEmail=" + userEmail + ", userRole="
				+ userRole + ", userToken=" + userToken + ", userStatus=" + userStatus + ", userLastUpdate="
				+ userLastUpdate + "]";
	}	
}
