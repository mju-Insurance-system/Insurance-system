package domain.subscription;

import java.util.Vector;

public class SubscriptionListImpl implements SubscriptionList {

	private Vector<Subscription> subscriptionVector;
	public Subscription m_Subscription;

	public SubscriptionListImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param subscription
	 */
	public void addSubscription(Subscription subscription){

	}

	/**
	 * 
	 * @param subscriptionId
	 */
	public Subscription getSubscription(int subscriptionId){
		return null;
	}

	public Vector<Subscription> getSubscriptionVector(){
		return null;
	}

	/**
	 * 
	 * @param subscription
	 */
	public void removeSubscription(Subscription subscription){

	}

	/**
	 * 
	 * @param subscriptionId
	 * @param newSubscription
	 */
	public void replaceSubscription(int subscriptionId, Subscription newSubscription){

	}

}