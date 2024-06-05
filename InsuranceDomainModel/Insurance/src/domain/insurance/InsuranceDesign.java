package domain.insurance;

import domain.insurance.Insurance;

public class InsuranceDesign {

	protected EAccessAuthority[] accessAuthority;
	protected Insurance currentInsurance;
	protected double estimatedInsuranceAmount;
	protected double estimatedLossRate;
	private int insuranceDesignId;
	protected String insuranceName;
	protected String insuranceType;
	protected String insuringContents;
	protected String target;

	public InsuranceDesign(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param insuranceId
	 */
	public boolean abolishInsurance(int insuranceId){
		return false;
	}

	public Insurance resisterInsurance(){
		return null;
	}

}