package domain.insurance.accident;

import java.util.Vector;

public class InsuranceAccidentListImpl implements InsuranceAccidentList {

	private Vector<InsuranceAccident> insuranceAccidentVerctor;
	public InsuranceAccident m_InsuranceAccident;

	public InsuranceAccidentListImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param insuranceAccident
	 */
	public void addInsuranceAccident(InsuranceAccident insuranceAccident){

	}

	/**
	 * 
	 * @param insuranceAccidentId
	 */
	public InsuranceAccident getInsuranceAccident(int insuranceAccidentId){
		return null;
	}

	public Vector<InsuranceAccident> getInsuranceAccidentVector(){
		return null;
	}

	public Vector<InsuranceAccident> getUnresolvedInsuranceAccidents(){
		return null;
	}

	/**
	 * 
	 * @param insuranceAccidentId
	 */
	public void removeInsuranceAccident(int insuranceAccidentId){

	}

	/**
	 * 
	 * @param insuranceAccidentId
	 * @param newInsuranceAccident
	 */
	public void replaceInsuranceAccident(int insuranceAccidentId, InsuranceAccident newInsuranceAccident){

	}

}