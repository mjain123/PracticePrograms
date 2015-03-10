package com.ncsu;

public class setofstack {
		static int countofvalues=0, i=0;
	public static void main(String[] args) {
		stack obj[]= new stack[4];
		for(int i =0;i<4;i++)
			obj[i]=new stack();
		i=0;
		setofstack.push(10,obj);	
		setofstack.push(20,obj);
		setofstack.push(30,obj);	
		setofstack.push(40,obj);
		setofstack.push(50,obj);
		setofstack.push(60,obj);	
		setofstack.push(70,obj);
		setofstack.push(80,obj);	
		setofstack.push(90,obj);
		setofstack.push(100,obj);	
		setofstack.push(110,obj);
		setofstack.push(120,obj);	
		setofstack.push(130,obj);
		setofstack.push(140,obj);
		setofstack.push(10,obj);	
		setofstack.push(20,obj);
		setofstack.push(30,obj);	
		setofstack.push(40,obj);
		setofstack.push(50,obj);
		setofstack.push(60,obj);	
		setofstack.push(70,obj);
		setofstack.push(80,obj);	
		setofstack.push(90,obj);
		setofstack.push(100,obj);	
		setofstack.push(110,obj);
		setofstack.push(120,obj);	
		setofstack.push(130,obj);
		setofstack.push(140,obj);	
		setofstack.pop(obj);
		setofstack.pop(obj);setofstack.pop(obj);setofstack.pop(obj);setofstack.pop(obj);setofstack.pop(obj);
		setofstack.pop(obj);
		setofstack.pop(obj);setofstack.pop(obj);setofstack.pop(obj);setofstack.pop(obj);setofstack.pop(obj);
		setofstack.pop(obj);
		setofstack.pop(obj);setofstack.pop(obj);setofstack.pop(obj);setofstack.pop(obj);setofstack.pop(obj);
		
	}
	static void push(int data,stack obj[])
	{
		if(countofvalues==10||countofvalues==20||countofvalues==30)
		{
			i++;		
		}
		obj[i].push(data);
		countofvalues++;
	}
	static void pop(stack obj[])
	{
		if(countofvalues==10||countofvalues==20||countofvalues==30)
		{
			i--;		
		}
		obj[i].pop();
		countofvalues--;
	}

}
class stack
{
	int arr[];
	int top;
	stack()
	{
		arr= new int[10];
		top=-1;
	}
	void push(int data)
	{
		arr[++top]=data;
		
	}
	void pop()
	{
		System.out.println(arr[top--]);
		
	}
}
