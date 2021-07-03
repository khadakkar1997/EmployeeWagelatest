package EmployeeWage;

public class UC_6EmployeeWageMonthlywithCondition {
	
	int empCheck = (int) (Math.floor(Math.random()*10)%3);
	static final int fullTime=1;
	static final int partTime=2;
	int ratePerHr=20;
	int salary;
	int empHrs=0;
	static int TotalDays=20;

	public void empChecking() {
		int TotalSalary=0;
		int day=0;
		int noOfHrs=0;
		while(day<TotalDays && noOfHrs<=100)
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
			noOfHrs=noOfHrs+empHrs;
			day++;
		}
		System.out.println("Total No Of Hrs: "+noOfHrs);
		System.out.println("Total Employee Wage: "+TotalSalary);
}

public static void main(String[] args) {
	UC_6EmployeeWageMonthlywithCondition e = new UC_6EmployeeWageMonthlywithCondition();
	e.empChecking();
}

}
