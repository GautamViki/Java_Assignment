package Assignment_Day_5;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	 public void calculateNetSalary(int pfpercentage) {
		 double _netSal=this.salary*pfpercentage/100;
		 this.netSalary=this.salary-_netSal;
	 }
	 public void getEmployeeDetails() {
		 System.out.println("ID : "+employeeId);
		 System.out.println("Name : "+employeeName);
		 System.out.println("Salary : "+salary);
		 System.out.println("Net Salary : "+netSalary);
	 }
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	 
	 

}
