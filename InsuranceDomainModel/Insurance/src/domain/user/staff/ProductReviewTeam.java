package domain.user.staff;

import domain.insurance.Insurance;
import domain.insurance.InsuranceDesign;

public class ProductReviewTeam extends ManagementDepartment {

	public ProductReviewTeam(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param insuranceDesign
	 */
	public double calculateLossRate(InsuranceDesign insuranceDesign){
		return 0;
	}

	/**
	 * 
	 * @param insurance
	 */
	public void resisterInsurance(Insurance insurance){

	}

	/**
	 * 
	 * @param insuranceDesignId
	 * @param description
	 */
	public boolean writeReview(int insuranceDesignId, String description){
		return false;
	}

}