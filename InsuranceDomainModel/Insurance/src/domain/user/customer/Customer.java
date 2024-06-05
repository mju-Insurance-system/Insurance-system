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

	private int age;
	private String bankAccount;
	private Subscription[] insuranceHistory;
	private String name;
	private String phoneNumber;
	private String SSN;
	private Insurance[] subscribingInsurance;
	public InsuranceAccident m_InsuranceAccident;
	public Subscription m_Subscription;

	public Customer(){

	}

	public Customer(String str) {
		this.age = 25;
		this.bankAccount = "하나은행 01534345346543";
		this.eUserType = EUserType.CUSTOMER;
		this.name = "김고객";
		this.SSN = "9904241234567";
		this.accessAuthority = EAccessAuthority.CUSTOMER;
		this.userId = "a";
		this.userPw = "1111";
		this.userName = "김고객";
		this.menuList = new EMenu[]{EMenu.LOG_OUT, EMenu.SHOW_INSURANCE_LIST, EMenu.SHOW_SUBSCRIPTION_LIST, EMenu.SHOW_USER_INFO};
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public boolean callEmergency(){
		return false;
	}

	/**
	 * 
	 * @param insurance claim
	 */
	public InsuranceAccident claimInsurance(InsuranceClaim insurance_claim){
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