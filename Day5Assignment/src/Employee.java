public class Employee {
   int empId;
   String empName;
   String empDept;
   double empBasicSalary, empGrossSalary;
   public Employee(int empId, String empName, String empDept, double empBasicSalary)
   {
	this.empId = empId;
	this.empName = empName;
	this.empDept = empDept;
	this.empBasicSalary = empBasicSalary;
}

   
   public double calculateGrossSalary()
   {
	   double hra=(12*empBasicSalary)/100;
	   double da=(8*empBasicSalary)/100;
	   empGrossSalary=(empBasicSalary+hra+da);
 return empGrossSalary;
   }
   
   @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee) obj;
		if(this.empName == e.empName && this.empId == e.empId) {
			return true;
		}
		return false;
	}
   
   
/*@Override
public boolean equals(Object obj) {
	Employee e=(Employee)obj;
	if((this.empName.compareToIgnoreCase(e.empName)==0) && (this.empId==e.empId ) ) {
		return true;}
	else {
	return false;}
}*/
   
   
}
