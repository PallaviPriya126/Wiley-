 class EmployeeApp implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(101, "John Doe");
		Employee e2 = new Employee(102, "John Doe");
		
		EmployeeApp obj = new EmployeeApp();
		EmployeeApp obj1 = (EmployeeApp) obj.clone();
		System.out.println(obj);
		System.out.println(obj1);
		if(e1.equals(e2)) {
			System.out.println("Objects are equal");
		}
		else {
			System.out.println("Objects are not equal");
		}
		
		System.out.println(e1+" "+e1.hashCode());
		System.out.println(e2+" "+e2.hashCode());
		
//		//Employee e3 = (Employee) e2.clone();
//		e2.empName = "William";
//		System.out.println(e2);
//		System.out.println(e3);
	}
}

