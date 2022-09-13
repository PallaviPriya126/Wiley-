
public class EmployeeApp {
	
	public static void sortEmployees(Employee arr[]){
		for(int i=0;i<4;i++) {
			for(int j=0;j<5-i-1;j++) {
			if(arr[j].calculateGrossSalary()>arr[j+1].calculateGrossSalary()) {
				Employee temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		}
		System.out.println("Employees in ascending order of their gross salaries are :");
		for(Employee e:arr) {
			System.out.println(e.empName + "    " + e.calculateGrossSalary()+ "   ");
		}
		System.out.println("*************************************");
	}
	
	
	public static void searchEmployees( Employee arr[],String empDept){
		System.out.println("The employees present in " + empDept+" department are :");
		for(int i=0;i<5;i++) {
			if(arr[i].empDept.equals(empDept)) {
				System.out.print(arr[i].empName + " ");
			}
		}
		//System.out.println("*************************************");
	}

	public static void main(String[] args) {
		Employee arr[]=new Employee[5];
		arr[0]=new Employee(101, "Pallavi", "development", 50000);
		arr[1]=new Employee(102, "Sakshi", "testing", 30000);
		arr[2]=new Employee(103, "Risha", "hr", 35000);
		arr[3]=new Employee(101, "Pallavi", "testing", 40000);
		arr[4]=new Employee(105, "Tanu", "hr", 35000);
	
		if((arr[0].equals(arr[3]))) {
		System.out.println(arr[0].empName + " and " + arr[3].empName +" are equal");
		}
	    else {
	    System.out.println(arr[0].empName + " and " + arr[3].empName +" are  not equal");
	    }
		System.out.println("*************************************");
		//System.out.println(arr[0].calculateGrossSalary());
		sortEmployees(arr);
		searchEmployees(arr,"hr");
		
	}

}
