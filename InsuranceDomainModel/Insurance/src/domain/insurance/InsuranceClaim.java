package domain.insurance;

import java.io.File;
import java.util.Date;
import java.util.List;

public class InsuranceClaim {

	protected Date accidentDate;//고침
	protected int accidentLevel;
	protected String accidentLocation;
	protected int claimedAmount;
	protected String [] claimTerms;
	protected String insurantName;
	protected String insurantPhone;
	protected String insurantSSN;
	protected String job;
	protected File medicalCertificate;
	protected List<File> otherDocuments;
	protected String otherInsurances;
	protected int paymentAccount;
	protected boolean[] termsConsent;

	public InsuranceClaim(){

	}

	public void finalize() throws Throwable {

	}

}