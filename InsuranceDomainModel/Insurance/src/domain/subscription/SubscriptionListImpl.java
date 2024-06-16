package domain.subscription;

import java.io.*;
import java.util.Vector;

public class SubscriptionListImpl implements SubscriptionList {

	private Vector<Subscription> subscriptionVector;
	private static final String FILE_NAME = "subscriptions.dat";
	private static final String FILE_PATH = "data" + File.separator + FILE_NAME;

	public SubscriptionListImpl(){
		subscriptionVector = new Vector<>();
		loadSubscriptions();
	}

	public void addSubscription(Subscription subscription){
		subscriptionVector.add(subscription);
		saveSubscriptions();
	}

	public Subscription getSubscription(int subscriptionId){
		for (Subscription subscription : subscriptionVector) {
			if (subscription.getSubscriptionId() == subscriptionId) {
				return subscription;
			}
		}
		return null;
	}

	public Vector<Subscription> getSubscriptionVector(){
		return subscriptionVector;
	}

	public void removeSubscription(Subscription subscription){
		subscriptionVector.remove(subscription);
		saveSubscriptions();
	}

	public void replaceSubscription(int subscriptionId, Subscription newSubscription){
		for (int i = 0; i < subscriptionVector.size(); i++) {
			if (subscriptionVector.get(i).getSubscriptionId() == subscriptionId) {
				subscriptionVector.set(i, newSubscription);
				saveSubscriptions();
				return;
			}
		}
	}

	@Override
	public String showRequests() {
		String requests = "   |   피보험자   |    보험명   |    가입일    \n";
		for(Subscription subscription : subscriptionVector){
			if(subscription.isBRegistered() == false){
				requests += subscription.toString() + "\n";
			}
		}
		return requests;
	}

	@Override
	public String showSubscriptionList() {
		String subscriptions = "   |   피보험자   |    보험명   |    가입일    \n";
		for(Subscription subscription : subscriptionVector){
			subscriptions += subscription.toString() + "\n";
		}
		return subscriptions;
	}


	private void saveSubscriptions() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
			oos.writeObject(subscriptionVector);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void loadSubscriptions() {
		File dataDir = new File("data");
		if (!dataDir.exists()) {
			dataDir.mkdir();
		}
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
			subscriptionVector = (Vector<Subscription>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			subscriptionVector = new Vector<>();
		}
	}
}
