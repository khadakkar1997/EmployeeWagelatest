package EmployeeWage;

public class UC_4SwitchCaseEmployeeWage {
	
	int empCheck = (int) (Math.floor(Math.random()*10)%3);
	static final int fullTime=1;
	static final int partTime=2;
	int ratePerHr=20;
	int salary;
	int empHrs=16;

	public void empChecking() {
		switch(empCheck){
		case fullTime:
			System.out.println("Emloyee is Fulltime");
			empHrs=16;
			salary=empHrs*ratePerHr;
			System.out.println("Employee Wage: "+salary);
			break;
		case partTime:
			System.out.println("Employee is PartTime");
			empHrs=8;
			salary=empHrs*ratePerHr;
			System.out.println("Employee Wage: "+salary);
			break;
		default:
			System.out.println("Employee is Absent");
		}

	}

	public static void main(String[] args) {
		UC_4SwitchCaseEmployeeWage e = new UC_4SwitchCaseEmployeeWage ();
		e.empChecking();
	}

}
