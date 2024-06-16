package domain.user.staff;


import domain.constants.EAccessAuthority;
import domain.constants.EDepartment;
import domain.constants.EMenu;
import domain.constants.EUserType;
import domain.user.User;

public class Staff extends User {

	private EMenu[] staffMenus = {
			EMenu.SHOW_INSURANCE_LIST,
			EMenu.SHOW_SUBSCRIPTION_LIST,
			EMenu.SHOW_USER_INFO_LIST
	};
	protected EDepartment department;
	protected int length_of_service;//고침

	public Staff(Staff staff){
		super(staff.userId, staff.userPw, staff.userName, staff.phoneNumber, staff.SSN, staff.age);
		this.eUserType = EUserType.STAFF;
		this.accessAuthorities = new EAccessAuthority[]{EAccessAuthority.STAFF};
		this.menuList = combineMenuList(menuList, staffMenus);
	}


	public Staff(String userId, String userPw, String userName, String phoneNumber, String SSN, int age, int department) {
		super(userId, userPw, userName, phoneNumber, SSN, age);
		this.department = EDepartment.values()[department];
		this.eUserType = EUserType.STAFF;
		this.accessAuthorities = new EAccessAuthority[]{EAccessAuthority.STAFF};
		this.menuList = combineMenuList(menuList, staffMenus);
	}



}