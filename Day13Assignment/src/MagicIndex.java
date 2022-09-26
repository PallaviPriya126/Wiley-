
public class MagicIndex {
	public static int magicIndex(int[]arr,int i) {
		if(arr[i]==i)
			return i;
		return magicIndex(arr, i+1);
		
		
	}
	public static void main(String[]args) {
		int arr[]= {1,2,3,4,5,6,6,7,8};
		System.out.print(magicIndex(arr,0));
	}

}
