package domain;

import domain.constants.*;
import domain.insurance.*;
import domain.subscription.Subscription;
import domain.subscription.SubscriptionList;
import domain.subscription.SubscriptionListImpl;
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
			EMenu.SIGN_UP,
			EMenu.EXIT
	};
	private final EMenu[] signUpMenuList = {
			EMenu.CUSTOMER_SIGN_UP,
			EMenu.STAFF_SIGN_UP
	};

	private EUserType eUserType;
	private ERunningState eRunningState;
	private User currentUser;
	private UserList userList;
	private InsuranceList insuranceList;
	private SubscriptionList subscriptionList;
	private static final String today = "240616";

	private void initialize() {
		eUserType = EUserType.GUEST;
		eRunningState = ERunningState.RUNNING;
		userList = new UserListImpl();
		insuranceList = new InsuranceListImpl();
		subscriptionList = new SubscriptionListImpl();
//		insuranceList.addInsurance(new DiseaseInsurance("암 진단", EInsuranceType.DISEASE_INSURANCE,
//				"프라임 암보험", 0.8, 200000000, new ESpecialOption[]{ESpecialOption.진단보험금}, new EDisease[]{EDisease.암}));
//		insuranceList.addInsurance(new DiseaseInsurance("성인병 케어", EInsuranceType.DISEASE_INSURANCE,
//				"평생 건강보험", 0.9, 100000000, new ESpecialOption[]{ESpecialOption.연금}, new EDisease[]{EDisease.당뇨, EDisease.고혈압}));
//		insuranceList.addInsurance(new VehicleInsurance("대물 변상", EInsuranceType.DISEASE_INSURANCE,
//				"새내기 운전자보험", 1.8, 1000000000, new ESpecialOption[]{ESpecialOption.형사합의금}, EVehicleType.소형차));
	}

	private void run() {
		Dialog.title("Insurance System");
		while (eUserType == EUserType.GUEST){
			logInMenu();
		}
		while (eRunningState == ERunningState.RUNNING){
			EMenu menu = (EMenu) Dialog.selectMenu(currentUser.getMenuList());
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
		Dialog.separator1("보험상품목록");
		System.out.println(insuranceList.toString());
		String answer = Dialog.inputField("선택할 보험의 번호를 입력해주세요. 이전 화면으로 가시려면 x를 입력하세요");
		try{
			Insurance selectedInsurance = insuranceList.getInsurance(Integer.parseInt(answer));
			if(eUserType == EUserType.CUSTOMER){
				subscript(selectedInsurance);
			}else {
				manage(selectedInsurance);
			}
		}catch (NumberFormatException e){

		}

	}

	private void manage(Insurance selectedInsurance) {
	}

	private void subscript(Insurance selectedInsurance) {
		Dialog.separator2("보험 가입 신청");
		Dialog.print(selectedInsurance.getPolicy());
		if(Dialog.inputField("약관에 동의하십니까? (y/n)").equals("y")){
			Subscription subscription = new Subscription((Customer) currentUser, selectedInsurance, today, false);
			subscriptionList.addSubscription(subscription);
			Dialog.systemMsg("보험 가입 신청이 접수되었습니다.");
		}

	}


	private void logInMenu() {
		EMenu selectedMenu = (EMenu) Dialog.selectMenu(logInMenuList);
		switch (selectedMenu){
			case LOG_IN -> logIn();
			case SIGN_UP -> signUp();
			case EXIT -> eRunningState = ERunningState.HALT;
		}

	}

	private void signUp() {
		Dialog.separator1("회원가입");
		Dialog.systemMsg("회원 유형을 선택하세요.");
		EMenu selectedMenu = (EMenu) Dialog.selectMenu(this.signUpMenuList);
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
			Dialog.separator2(newUser.getUserName()+"님 가입을 축하합니다! ");
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
