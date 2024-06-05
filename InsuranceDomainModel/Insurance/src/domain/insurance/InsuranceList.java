package domain.insurance;

import domain.insurance.Insurance;

import java.util.Vector;

public interface InsuranceList {

	/**
	 * 
	 * @param insurance
	 */
	public void addInsurance(Insurance insurance);

	/**
	 * 
	 * @param insuranceId
	 */
	public Insurance getInsurance(int insuranceId);

	public Vector<Insurance> getInsuranceVector();

	/**
	 * 
	 * @param insuranceId
	 */
	public void removeInsurance(int insuranceId);

	/**
	 * 
	 * @param insuranceId
	 * @param insurance
	 */
	public void replaceInsurance(int insuranceId, Insurance insurance);

}