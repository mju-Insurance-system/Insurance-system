package domain.user;

import domain.user.User;
import domain.user.UserList;

import java.util.Vector;

public class UserListImpl implements UserList {

	private Vector<User> userVector;
	public User m_User;

	public UserListImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param newUser
	 */
	public void AddUser(User newUser){

	}

	/**
	 * 
	 * @param userId
	 */
	public User getUser(String userId){
		return null;
	}
	

	public Vector<User> getUsers(){
		return null;
	}

	/**
	 * 
	 * @param targetUserId
	 */
	public void removeUser(String targetUserId){

	}

	/**
	 * 
	 * @param targetUserId
	 * @param newUser
	 */
	public void replaceUser(String targetUserId, User newUser){

	}

	@Override
	public boolean signUp() {
		return false;
	}

	@Override
	public User logIn(String userId, String userPw) {
		return null;
	}

}