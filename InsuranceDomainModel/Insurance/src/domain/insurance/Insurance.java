package domain.insurance;

import domain.constants.EInsuranceType;
import domain.constants.ESpecialOption;
import domain.constants.Selectable;
import domain.insurance.accident.InsuranceAccident;
import domain.subscription.InsuranceSubscriptionForm;
import domain.subscription.Subscription;

import java.io.Serializable;
import java.util.Arrays;

public class Insurance implements Serializable, Selectable {

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
	private static final String policy = "1. (보험계약의 성립) 보험계약(이하「계약」이라합니다)은 보험계약자의 청약\n" +
			"과 우리회사 (이하「회사」라 합니다)의 승낙으로 이루어집니다. " +
			"회사는 계약의 청약을 받고 보험료 전액 또는 제1회 보험료(일정기간 단위의\n" +
			"분할 보험료)를 받은 경우에 청약일로부터 30일 이내에 승낙 또는 거절의 통지\n" +
			"를 하며, 통지가 없으면 승낙한 것으로 봅니다. 또한 회사가 청약을 승낙한 때에\n" +
			"는 지체없이 보험증권을 보험계약자에게 교부하며, 청약을 거절한 때에는 납입\n" +
			"한 보험료를 받은 기간에 대하여 이 보험의 예정이율+1%<연 9%>의 이율로 계\n" +
			"산한 금액을 더하여 드립니다.\n" +
			" 회사가 보험계약자로부터 계약의 청약과 함께 보험료 상당액의 전부 또는 일\n" +
			"부를 받은 경우에 그 청약을 승낙하기 전에 계약에서 정한 보험사고가 생긴 때\n" +
			"에는 그 청약을 거절할 사유가 없는 한 회사는 계약상의 책임을 집니다. 그러\n" +
			"나 7.에 정한 책임의 시기가 개시하지 아니한 때에는 그러하지 아니합니다.\n" +
			" 이미 성립된 계약을 변경한 경우에는 회사는 보험증권에 그 사실을 기재하거\n" +
			"나 서면으로 알림으로써 보험증권의 교부에 갈음할 수 있습니다. ";

	public Insurance(){

	}

	public Insurance(String coverage, EInsuranceType eInsuranceType,  String insuranceName, double interestRate, double liabilityLimit, ESpecialOption[] specialOption) {
		this.coverage = coverage;
		this.eInsuranceType = eInsuranceType;
		this.insuranceName = insuranceName;
		this.interestRate = interestRate;
		this.liabilityLimit = liabilityLimit;
		this.specialOption = specialOption;
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

	@Override
	public String toString() {
		return "\n" + insuranceId +
				" | " + insuranceName +
				" | " + coverage +
				" | " + eInsuranceType +
				" | " + liabilityLimit +
				" | " + Arrays.toString(specialOption);
	}

	@Override
	public String getMenuName() {
		return toString();
	}

	public String getPolicy() {
		return this.policy;
	}
}
