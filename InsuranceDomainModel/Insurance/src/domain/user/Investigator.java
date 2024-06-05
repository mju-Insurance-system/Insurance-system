package domain.user;

import domain.insurance.accident.InsuranceAccident;
import domain.user.User;

import java.io.File;

public class Investigator extends User {

	private File investigatorCertificate;
	public InsuranceAccident m_InsuranceAccident;

	public Investigator(){

	}


	/**
	 * 
	 * @param investigationReport
	 */
	public void uploadInvestigationReport(File investigationReport){

	}

}