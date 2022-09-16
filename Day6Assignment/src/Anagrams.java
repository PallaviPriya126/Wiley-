import java.util.Arrays;

public class Anagrams {
      public static void anagram(String str1,String str2) {
    	  char arr1[]=str1.toCharArray();
    	  char arr2[]=str2.toCharArray();
    	  Arrays.parallelSort(arr1);
    	  Arrays.parallelSort(arr2);
    	  if(Arrays.equals(arr1,arr2)) { 
    		  System.out.print("str1 and str2 are anagrams");}
    	  else {
    	  System.out.print("str1 and str2 are not anagrams");
      }
      }
	public static void main(String[] args) {
		String str1="tea";
		String str2="aet";
		anagram(str1,str2);

	}

}
