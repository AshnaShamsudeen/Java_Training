package sortingemployees;

public class Employee1{ //implements Comparable<Employee1>{
	private long employeeId;
	private String employeeName;
	private double salary;
	public Employee1(long employeeId, String employeeName, double salary) {
		//super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
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
	@Override
	public String toString() {
		return "Employee1 [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
//	@Override
//	public int compareTo(Employee1 o) {
//		// TODO Auto-generated method stub
//		return 0;
//	} 

	

}
