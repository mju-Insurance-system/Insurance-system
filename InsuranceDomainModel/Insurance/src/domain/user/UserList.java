package domain.user;

import domain.user.User;

import java.util.Vector;

public interface UserList {

	/**
	 * 
	 * @param newUser
	 */
	public void AddUser(User newUser);

	/**
	 * 
	 * @param userId
	 */
	public User getUser(String userId);

	public Vector<User> getUsers();

	/**
	 * 
	 * @param targetUserId
	 */
	public void removeUser(String targetUserId);

	/**
	 * 
	 * @param targetUserId
	 * @param newUser
	 */
	public void replaceUser(String targetUserId, User newUser);

	boolean signUp();

	User logIn(String userId, String userPw);
}