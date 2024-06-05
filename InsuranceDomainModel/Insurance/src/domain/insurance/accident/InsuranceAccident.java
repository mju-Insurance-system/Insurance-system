package domain;

import java.io.File;
import java.util.Date;

public class InsuranceAccident {

	private EAccessableAuthority[] accessableAuthority;

	private boolean bConclud;
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
	

	public EAccessableAuthority[] getAccessableAuthority() {
		return accessableAuthority;
	}

	public void setAccessableAuthority(EAccessableAuthority[] accessableAuthority) {
		this.accessableAuthority = accessableAuthority;
	}

	public boolean isbConclud() {
		return bConclud;
	}

	public void setbConclud(boolean bConclud) {
		this.bConclud = bConclud;
	}

	public boolean isbInvestigation() {
		return bInvestigation;
	}

	public void setbInvestigation(boolean bInvestigation) {
		this.bInvestigation = bInvestigation;
	}

	public String getCertificationCode() {
		return certificationCode;
	}

	public void setCertificationCode(String certificationCode) {
		this.certificationCode = certificationCode;
	}

	public Insurance getClaimedInsurance() {
		return claimedInsurance;
	}

	public void setClaimedInsurance(Insurance claimedInsurance) {
		this.claimedInsurance = claimedInsurance;
	}

	public double getClaimsReserve() {
		return claimsReserve;
	}

	public void setClaimsReserve(double claimsReserve) {
		this.claimsReserve = claimsReserve;
	}

	public int getInsuranceAccidentId() {
		return insuranceAccidentId;
	}

	public void setInsuranceAccidentId(int insuranceAccidentId) {
		this.insuranceAccidentId = insuranceAccidentId;
	}

	public double getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public File getInvestirgationReport() {
		return investirgationReport;
	}

	public void setInvestirgationReport(File investirgationReport) {
		this.investirgationReport = investirgationReport;
	}

	public String getLiability() {
		return liability;
	}

	public void setLiability(String liability) {
		this.liability = liability;
	}

	public String getReporterName() {
		return reporterName;
	}

	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}

	public String getReporterPhone() {
		return reporterPhone;
	}

	public void setReporterPhone(String reporterPhone) {
		this.reporterPhone = reporterPhone;
	}

	public int getRiskNumber() {
		return riskNumber;
	}

	public void setRiskNumber(int riskNumber) {
		this.riskNumber = riskNumber;
	}

	public int getRiskRank() {
		return riskRank;
	}

	public void setRiskRank(int riskRank) {
		this.riskRank = riskRank;
	}

	public String getRiskType() {
		return riskType;
	}

	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

	public RiskCoveringTeam getStaffInCharge() {
		return staffInCharge;
	}

	public void setStaffInCharge(RiskCoveringTeam staffInCharge) {
		this.staffInCharge = staffInCharge;
	}

	public InsuranceCalculator getM_InsuranceCalculator() {
		return m_InsuranceCalculator;
	}

	public void setM_InsuranceCalculator(InsuranceCalculator m_InsuranceCalculator) {
		this.m_InsuranceCalculator = m_InsuranceCalculator;
	}

	public PaymentApprovalLetter getM_PaymentApprovalLetter() {
		return m_PaymentApprovalLetter;
	}

	public void setM_PaymentApprovalLetter(PaymentApprovalLetter m_PaymentApprovalLetter) {
		this.m_PaymentApprovalLetter = m_PaymentApprovalLetter;
	}

	public InsuranceClaim getM_InsuranceClaim() {
		return m_InsuranceClaim;
	}

	public void setM_InsuranceClaim(InsuranceClaim m_InsuranceClaim) {
		this.m_InsuranceClaim = m_InsuranceClaim;
	}
	
	public void appointInvestigator(Investigator investigator){
		
	}

	public RiskCoveringTeam assignAccident(){
		return null;
	}

	public void calculateClaimsReserve(){

	}


	
	public boolean certifyCode(String authority){//String으로 바꿨어요
		for (EAccessableAuthority auth : accessableAuthority) {
            if (auth.equals(authority)) return true;
        }
        return false;
	}

	public boolean checkAuthority(User accessingUser){
		for (EAccessableAuthority auth : accessableAuthority) {
            if (auth == accessingUser.getaccessAuthority()) { //여기 User에서 get, set 해줘야해요
                return true;
            }
        }
        return false;
	}

	public void claim(InsuranceClaim claim){
	}

	public boolean confirmInsured(){
		return false;
	}

	public void determineRank(int rank){
		this.riskRank = rank;
	}

	public void dismissClaim(String reason){

	}

	public Investigator[] getInvestigatorList(){
		return null;
	}


	public void judgeLiability(String liability){
		this.liability = liability;
	}

	public boolean payInsuredAmount(Date payDate, PaymentApprovalLetter paymentApprovalLetter){
		 if (this.insuranceAmount > 0 && paymentApprovalLetter != null) {
	            this.m_PaymentApprovalLetter = paymentApprovalLetter;
	            this.bConclud = true;
	            System.out.println("Payment approved: " + insuranceAmount + payDate);
	            return true;
	        }
	        return false;
	}

	public void reviewRisk(User claimed, Insurance insurance, InsuranceClaim claim){
		
	}

	public File[] searchDocuments(){
		return null;
	}

	public File writeInvestigationReport(){
		this.investirgationReport = new File("investigation_report.txt");
        System.out.println("Investigation report written: " + investirgationReport.getName());
        return this.investirgationReport;
	}

}
