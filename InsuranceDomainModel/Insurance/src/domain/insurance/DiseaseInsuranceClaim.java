package domain.insurance;

public class DiseaseInsuranceClaim extends InsuranceClaim {

	private String diagnosticName;
	private String outbreakOrgan;
	private String sickSpot;
	private String treatingHospitalAddress;

	public DiseaseInsuranceClaim(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}