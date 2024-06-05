package domain.user.staff;


public class HumanResourceTeam extends Staff {

	public EmploymentContract m_EmploymentContract;

	public HumanResourceTeam(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param staff
	 * @param employmentContract
	 */
	public boolean writeEmploymentContract(Staff staff, EmploymentContract employmentContract){
		return false;
	}

}