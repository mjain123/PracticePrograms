package com.ncsu;

public class htwt {

	public static void main(String[] args) {
		int arr[][]={{10,3},{15,8},{7,5},{12,6},{5,2},{10,9}};
		htwt h1=new htwt();
		h1.sort(arr);
		
	}
	void sort(int a[][])
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i][0]>a[j][0])
				{
					int temp=a[j][0];
					a[j][0]=a[i][0];
					a[i][0]=temp;
				}
			}
			System.out.println(a[i][1]);
			
		}
		int y=max(a,0,0);
		System.out.println(y);
		
	}
	int max(int a[][], int i,int prev)
	{
		if(i<a.length-1)
		{
			if(a[prev][1]<a[i+1][1])
				return 1+max(a, i+1,i+1);
			else
				return Math.max(max(a,i+1,prev),max(a,i+1,prev+1));
		}
		return 0;
	}
}
