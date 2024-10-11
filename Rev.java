import java.util.Scanner;
import java.util.Arrays;
class Rev{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the array elements");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		 System.out.println(Arrays.toString(arr));
		
	}
		
		
		static void reverse(int[]arr){
			int start=0;
		    int	 end=arr.length-1;
			 while(start<end){
				 int temp=arr[start];
			     arr[start]=arr[end];
			     arr[end]=temp;
				 start++;
				 end--;
			
			 }
			}
 	}
