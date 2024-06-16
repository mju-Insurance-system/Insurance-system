package domain.insurance;


import domain.constants.EDisease;
import domain.constants.EInsuranceType;
import domain.constants.ESpecialOption;

public class DiseaseInsurance extends Insurance {

	private EDisease[] guaranteedDisease;

	public DiseaseInsurance(){

	}

	public DiseaseInsurance(String coverage, EInsuranceType eInsuranceType, String insuranceName,
							double interestRate, double liabilityLimit, ESpecialOption[] specialOption, EDisease[] guaranteedDisease) {
		super(coverage, eInsuranceType, insuranceName, interestRate, liabilityLimit, specialOption);
		this.guaranteedDisease = guaranteedDisease;
	}
}