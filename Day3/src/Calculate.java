class Loop{
	public void displayNumberWithFor(int num) {
		for(int i=0;i<num;i++) {
		System.out.println(i);
		}
	}
	public void displayNumberWithWhile(int num) {
		while(num!=0) {
		System.out.println(num);
		num--;
		}
	}
	public void displayNumberWithDowhile(int num) {
		do {
		System.out.println(num);
		num--;
		}
		while(num!=0);
	}
	
}


class Switchcase{

	public void selectNumber(int a) {
		int i=a;
		switch(i) {
		case 1:
			System.out.println(i);
			break;
			
		
	case 2:
		System.out.println(i);
		break;
		
	
     case 3:
    	 System.out.println(i);
			break;
	

     case 4:
    	 System.out.println(i);
			break;
     default:
    	    System.out.println("Not in the list");
}
	}
	
}
public class Calculate {
        public int addNumber(int num1,int num2) {
        	return(num1+num2);
        }
        public int substractNumber(int num1,int num2) {
        	return(num1-num2);
        }
        public int highest(int num1,int num2,int num3) {
        	if(num1>num2 && num1>num3) {
        		return num1;
        	}
        	else if(num2>num1 && num3> num2) {
        		return num2;
        	}
        	else
        		return num3;
        }
	public static void main(String[] args) {
		Calculate obj=new Calculate();
		Switchcase obj2 =new Switchcase();
		Loop obj3=new Loop();
		
		System.out.println(obj.addNumber(10, 20));
		System.out.println(obj.substractNumber(20, 10));
		System.out.println(obj.highest(3, -1, 10));
		obj2.selectNumber(1);
		obj3.displayNumberWithFor(5);
		obj3.displayNumberWithWhile(5);
		obj3.displayNumberWithDowhile(5);

	}

}
