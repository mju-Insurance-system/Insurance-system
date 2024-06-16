package domain.insurance;

import java.io.*;
import java.util.Vector;

public class InsuranceListImpl implements InsuranceList {

	private Vector<Insurance> insuranceVector;

	private static final String FILE_NAME = "insuranceList.dat";
	private static final String FILE_PATH = "data" + File.separator + FILE_NAME;



	public InsuranceListImpl(){
		insuranceVector = new Vector<>();
		loadInsurances();
	}

	private void loadInsurances() {
		File dataDir = new File("data");
		if (!dataDir.exists()) {
			dataDir.mkdir();
		}
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
			insuranceVector = (Vector<Insurance>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			insuranceVector = new Vector<>();
		}
	}

	private void saveInsurances(){
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
			oos.writeObject(insuranceVector);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param insurance
	 */
	public void addInsurance(Insurance insurance){
		insuranceVector.add(insurance);
		saveInsurances();
	}

	/**
	 * 
	 * @param insuranceId
	 */
	public Insurance getInsurance(int insuranceId){
		for (Insurance insurance : insuranceVector){
			if (insurance.getInsuranceId() == insuranceId){
				return insurance;
			}
		}
		return null;
	}

	public Vector<Insurance> getInsuranceVector(){
		return insuranceVector;
	}

	/**
	 * 
	 * @param insuranceId
	 */
	public void removeInsurance(int insuranceId){
		insuranceVector.removeIf(insurance -> insurance.getInsuranceId() == insuranceId);
		saveInsurances();
	}

	/**
	 * 
	 * @param insuranceId
	 * @param newInsurance
	 */
	public void replaceInsurance(int insuranceId, Insurance newInsurance) {
		for (int i = 0; i < insuranceVector.size(); i++) {
			if (insuranceVector.get(i).getInsuranceId() == insuranceId) {
				insuranceVector.set(i, newInsurance);
				return;
			}
		}
	}

}