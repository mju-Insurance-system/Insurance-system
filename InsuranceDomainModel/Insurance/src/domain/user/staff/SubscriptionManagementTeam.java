package domain.user.staff;

import domain.subscription.Subscription;
import domain.user.customer.Customer;

public class SubscriptionManagementTeam extends Staff {

	public Subscription m_Subscription;

	public SubscriptionManagementTeam(){

	}

	public void finalize() throws Throwable {
		super.finalize();
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