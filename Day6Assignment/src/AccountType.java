
public enum AccountType {
	SAVINGS ,CURRENT;
	
	public double rate(AccountType acc) {
		if(acc.equals(SAVINGS)) {
			return 6.54;
		}
		else {
			return 9;
		}
	}
	
}
