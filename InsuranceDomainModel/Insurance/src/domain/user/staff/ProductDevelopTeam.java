package domain.user.staff;

import domain.insurance.InsuranceDesign;

public class ProductDevelopTeam extends ManagementDepartment {


	public ProductDevelopTeam(String userId, String userPw, String userName, String phoneNumber, String SSN, int age, int department) {
		super(userId, userPw, userName, phoneNumber, SSN, age, department);
	}


	public InsuranceDesign createInsuranceDesign(){
		return null;
	}

}