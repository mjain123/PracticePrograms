
public class Stackmin {
//linkedlist stack
	public static void main(String[] args) {
		SStack obj = new SStack();
		
		obj.push(10);
		obj.push(2);;
		obj.push(1);
		obj.push(20);
		obj.push(-5);
		obj.push(20);
		obj.push(3);
		obj.push(20);
		obj.push(5);
		obj.push(20);
		obj.push(-10);
		obj.min();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.min();
		
		obj.pop();
		obj.pop();
		obj.pop();
		obj.min();
		obj.pop();
		obj.pop();
		obj.min();
	
	}
}
class SStack
{
	Node1 top;
	int minimum=1000000;
	void push(int data)
	{
		Node1 temp=new Node1();
		temp.data=data;;
		temp.prev=top;
		top=temp;
		if(minimum>temp.data)
		{	temp.minimum = temp.data;
			minimum = temp.data;
		}
		else
			temp.minimum = minimum;
	}
	void pop()
	{
		
		System.out.println("pop = "+top.data);
		
		top=top.prev;
	}
	void min()
	{
		System.out.println("Minimum = "+top.minimum);
	}
}
class Node1
{
	Node1 prev;
	int data;
	int minimum=0;
}
