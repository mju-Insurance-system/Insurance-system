package domain;

import domain.constants.EMenu;
import domain.constants.EUserType;
import domain.user.User;
import domain.user.UserList;
import domain.user.UserListImpl;

public class InsuranceMain {

	enum ERunningState{
		RUNNING,
		HALT
	}
	private final EMenu[] logInMenuList = {
			EMenu.LOG_IN,
			EMenu.SIGN_UP
	};
	private EUserType eUserType;
	private ERunningState eRunningState;
	private User currentUser;
	private UserList userList;

	private void initialize() {
		eUserType = EUserType.GUEST;
		eRunningState = ERunningState.RUNNING;
		userList = new UserListImpl();
	}

	private void run() {
		Dialog.title("Insurance System");
		while (eUserType == EUserType.GUEST){
			logInMenu();
		}
		while (eRunningState == ERunningState.RUNNING){
			EMenu menu = Dialog.selectMenu(currentUser.getMenuList());
			currentUser.operate(menu);

		}

	}


	private void logInMenu() {
		EMenu selectedMenu = Dialog.selectMenu(logInMenuList);
		switch (selectedMenu){
			case LOG_IN -> logIn();
			case SIGN_UP -> userList.signUp();
		}

	}

	private void logIn() {
		String userId = Dialog.inputField("ID");
		String userPw = Dialog.inputField("PW");
		currentUser = userList.logIn(userId, userPw);
		eUserType = currentUser.getEUserType();
		Dialog.separator2(currentUser.getName()+ "님 방문을 환영합니다! ");
	}





	public static void main(String[] args) {
		InsuranceMain insuranceMain = new InsuranceMain();
		insuranceMain.initialize();
		insuranceMain.run();
	}

}
