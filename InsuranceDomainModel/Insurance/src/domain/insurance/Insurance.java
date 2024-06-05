package domain.insurance;

import domain.insurance.accident.InsuranceAccident;
import domain.subscription.InsuranceSubscriptionForm;
import domain.subscription.Subscription;

public class Insurance {

	protected boolean bEnable;
	protected String coverage;
	protected EInsuranceType eInsuranceType;
	protected double insuranceFormula;
	protected int insuranceId;
	protected String insuranceName;
	protected double interestRate;
	protected double liabliltyLimit;
	protected String liabliltyReason;
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

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param bEnable
	 */
	public void enableInsurance(boolean bEnable){

	}

}