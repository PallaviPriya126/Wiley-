public class BankApp {

	public static void main(String[] args) {
		System.out.println("*NOTE* : Opening balance should always be positive.");
		System.out.println();
		BankAccount pallavi = new BankAccount(1, "Pallavi", Math.abs(1000), "Savings");
		BankAccount priya = new BankAccount(2, "Priya", Math.abs(2000), "Savings");
		BankAccount neetish = new BankAccount(3, "Neetish", Math.abs(3000), "Current Account");
		
//		sim.depositAmount(1500);
//		sim.withdrawAmount(500);
//		System.out.println(sim.getCurrentBalance());
//		arihant.depositAmount(700);
//		srushti.depositAmount(5000);
//		BankAccount.displayTotalBalance();
//		arihant.displayAccountDetails();
		
//		sim.withdrawAmount(3500);
//		sim.withdrawAmount(200);
//		System.out.println(sim.getCurrentBalance());
		
		neetish.depositAmount(4000);
		priya.depositAmount(3000);
		pallavi.depositAmount(10000);
		BankAccount.displayTotalBalance();
		priya.withdrawAmount(4600);
		System.out.println(priya.getCurrentBalance());
		neetish.withdrawAmount(6500);
		System.out.println(neetish.getCurrentBalance());
		BankAccount.displayTotalBalance();
		pallavi.displayAccountDetails();
		priya.displayAccountDetails();
		

	}

}
