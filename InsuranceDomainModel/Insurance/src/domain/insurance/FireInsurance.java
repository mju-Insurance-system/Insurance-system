package domain;


public class DiseaseInsurance extends Insurance {

	private EDisease[] guaranteedDisease;

	public DiseaseInsurance(){
		
	}

	public EDisease[] getGuaranteedDisease() {
		return this.guaranteedDisease;
	}

	public void setGuaranteedDisease(EDisease[] guaranteedDisease) {
		this.guaranteedDisease = guaranteedDisease;
	}

	
}
