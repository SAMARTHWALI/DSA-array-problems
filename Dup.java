/*Find duplicate elements in an array*/
import java.util.Scanner;
import java.util.Arrays;
class Dup{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("enter array ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
			
		dupl(arr);
		
		
		
		
		
		
	}
		static void dupl(int[] arr){
			for(int i=1;i<arr.length;i++){
			if(arr[i]==arr[i-1]){
			System.out.println("duplicate element :"+arr[i]);}
			
			
			
	    }
		
			
		
		
			
		}
}
		
	