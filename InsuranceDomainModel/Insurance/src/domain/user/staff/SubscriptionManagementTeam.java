package domain.user.staff;

import domain.subscription.Subscription;
import domain.user.customer.Customer;

public class SubscriptionManagementTeam extends Staff {

	public Subscription m_Subscription;

	public SubscriptionManagementTeam(String userId, String userPw, String userName, String phoneNumber, String SSN, int age, int department) {
		super(userId, userPw, userName, phoneNumber, SSN, age, department);
	}





	/**
	 * 
	 * @param baseLossRate
	 */
	public void adjustPremiums(double baseLossRate){

	}

	/**
	 * 
	 * @param customer
	 */
	public void renewSubscription(Customer customer){

	}

}