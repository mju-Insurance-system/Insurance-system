package domain.user;

import domain.constants.EAccessAuthority;
import domain.constants.EMenu;
import domain.constants.EUserType;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class User implements Serializable {



	protected EAccessAuthority[] accessAuthorities;
	protected String userId;
	protected int userNum;
	protected String userPw;
	protected EMenu[] menuList = new EMenu[]{
			EMenu.SHOW_USER_INFO
	};
	protected EUserType eUserType;
	protected String userName;
	protected String phoneNumber;
	protected String SSN;
	protected int age;



	public User(){

	}

	public User(String userId, String userPw, String userName, String phoneNumber, String SSN, int age) {
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.SSN = SSN;
		this.age = age;
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

	protected EMenu[] combineMenuList(EMenu[] commonMenus, EMenu[] specificMenus){
		EMenu[] combinedMenus = new EMenu[commonMenus.length + specificMenus.length];
		System.arraycopy(commonMenus, 0, combinedMenus, 0, commonMenus.length);
		System.arraycopy(specificMenus, 0, combinedMenus, commonMenus.length, specificMenus.length);
		return combinedMenus;
	}

}