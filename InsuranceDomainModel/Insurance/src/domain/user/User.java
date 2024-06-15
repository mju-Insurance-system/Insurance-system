package domain.user;

import domain.constants.EAccessAuthority;
import domain.constants.EMenu;
import domain.constants.EUserType;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class User implements Serializable {

	protected EAccessAuthority accessAuthority;
	protected String userId;
	protected int userNum;
	protected String userPw;
	protected EMenu[] menuList;
	protected EUserType eUserType;
	protected String userName;

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