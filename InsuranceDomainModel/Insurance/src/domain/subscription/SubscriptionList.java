package domain.subscription;

import java.util.Vector;

public interface SubscriptionList {

	/**
	 * 
	 * @param subscription
	 */
	public void addSubscription(Subscription subscription);

	/**
	 * 
	 * @param subscriptionId
	 */
	public Subscription getSubscription(int subscriptionId);

	public Vector<Subscription> getSubscriptionVector();

	/**
	 * 
	 * @param subscription
	 */
	public void removeSubscription(Subscription subscription);

	/**
	 * 
	 * @param subscriptionId
	 * @param newSubscription
	 */
	public void replaceSubscription(int subscriptionId, Subscription newSubscription);

	String showRequests();
	String showSubscriptionList();
}