package domain.insurance;

import domain.constants.EAccessAuthority;
import domain.insurance.Insurance;

public class PaymentApprovalLetter {

	private EAccessAuthority accessAuthority;
	private boolean approval;
	private String basis;
	private double claimedInsuranceAmount;
	private Insurance insurance;
	private String insurantJob;
	private String insurantName;
	private double payingInsuranceAmount;
	private int[] referanceRiskRecord;

	public PaymentApprovalLetter(){

	}


	/**
	 * 
	 * @param certificationCode
	 */
	public void checkCode(int certificationCode){

	}

	public boolean getApproval(){
		return false;
	}

}