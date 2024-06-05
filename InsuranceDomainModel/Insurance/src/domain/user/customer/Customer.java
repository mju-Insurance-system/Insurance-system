package domain.user.customer;


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