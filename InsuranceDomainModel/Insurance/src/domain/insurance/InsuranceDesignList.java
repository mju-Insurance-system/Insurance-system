package domain.insurance;

import domain.insurance.InsuranceDesign;

import java.util.Vector;

public interface InsuranceDesignList {

	/**
	 * 
	 * @param insuranceDesign
	 */
	public void addInsuranceDesign(InsuranceDesign insuranceDesign);

	/**
	 * 
	 * @param insuranceDesignId
	 */
	public InsuranceDesign getInsuranceDesign(int insuranceDesignId);

	public Vector<InsuranceDesign> getInsuranceDesignVector();

	/**
	 * 
	 * @param iInsuranceDesignId
	 */
	public void removeInsuranceDesign(int iInsuranceDesignId);

	/**
	 * 
	 * @param targetInsuranceDesignId
	 * @param newInsuranceDesign
	 */
	public void replaceInsuranceDesign(int targetInsuranceDesignId, InsuranceDesign newInsuranceDesign);

}