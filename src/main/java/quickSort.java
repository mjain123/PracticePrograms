import java.util.*;
public class quickSort {
	static int arr[]={1,6,3,5,2,7,7,7,2,8,9,11,4,7};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;
		int length = arr.length;
		quickSort(0,length-1);
		for(int i =0;i<length;i++)
			System.out.println(arr[i]);
	}

	private static void quickSort( int start, int end) {
		int pivot = arr[(start+end)/2];
		int i = start;
		int j=end;
		while(i<=j && i>=0)
		{
			while(arr[i]<=pivot)
				i++;
			while(arr[j]>pivot)
				j--;
			if(i<j)
			{
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			i++;
			j--;
		}
		
		if(start<i-1)
		quickSort(start,i-1);
		if(i<end)
		quickSort(i+1,end);
		
	}

}
