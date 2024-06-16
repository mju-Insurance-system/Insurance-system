package domain.insurance;

import domain.constants.EAccessAuthority;
import domain.insurance.Insurance;

import java.io.Serializable;

public class InsuranceDesign implements Serializable {

	protected EAccessAuthority accessAuthority = EAccessAuthority.STAFF;
	protected double estimatedInsuranceAmount;
	protected double estimatedLossRate;
	private int insuranceDesignId;
	protected String insuranceName;
	protected String insuranceType;
	protected String insuringContents;
	protected String target;

	public InsuranceDesign(){

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