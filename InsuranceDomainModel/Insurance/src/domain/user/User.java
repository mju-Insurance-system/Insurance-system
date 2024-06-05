package domain.user;

public class User {

	protected EAccessAuthority accessAuthority;
	private String userId;
	private int userNum;
	private String userPw;

	public User(){

	}

	public void finalize() throws Throwable {

	}

	public EOperatingMenu[] getMenus(){
		return null;
	}

	/**
	 * 
	 * @param selectedNum
	 */
	public result selectMenu(int selectedNum){
		return null;
	}

	public void showMenu(){

	}

}