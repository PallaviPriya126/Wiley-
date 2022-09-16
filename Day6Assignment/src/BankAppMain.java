
public class BankAppMain {

	public static void main(String[] args) {
		BankAccount acc1=new BankAccount(101,"Pallavi Priya",AccountType.SAVINGS);
		System.out.println("Total interest is : "+ acc1.calculateTotalInterest(10000.00,5));

	}

}
