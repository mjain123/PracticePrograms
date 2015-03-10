
public class Treebasic {
		static Node2 root;
	public static void main(String[] args) {
		root=null;
		Treebasic t1=new Treebasic();
		for(int i = 10;i<15;i++)
		{t1.insertnode(i*10);}
		t1.insertnode(20);t1.insertnode(140);t1.insertnode(30);t1.insertnode(1);
		System.out.println("Inorder display");
		t1.display(root);
	}
	void display(Node2 curr) 
	{
		if(curr==null)
			return;
		else
		{
			display(curr.l);
			System.out.println(curr.data);
			display(curr.r);
		}
			
	}
	void insertnode(int value)
	{
		Node2 temp= new Node2();
		temp.data=value;
		if(root==null)
			root=temp;
		else
		{
			Node2 curr=root;Node2 parent=null;
			while(curr!=null)
			{
				parent=curr;
				if(temp.data==curr.data)
				{
					System.out.println("Repeated value"+ temp.data);
					return;
				}
				
			else if(temp.data<curr.data)
				{curr=curr.l;
				if(curr==null)
					parent.l=temp;
				}
			else
				{curr=curr.r;
				if(curr==null)
					parent.r=temp;
				}
			}
		
		}
		
	}

}
class Node2
{
	int data;
	Node2 l=null,r=null; 
}
