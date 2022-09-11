public class Fibonacci {
	int lower,higher;
	
	public Fibonacci(int lower,int higher) {
		this.lower=lower;
		this.higher=higher;
	}
	
 public void series() {
	 int a=lower;
	 int b=lower+1;
	 int c=0;
	 System.out.print(a + " " + b + " "); 
	 for(int i=lower+2;i<=higher;i++) {
		c=a+b;
		 if(c>higher)
			 break;
		 System.out.print(c+" ");
		 a=b;
		 b=c;
	 }
 }
	
	public static void main(String[] args) {
		Fibonacci fibonacci =new Fibonacci(0,50);
		fibonacci.series();
	}
}
