import java.util.*;

public class Binary{
	public static void main(String[] args){
	int arr[]={1,2,3,4,5};
		int key=4;
		
		int li=0;
		int hi=arr.length-1;
		int mi=(li+hi)/2;
		
		while(li<=mi)
		{
			if(arr[mi]==key)
			{
				System.out.println("element found at index " +mi);
				break;
			}
			
			else if(arr[mi]<key)
			{
				li=mi+1;
			}
			
			else if(arr[mi]>key)
			{
				hi=mi-1;
			}
			
			mi=(li+hi)/2;
		}
	}
}

		