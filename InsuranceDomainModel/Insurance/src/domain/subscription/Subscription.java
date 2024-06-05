package domain.subscription;

import domain.insurance.Insurance;
import domain.insurance.InsuranceTypeForm;
import domain.user.User;
import domain.user.customer.Customer;

import java.util.Date;

public class Subscription {

	private EAccessAuthority[] accessableAuthority;
	private Date expirationDate;
	private Customer insuredCustomer;
	private double interestRate;
	private double properInsuranceFee;
	private Insurance subscribedInsurance;
	private Date subscribingDate;
	private int subscriptionId;
	private double totalPayment;

	public Subscription(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param newPremium
	 * @param reason
	 * @param adjustDate
	 */
	public void adjustPremium(double newPremium, String reason, Date adjustDate){

	}

	public double calculateCancellationCharge(){
		return 0;
	}

	public double calculatePremium(){
		return 0;
	}

	/**
	 * 
	 * @param accessingUser
	 */
	public boolean checkAuthority(User accessingUser){
		return false;
	}

	/**
	 * 
	 * @param user
	 * @param insurance
	 */
	public void chooseInsurance(User user, Insurance insurance){

	}

	/**
	 * 
	 * @param subscriptionForm
	 */
	public void saveInsuranceSubscriptionForm(InsuranceSubscriptionForm subscriptionForm){

	}

	/**
	 * 
	 * @param insuranceTypeForm
	 */
	public void saveInsuranceTypeForm(InsuranceTypeForm insuranceTypeForm){

	}

	/**
	 * 
	 * @param reason
	 * @param unsubscribingDate
	 */
	public double unsubscribe(String reason, Date unsubscribingDate){
		return 0;
	}

}