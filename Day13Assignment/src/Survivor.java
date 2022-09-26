import java.awt.List;
import java.util.ArrayList;

public class Survivor {
	public static int findIndex(ArrayList<Integer> arr, int k, int index)
	  {
	    if (arr.size() == 1) {
	    	return arr.get(0);
	      
	    }
	    index = ((index + k) % arr.size());
	    arr.remove(index);
	    return findIndex(arr, k, index);
	  }
		  public static void main(String [] args)
		  {
		    int n = 5; 
		    int k = 2;
		    k--; 
		    int index= 0; 
		    ArrayList<Integer> arr= new ArrayList<Integer>();
		    for (int i = 1; i <= n; i++) {
	            arr.add(i); 
	            }
		    System.out.println( findIndex(arr, k, index));
  
		
}
}