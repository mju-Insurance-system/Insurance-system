package domain.user.staff;

import domain.insurance.accident.InsuranceAccident;
import domain.insurance.InsuranceClaim;

public class RiskCoveringTeam extends Staff {

	public InsuranceAccident m_InsuranceAccident;

	public RiskCoveringTeam(String userId, String userPw, String userName, String phoneNumber, String SSN, int age, int department) {
		super(userId, userPw, userName, phoneNumber, SSN, age, department);
	}


	public void recieveEmergency(){

	}

	public void requestDispatch(){
		
	}

	/**
	 * 
	 * @param insuranceClaim
	 */
	public void reviewClaim(InsuranceClaim insuranceClaim){

	}

	public void viewAllClaim(){

	}

}