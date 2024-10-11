/*sum of array*/
import java.util.Scanner;
import java.util.Arrays;
class Sumarr{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
			
		sum(arr);
		System.out.println("sum of array is:"+sum(arr));
		
		
		
		
		
		
		
	}
		static int sum(int[] arr){
			int ans=0;
			for(int i=0;i<arr.length;i++){
			ans=arr[i]+ans;
			
	    }
		
		return ans;	
		}
		
}
		
	