package com.ncsu;
import java.util.ArrayList;


public class ArrayListprac {
	static ArrayList <Integer> stack; static int top=-1;
	public static void main(String args[])
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(0, 100);
		numbers.addAll(numbers);
		System.out.println(numbers);
		System.out.println(numbers.lastIndexOf(100));
		System.out.println(numbers.get(2));
		System.out.println(numbers.size());
		Integer i =100;
		numbers.remove(1);
		System.out.println(numbers);

		numbers.remove(i);
		System.out.println(numbers);
		numbers.remove(i);
		numbers.remove(i);
		numbers.remove(i);
		System.out.println(numbers);
		
		stack= new ArrayList<Integer>();
		push(10);
		push(30);
		System.out.println(top());
		System.out.println(pop());
		System.out.println(stack);
		
		

	}
	static void push(int val)
	{
		top++;
		stack.add(val);
		
	}
	static int pop()
	{
		int val = stack.get(top);
		stack.remove(top);
		top--;
		return val;
	}
	static int top()
	{
		return stack.get(top);
	}
}
