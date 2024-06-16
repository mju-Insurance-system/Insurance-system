package domain.insurance.accident;

import java.util.Vector;

public class InsuranceAccidentListImpl implements InsuranceAccidentList {

	private Vector<InsuranceAccident> insuranceAccidentVector;
	public InsuranceAccident m_InsuranceAccident;

	public InsuranceAccidentListImpl(){
		insuranceAccidentVector = new Vector<>();
	}


	public void addInsuranceAccident(InsuranceAccident insuranceAccident){
		insuranceAccidentVector.add(insuranceAccident);
	}

	public InsuranceAccident getInsuranceAccident(int insuranceAccidentId){
		for (InsuranceAccident accident : insuranceAccidentVector) {
            if (m_InsuranceAccident.getInsuranceAccidentId() == insuranceAccidentId) {
                return accident;
            }
        }
        return null;
	}

	public Vector<InsuranceAccident> getInsuranceAccidentVector(){
		return insuranceAccidentVector;
	}

	
	public Vector<InsuranceAccident> getUnresolvedInsuranceAccidents(){
		Vector<InsuranceAccident> unresolvedAccidents = new Vector<>();
        for (InsuranceAccident accident : insuranceAccidentVector) {
            if (!m_InsuranceAccident.isBConclude()) unresolvedAccidents.add(accident);
        }
        return unresolvedAccidents;
	}

	public void removeInsuranceAccident(int insuranceAccidentId){
		for(InsuranceAccident accident : insuranceAccidentVector) {
			if(accident.getInsuranceAccidentId() == (insuranceAccidentId)) insuranceAccidentVector.remove(insuranceAccidentId);
			else System.out.println("삭제할 값이 없습니다.");
		}
	}

	
	public void replaceInsuranceAccident(int insuranceAccidentId, InsuranceAccident newInsuranceAccident){
		for (int i = 0; i < insuranceAccidentVector.size(); i++) {
            if (insuranceAccidentVector.get(i).getInsuranceAccidentId() == insuranceAccidentId) {
                insuranceAccidentVector.set(i, newInsuranceAccident);
                break;
            }
        }
	}

}
