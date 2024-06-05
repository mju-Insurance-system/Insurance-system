package domain.insurance;

import java.util.Vector;

public class InsuranceDesignListImpl implements InsuranceDesignList {

	private Vector<InsuranceDesign> designVector;
	public InsuranceDesign m_InsuranceDesign;

	public InsuranceDesignListImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param insuranceDesign
	 */
	public void addInsuranceDesign(InsuranceDesign insuranceDesign){

	}

	/**
	 * 
	 * @param insuranceDesignId
	 */
	public InsuranceDesign getInsuranceDesign(int insuranceDesignId){
		return null;
	}

	public Vector<InsuranceDesign> getInsuranceDesignVector(){
		return null;
	}

	/**
	 * 
	 * @param iInsuranceDesignId
	 */
	public void removeInsuranceDesign(int iInsuranceDesignId){

	}

	/**
	 * 
	 * @param targetInsuranceDesignId
	 * @param newInsuranceDesign
	 */
	public void replaceInsuranceDesign(int targetInsuranceDesignId, InsuranceDesign newInsuranceDesign){

	}

}