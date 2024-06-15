package domain.user;

import domain.user.User;
import domain.user.UserList;
import domain.user.customer.Customer;

import java.util.Vector;

public class UserListImpl implements UserList {

	private Vector<User> userVector;

	public UserListImpl(){
		userVector = new Vector<>();
		userVector.add(new Customer("test"));
	}


	/**
	 * 
	 * @param newUser
	 */
	public void AddUser(User newUser){
		userVector.add(newUser);
	}

	/**
	 * 
	 * @param userId
	 */
	public User getUser(String userId){
		for (User user : userVector) {
			if(user.getUserId().equals(userId)){
				return user;
			}
		}
		return null;
	}
	

	public Vector<User> getUsers(){
		return userVector;
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
		User logInUser = getUser(userId);
		if(logInUser.getUserPw().equals(userPw)){
			return logInUser;
		}
		return null;
	}

}