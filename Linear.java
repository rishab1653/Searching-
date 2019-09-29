import java.util.*;

public class Linear{
	public static void main(String[] args){
		int size;
		int temp=0;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		for(int i =0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int key = sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("element found at" +i);
				temp=temp+1;
				
			}
			
			
		}
	}
}
