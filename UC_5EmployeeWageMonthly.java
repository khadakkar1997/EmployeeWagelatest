package EmployeeWage;

public class UC_5EmployeeWageMonthly {
	
	int empCheck = (int) (Math.floor(Math.random()*10)%3);
	static final int fullTime=1;
	static final int partTime=2;
	int ratePerHr=20;
	int salary;
	int empHrs=0;
	static int TotalDays=20;

	public void empChecking() {
		int TotalSalary=0;
		for(int i=1;i<=TotalDays;i++)
		{		
			int empCheck=(int) (Math.floor(Math.random()*10)%3);
			switch(empCheck)
			{
			case fullTime:
				empHrs=8;
				salary=empHrs*ratePerHr;
				break;
			case partTime:
				empHrs=4;
				salary=empHrs*ratePerHr;
				break;
			default:
				empHrs=0;
			}
			TotalSalary=TotalSalary+salary;
		}
		System.out.println("Employee Wage: "+TotalSalary);
	}

	public static void main(String[] args) {
		UC_5EmployeeWageMonthly e = new UC_5EmployeeWageMonthly ();
		e.empChecking();
	}
		
	}


