package domain.insurance;

import domain.constants.EInsuranceType;
import domain.constants.ESpecialOption;
import domain.insurance.accident.InsuranceAccident;
import domain.subscription.InsuranceSubscriptionForm;
import domain.subscription.Subscription;

import java.io.Serializable;

public class Insurance implements Serializable {

	protected boolean bEnable;
	protected String coverage;
	protected EInsuranceType eInsuranceType;
	protected double insuranceFormula;
	protected int insuranceId;
	protected String insuranceName;
	protected double interestRate;
	protected double liabilityLimit;
	protected String liabilityReason;
	protected double lossRate;
	protected ESpecialOption[] specialOption;
	protected String surchargeFactor;
	public PremiumCalCulator m_PremiumCalCulator;
	public InsuranceDesign m_InsuranceDesign;
	public Subscription m_Subscription;
	public InsuranceAccident m_InsuranceAccident;
	public InsuranceTypeForm m_InsuranceTypeForm;
	public InsuranceSubscriptionForm m_InsuranceSubscriptionForm;

	public Insurance(){

	}

	public void enableInsurance(boolean bEnable){

	}

	public boolean isbEnable() {
		return bEnable;
	}

	public void setbEnable(boolean bEnable) {
		this.bEnable = bEnable;
	}

	public String getCoverage() {
		return coverage;
	}

	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public EInsuranceType geteInsuranceType() {
		return eInsuranceType;
	}

	public void seteInsuranceType(EInsuranceType eInsuranceType) {
		this.eInsuranceType = eInsuranceType;
	}

	public double getInsuranceFormula() {
		return insuranceFormula;
	}

	public void setInsuranceFormula(double insuranceFormula) {
		this.insuranceFormula = insuranceFormula;
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getLiabilityLimit() {
		return liabilityLimit;
	}

	public void setLiabilityLimit(double liabilityLimit) {
		this.liabilityLimit = liabilityLimit;
	}

	public String getLiabilityReason() {
		return liabilityReason;
	}

	public void setLiabilityReason(String liabilityReason) {
		this.liabilityReason = liabilityReason;
	}

	public double getLossRate() {
		return lossRate;
	}

	public void setLossRate(double lossRate) {
		this.lossRate = lossRate;
	}

	public ESpecialOption[] getSpecialOption() {
		return specialOption;
	}

	public void setSpecialOption(ESpecialOption[] specialOption) {
		this.specialOption = specialOption;
	}

	public String getSurchargeFactor() {
		return surchargeFactor;
	}

	public void setSurchargeFactor(String surchargeFactor) {
		this.surchargeFactor = surchargeFactor;
	}

	public PremiumCalCulator getM_PremiumCalCulator() {
		return m_PremiumCalCulator;
	}

	public void setM_PremiumCalCulator(PremiumCalCulator m_PremiumCalCulator) {
		this.m_PremiumCalCulator = m_PremiumCalCulator;
	}

	public InsuranceDesign getM_InsuranceDesign() {
		return m_InsuranceDesign;
	}

	public void setM_InsuranceDesign(InsuranceDesign m_InsuranceDesign) {
		this.m_InsuranceDesign = m_InsuranceDesign;
	}

	public Subscription getM_Subscription() {
		return m_Subscription;
	}

	public void setM_Subscription(Subscription m_Subscription) {
		this.m_Subscription = m_Subscription;
	}

	public InsuranceAccident getM_InsuranceAccident() {
		return m_InsuranceAccident;
	}

	public void setM_InsuranceAccident(InsuranceAccident m_InsuranceAccident) {
		this.m_InsuranceAccident = m_InsuranceAccident;
	}

	public InsuranceTypeForm getM_InsuranceTypeForm() {
		return m_InsuranceTypeForm;
	}

	public void setM_InsuranceTypeForm(InsuranceTypeForm m_InsuranceTypeForm) {
		this.m_InsuranceTypeForm = m_InsuranceTypeForm;
	}

	public InsuranceSubscriptionForm getM_InsuranceSubscriptionForm() {
		return m_InsuranceSubscriptionForm;
	}

	public void setM_InsuranceSubscriptionForm(InsuranceSubscriptionForm m_InsuranceSubscriptionForm) {
		this.m_InsuranceSubscriptionForm = m_InsuranceSubscriptionForm;
	}

}
