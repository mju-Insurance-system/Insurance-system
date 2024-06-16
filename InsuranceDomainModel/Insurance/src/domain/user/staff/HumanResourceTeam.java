package domain.user.staff;


public class HumanResourceTeam extends Staff {

	public EmploymentContract m_EmploymentContract;

	public HumanResourceTeam(String userId, String userPw, String userName, String phoneNumber, String SSN, int age, int department) {
		super(userId, userPw, userName, phoneNumber, SSN, age, department);
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