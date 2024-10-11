/*swaping array index elements*/
import java.util.Scanner;
import java.util.Arrays;
class Swap{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("enter array ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			
			
		}
		System.out.println(Arrays.toString(arr));
		swap(arr,2,1);
		System.out.println(Arrays.toString(arr));
	}
		static void swap(int[] arr,int index1,int index2){
			int temp=arr[index1];
			arr[index1]=arr[index2];
			arr[index2]=temp;
			
		}
}
		