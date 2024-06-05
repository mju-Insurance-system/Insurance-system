package domain.insurance.accident;

import java.util.Vector;

public interface InsuranceAccidentList {

	/**
	 * 
	 * @param insuranceAccident
	 */
	public void addInsuranceAccident(InsuranceAccident insuranceAccident);

	/**
	 * 
	 * @param insuranceAccidentId
	 */
	public InsuranceAccident getInsuranceAccident(int insuranceAccidentId);

	public Vector<InsuranceAccident> getInsuranceAccidentVector();

	public Vector<InsuranceAccident> getUnresolvedInsuranceAccidents();

	/**
	 * 
	 * @param insuranceAccidentId
	 */
	public void removeInsuranceAccident(int insuranceAccidentId);

	/**
	 * 
	 * @param insuranceAccidentId
	 * @param newInsuranceAccident
	 */
	public void replaceInsuranceAccident(int insuranceAccidentId, InsuranceAccident newInsuranceAccident);

}