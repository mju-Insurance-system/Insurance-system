package domain.insurance.accident;

import domain.insurance.InsuranceCalculator;
import domain.insurance.InsuranceClaim;
import domain.user.Investigator;
import domain.insurance.PaymentApprovalLetter;
import domain.insurance.Insurance;
import domain.user.User;
import domain.user.staff.RiskCoveringTeam;

import java.io.File;
import java.util.Date;

public class InsuranceAccident {

	private EAccessibleAuthority[] accessibleAuthority;
	private boolean bConclude;
	private boolean bInvestigation;
	private String certificationCode;
	private Insurance claimedInsurance;
	private double claimsReserve;
	private int insuranceAccidentId;
	private double insuranceAmount;
	private File investirgationReport;
	private String liability;
	private String reporterName;
	private String reporterPhone;
	private int riskNumber;
	private int riskRank;
	private String riskType;
	private RiskCoveringTeam staffInCharge;
	public InsuranceCalculator m_InsuranceCalculator;
	public PaymentApprovalLetter m_PaymentApprovalLetter;
	public InsuranceClaim m_InsuranceClaim;

	public InsuranceAccident(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param investigator
	 */
	public void appointInvestigator(Investigator investigator){

	}

	public RiskCoveringTeam assignAccident(){
		return null;
	}

	public void calculateClaimsReserve(){

	}

	/**
	 * 
	 * @param authority
	 */
	public boolean certifyCode(int authority){
		return false;
	}

	/**
	 * 
	 * @param accessing user
	 */
	public boolean checkAuthority(User accessingUser){
		return false;
	}

	/**
	 * 
	 * @param claim
	 */
	public void claim(InsuranceClaim claim){

	}

	public boolean confirmInsured(){
		return false;
	}

	/**
	 * 
	 * @param rank
	 */
	public void determineRank(int rank){

	}

	/**
	 * 
	 * @param reason
	 */
	public void dismissClaim(String reason){

	}

	public Investigator[] getInvestigatorList(){
		return null;
	}

	/**
	 * 
	 * @param liability
	 */
	public void judgeLiability(String liability){

	}

	/**
	 * 
	 * @param pay date
	 * @param payment approval letter
	 */
	public boolean payInsuredAmount(Date payDate, PaymentApprovalLetter paymentApprovalLetter){
		return false;
	}

	/**
	 * 
	 * @param claimed
	 * @param insurance
	 * @param claim
	 */
	public void reviewRisk(User claimed, Insurance insurance, InsuranceClaim claim){

	}

	public File[] searchDocuments(){
		return null;
	}

	public File writeInvestigationReport(){
		return null;
	}

}