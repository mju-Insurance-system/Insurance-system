package domain.subscription;

import domain.constants.EAccessAuthority;
import domain.insurance.Insurance;
import domain.insurance.InsuranceTypeForm;
import domain.user.User;
import domain.user.customer.Customer;
import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

@Getter
public class Subscription implements Serializable {

	private EAccessAuthority[] accessAuthority;
	private Date expirationDate;
	private Customer insuredCustomer;
	private double interestRate;
	private double properInsuranceFee;
	private Insurance subscribedInsurance;
	private String subscribingDate;
	private int subscriptionId;
	private double totalPayment;
	private boolean bRegistered;


	public Subscription(Customer insuredCustomer, Insurance subscribedInsurance, String subscribingDate,  boolean bRegistered) {
		this.insuredCustomer = insuredCustomer;
		this.subscribedInsurance = subscribedInsurance;
		this.subscribingDate = subscribingDate;
		this.bRegistered = bRegistered;
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

	@Override
	public String toString() {
		return subscriptionId +
				"   |   " + insuredCustomer.getUserName() +
				"   |   " + subscribedInsurance.getInsuranceName()+
				"   |   " + subscribingDate;
	}
}