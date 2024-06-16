package domain.user.customer;


import domain.constants.EAccessAuthority;
import domain.constants.EMenu;
import domain.constants.EUserType;


import domain.insurance.Insurance;
import domain.insurance.InsuranceClaim;
import domain.insurance.accident.InsuranceAccident;
import domain.subscription.Subscription;
import domain.subscription.SubscriptionRequest;
import domain.user.User;

public class Customer extends User {

	private String bankAccount;
	private Subscription[] insuranceHistory;
	private Insurance[] subscribingInsurance;


	public Customer(){

	}

	public Customer(String userId, String userPw, String userName, String phoneNumber, String SSN, int age) {
		super(userId, userPw, userName, phoneNumber, SSN, age);
		eUserType = EUserType.CUSTOMER;
		accessAuthorities = new EAccessAuthority[]{EAccessAuthority.CUSTOMER};
		insuranceHistory = new Subscription[0];
		subscribingInsurance = new Insurance[0];
	}

//	public Customer(String str) {
//		this.age = 25;
//		this.bankAccount = "하나은행 01534345346543";
//		this.eUserType = EUserType.CUSTOMER;
//		this.userName = "김고객";
//		this.SSN = "9904241234567";
//		this.userId = "a";
//		this.userPw = "1111";
//		this.userName = "김고객";
//		this.menuList = new EMenu[]{EMenu.LOG_OUT, EMenu.SHOW_INSURANCE_LIST, EMenu.SHOW_SUBSCRIPTION_LIST, EMenu.SHOW_USER_INFO};
//	}


	public boolean callEmergency(){
		return false;
	}

	/**
	 * 
	 * @param insuranceClaim
	 */
	public InsuranceAccident claimInsurance(InsuranceClaim insuranceClaim){
		return null;
	}

	public Subscription[] getSubscriptionList(){
		return null;
	}

	/**
	 * 
	 * @param premium
	 */
	public void payPremiun(double premium){

	}

	public void subscribeInsurance(){

	}

	/**
	 * 
	 * @param insurance
	 */
	public SubscriptionRequest subscribeInsurance(Insurance insurance){
		return null;
	}

	public void unsubscribe(){

	}

}