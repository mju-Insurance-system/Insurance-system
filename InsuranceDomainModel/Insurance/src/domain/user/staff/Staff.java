package domain.user.staff;


import domain.user.User;

public class Staff extends User {
	

	protected int age;
	protected int department;
	protected int length_of_service;//고침 
	protected String name;
	protected String phone_number;
	protected String SSN;
	public EmploymentContract m_EmploymentContract;

	public Staff(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public Staff generateStaffAccount(){
		return null;
	}

}