package domain.user.staff;

import domain.insurance.InsuranceDesign;
import domain.user.staff.Staff;

public class ManagementDepartment extends Staff {

	public InsuranceDesign m_InsuranceDesign;

	public ManagementDepartment(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param insuranceDesignId
	 */
	public InsuranceDesign chooseDesign(int insuranceDesignId){
		return null;
	}

	public InsuranceDesign designInsurance(){
		return null;
	}

	public void showInsurance(){

	}

}