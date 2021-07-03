package EmployeeWage;

public class UC_3EmployeePartTimeWage {
	
	
	int empCheck = (int) (Math.floor(Math.random()*10)%3);
	int fullTime=1;
	int partTime=2;
	int ratePerHr=20;
	int salary;

	public void empChecking() {
		if(empCheck==fullTime) {
			System.out.println("Emloyee is Fulltime");
			int empHrs=16;
			salary=empHrs*ratePerHr;
		}else if(empCheck==partTime) {
			System.out.println("Employee is PartTime");
			int empHrs=8;
			salary=empHrs*ratePerHr;
		}else {
			int empHrs=0;
			System.out.println("Employee is Absent");
		}
		System.out.println("Employee Wage: "+salary);
	}

	public static void main(String[] args) {
		UC_3EmployeePartTimeWage e = new UC_3EmployeePartTimeWage();
		e.empChecking();
	}

}
