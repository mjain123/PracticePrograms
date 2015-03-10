import java.util.Stack;


public class queueusingstack {
	static Stack<Integer> s1,s2;
	public static void main(String args[])
	{
	 s1= new Stack<Integer>();	
	 s2= new Stack<Integer>();
	 for(int i=0;i<10;i++)
	 {
		 queueusingstack.push(i);
	 }
	 for(int i=0;i<5;i++)
	 {
		 System.out.println(""+queueusingstack.pop());
	 }
	for(int i=0;i<10;i++)
	 {
		 queueusingstack.push(i*5);
	 }
	 System.out.println(""+queueusingstack.pop());
	 for(int i=0;i<10;i++)
	 {
		 System.out.println(""+queueusingstack.pop());
	 }
	}
	static void push(int data )
	{
		s1.push(data);
	}
	static Integer pop()
	{
		if(!s2.isEmpty())
			return (Integer)s2.pop();
		else
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
			if(!s2.isEmpty())
			return (Integer)s2.pop();
		}
		return 0;
	}


	
}
