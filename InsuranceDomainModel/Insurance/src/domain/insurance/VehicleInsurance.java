package domain.insurance;

import domain.constants.EInsuranceType;
import domain.constants.ESpecialOption;
import domain.constants.EVehicleType;
import domain.insurance.Insurance;

public class VehicleInsurance extends Insurance {

	private EVehicleType eVehicleType;
	private String vehicleNumber;

	public VehicleInsurance(){

	}

	public VehicleInsurance(String coverage, EInsuranceType eInsuranceType, String insuranceName,
							double interestRate, double liabilityLimit, ESpecialOption[] specialOption, EVehicleType eVehicleType) {
		super(coverage, eInsuranceType, insuranceName, interestRate, liabilityLimit, specialOption);
		this.eVehicleType = eVehicleType;
	}

	public void callEmergency(){

	}

}