package domain.user.staff;

import domain.insurance.InsuranceDesign;

public class ProductManagementTeam extends ManagementDepartment {


	public ProductManagementTeam(String userId, String userPw, String userName, String phoneNumber, String SSN, int age, int department) {
		super(userId, userPw, userName, phoneNumber, SSN, age, department);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param insuranceId
	 */
	public InsuranceDesign redesign(int insuranceId){
		return null;
	}

}