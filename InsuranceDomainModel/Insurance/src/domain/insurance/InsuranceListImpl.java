package domain.insurance;

import java.io.*;
import java.util.Vector;

public class InsuranceListImpl implements InsuranceList {


	private int nextInsuranceId;
	private Vector<Insurance> insuranceVector;

	private static final String FILE_NAME = "insuranceList.dat";
	private static final String FILE_PATH = "data" + File.separator + FILE_NAME;
	private static final String NEXT_ID_FILE_NAME = "nextInsuranceId.dat";
	private static final String NEXT_ID_FILE_PATH = "data" + File.separator + NEXT_ID_FILE_NAME;

	public InsuranceListImpl(){
		insuranceVector = new Vector<>();
		loadInsurances();
		loadNextId();
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

	private void loadNextId() {
		try (DataInputStream dis = new DataInputStream(new FileInputStream(NEXT_ID_FILE_PATH))) {
			nextInsuranceId = dis.readInt();
		} catch (IOException e) {
			nextInsuranceId = 0;
		}
	}

	private void saveNextId() {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(NEXT_ID_FILE_PATH))) {
			dos.writeInt(nextInsuranceId);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 *
	 * @param insurance
	 */
	public void addInsurance(Insurance insurance){
		insurance.setInsuranceId(nextInsuranceId++);
		insuranceVector.add(insurance);
		saveInsurances();
		saveNextId();
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
		saveNextId();
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
		saveInsurances();
	}

	@Override
	public String toString() {
		return "   |   보험명   |  보장내용  |   보험분류   |   보장한도   |   특약   \n" + insuranceVector;
	}
}
