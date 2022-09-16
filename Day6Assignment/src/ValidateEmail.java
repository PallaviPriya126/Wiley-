import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
class EmailException extends Exception{
	EmailException(String str){
		super();
	}
}


public class ValidateEmail extends RuntimeException{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your email id : ");
		String s=sc.nextLine();
		try {
			
			    {
			        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
			                            "[a-zA-Z0-9_+&*-]+)*@" +
			                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
			                            "A-Z]{2,7}$";
			                              
			        Pattern pat = Pattern.compile(emailRegex);
			        if (s == null) {
			        	 String msg = "Email is invalid";
			        	 throw new EmailException(msg);
			        	 
			        }
			        	 else if(pat.matcher(s).matches()==false) {
			        		 String msg = "Email is invalid";
			          throw new EmailException(msg);}
			           // return false;
			       // return pat.matcher(email).matches();
			    
			        else {
			        	System.out.print("Your email address is valid");
			        }
			    }
		}
		catch(EmailException e){
			e.printStackTrace();
		}

	}

}
