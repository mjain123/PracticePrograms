
public class rotatearrayfind {

	public static void main(String[] args) {
		int arr[]={86,90,300,350,375,950,10,11,12,13,14,15,16,17,18,19,20,45,46,47,67,71,80};
		int x=20;
		int start=0;
		int end=arr.length-1;
		int breakpoint=0;
		int mid=0;
		while(true)
		{
			
			mid=(int) Math.ceil((double)(start+end)/2);
			if(arr[mid]>arr[breakpoint])
			{
				start=mid+1;
			}
			else if(arr[mid]<arr[breakpoint])
			{
				end=mid;
			}
			if((end-start)<2)
				break;
		}
		if(arr[mid]<arr[start])
		System.out.println(arr[mid]);
		else
			System.out.println(arr[start]);

	}
}
