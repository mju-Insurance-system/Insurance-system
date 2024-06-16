package domain.user.staff;

import domain.insurance.InsuranceDesign;
import domain.user.staff.Staff;

public class ManagementDepartment extends Staff {

	public InsuranceDesign m_InsuranceDesign;

	public ManagementDepartment(String userId, String userPw, String userName, String phoneNumber, String SSN, int age, int department) {
		super(userId, userPw, userName, phoneNumber, SSN, age, department);
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