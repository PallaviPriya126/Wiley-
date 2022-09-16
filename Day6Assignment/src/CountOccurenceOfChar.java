
public class CountOccurenceOfChar {

	public static void countChar(String str) {
		//int c=0;
		int arr[]=new int[26];
		
		for(int i=0;i<str.length();i++) {
			char a=str.charAt(i);
			
			arr[a-'a']+=1;
		}
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i)+" "+ arr[str.charAt(i)-'a'] +"  ");
		}
		//return c;
	}
	
	
	public static void main(String[] args) {
		String str="pallavi";
		char ch='a';
		countChar(str);
	//	System.out.print(ch-'a');
			

	}

}
