package domain;

import domain.constants.EAccessAuthority;
import domain.constants.EMenu;
import domain.constants.EUserType;
import domain.user.User;
import domain.user.UserList;
import domain.user.UserListImpl;
import domain.user.customer.Customer;
import domain.user.staff.Staff;

public class InsuranceMain {

	enum ERunningState{
		RUNNING,
		HALT
	}
	private final EMenu[] logInMenuList = {
			EMenu.LOG_IN,
			EMenu.SIGN_UP
	};
	private final EMenu[] signUpMenuList = {
			EMenu.CUSTOMER_SIGN_UP,
			EMenu.STAFF_SIGN_UP
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
			operate(menu);

		}

	}

	private void operate(EMenu menu) {
		switch (menu){
			case SHOW_INSURANCE_LIST -> showInsuranceList();
			case SHOW_USER_INFO -> showUserInfo();
			case LOG_OUT -> eUserType = EUserType.GUEST;
		}
	}

	private void showUserInfo() {
	}

	private void showInsuranceList() {

	}


	private void logInMenu() {
		EMenu selectedMenu = Dialog.selectMenu(logInMenuList);
		switch (selectedMenu){
			case LOG_IN -> logIn();
			case SIGN_UP -> signUp();
		}

	}

	private void signUp() {
		Dialog.separator1("회원가입");
		Dialog.systemMsg("회원 유형을 선택하세요.");
		EMenu selectedMenu = Dialog.selectMenu(this.signUpMenuList);
		switch (selectedMenu){
			case CUSTOMER_SIGN_UP -> customerSignUp();
			case STAFF_SIGN_UP -> staffSignUp();
		}
	}

	private void staffSignUp() {
		String code = Dialog.inputField("직원인증 코드");
		if(EAccessAuthority.verifyStaff(code)){
			String id = Dialog.inputField("ID");
			while (userList.checkDuplicateId(id)){
				Dialog.systemMsg("이미 존재하는 ID입니다. 다시 입력해주세요.");
				id = Dialog.inputField("ID");
			}
			User newUser = new Staff(id,
					Dialog.inputField("PW"),
					Dialog.inputField("이름"),
					Dialog.inputField("전화번호"),
					Dialog.inputField("주민등록번호"),
					Integer.parseInt(Dialog.inputField("나이")),
					Integer.parseInt(Dialog.inputField("부서코드")));
			userList.AddUser(newUser);
			Dialog.separator2(newUser.getUserName()+"님 방문을 환영합니다! ");
		}
	}

	private void customerSignUp() {
			String id = Dialog.inputField("ID");
			while (userList.checkDuplicateId(id)){
				Dialog.systemMsg("이미 존재하는 ID입니다. 다시 입력해주세요.");
				id = Dialog.inputField("ID");
			}
			User newUser = new Customer(id,
					Dialog.inputField("PW"),
					Dialog.inputField("이름"),
					Dialog.inputField("전화번호"),
					Dialog.inputField("주민등록번호"),
					Integer.parseInt(Dialog.inputField("나이")));
			userList.AddUser(newUser);
			Dialog.separator2(newUser.getUserName()+"님 방문을 환영합니다! ");
	}

	private void logIn() {
		Dialog.separator1("로그인");
		String userId = Dialog.inputField("ID");
		String userPw = Dialog.inputField("PW");
		User logInUser = userList.logIn(userId, userPw);
		while (logInUser == null){
			Dialog.systemMsg("잘못된 계정 정보입니다. 다시 입력해주세요.");
			userId = Dialog.inputField("ID");
			userPw = Dialog.inputField("PW");
			logInUser = userList.logIn(userId, userPw);
		}
		currentUser = logInUser;
		eUserType = currentUser.getEUserType();
		Dialog.separator2(currentUser.getName()+ "님 방문을 환영합니다! ");

	}





	public static void main(String[] args) {
		InsuranceMain insuranceMain = new InsuranceMain();
		insuranceMain.initialize();
		insuranceMain.run();
	}

}
