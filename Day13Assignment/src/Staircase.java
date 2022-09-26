
public class Staircase {
	public static int countNoOfSteps(int n) {
		if(n==0||n==1)
			return 1;
		if(n<0)
			return 0;
		return(countNoOfSteps(n-1)+countNoOfSteps(n-2)+countNoOfSteps(n-3));
		
		
	}
	public static void main(String[] args) {
		int n=5;
		System.out.print(countNoOfSteps(n));
		
		

	}

}
