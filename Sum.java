/*sGiven an array arr. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.*/
import java.util.Scanner;
import java.util.Arrays;
class Sum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("enter array ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
			
		sum(arr);
		
		
		
		
	}
		static void sum(int[] arr){
			for(int i=1;i<arr.length;i++){
			arr[i]=arr[i-1]+arr[i];
			
			
			
	    }
		System.out.println(Arrays.toString(arr));
		
		
			
		}
}
		
	