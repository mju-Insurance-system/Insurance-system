package domain.user;

import domain.constants.EAccessAuthority;
import domain.constants.EMenu;
import domain.constants.EUserType;

public class User {

	protected EAccessAuthority accessAuthority;
	private String userId;
	private int userNum;
	private String userPw;
	private EMenu[] menuList;
	protected EUserType eUserType;
	private String userName;

	public User(){

	}


	public EMenu[] getMenus(){
		return null;
	}

	/**
	 * 
	 * @param selectedNum
	 */
	public EMenu selectMenu(int selectedNum){
		return null;
	}

	public void showMenu(){

	}

    public EMenu[] getMenuList() {
		return this.menuList;
    }

	public void operate(EMenu menu) {
		
	}

	public EUserType getEUserType() {
		return this.eUserType;
	}

	public String getName() {
		return this.userName;
	}
}