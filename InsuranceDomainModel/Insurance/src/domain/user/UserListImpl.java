package domain.user;

import domain.user.User;
import domain.user.UserList;
import domain.user.customer.Customer;

import java.io.*;
import java.util.Vector;

public class UserListImpl implements UserList {

	private Vector<User> userVector;
	private static final String FILE_NAME = "userList.dat";
	private static final String FILE_PATH = "data" + File.separator + FILE_NAME;

	public UserListImpl(){
		userVector = new Vector<>();
		loadUsers();
	}

	public void AddUser(User newUser){
		userVector.add(newUser);
		saveUsers();
	}

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

	public void removeUser(String targetUserId){
		userVector.removeIf(user -> user.getUserId().equals(targetUserId));
		saveUsers();
	}

	public void replaceUser(String targetUserId, User newUser){
		for (int i = 0; i < userVector.size(); i++) {
			if (userVector.get(i).getUserId().equals(targetUserId)) {
				userVector.set(i, newUser);
				break;
			}
		}
		saveUsers();
	}

	@Override
	public boolean signUp() {
		return false;
	}

	@Override
	public User logIn(String userId, String userPw) {
		User logInUser = getUser(userId);
		if(logInUser != null && logInUser.getUserPw().equals(userPw)){
			return logInUser;
		}
		return null;
	}

	/**
	 * 이미 존재하는 id면 true를 반환
	 * @param id
	 * @return bDuplicated
	 */
	@Override
	public boolean checkDuplicateId(String id) {
		return getUser(id) != null;
	}

	private void saveUsers() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
			oos.writeObject(userVector);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void loadUsers() {
		File dataDir = new File("data");
		if (!dataDir.exists()) {
			dataDir.mkdir();
		}
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
			userVector = (Vector<User>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			userVector = new Vector<>();
		}
	}
}
