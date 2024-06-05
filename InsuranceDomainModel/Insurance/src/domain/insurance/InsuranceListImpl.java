package domain.insurance;

import java.util.Vector;

public class InsuranceListImpl implements InsuranceList {

	private Vector<Insurance> insuranceVector;
	public Insurance m_Insurance;

	public InsuranceListImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param insurance
	 */
	public void addInsurance(Insurance insurance){

	}

	/**
	 * 
	 * @param insuranceId
	 */
	public Insurance getInsurance(int insuranceId){
		return null;
	}

	public Vector<Insurance> getInsuranceVector(){
		return null;
	}

	/**
	 * 
	 * @param insuranceId
	 */
	public void removeInsurance(int insuranceId){

	}

	/**
	 * 
	 * @param insuranceId
	 * @param insurance
	 */
	public void replaceInsurance(int insuranceId, Insurance insurance){

	}

}