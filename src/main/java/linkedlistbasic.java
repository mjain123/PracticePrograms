public class linkedlistbasic {

	public static void main(String[] args) {
		Node last, first;
		int a[] = { 10, 20, 30, 40, 50, 20, 60, 40, 10, 90, 20 };
		Node obj = new Node(a[0]);
		last = obj;
		first = obj;
		for (int i = 1; i < a.length; i++) {
			Node temp = new Node(a[i]);
			last.next = temp;
			last = temp;
		}
		Node ffirst=first;
		while(ffirst!=last)
		{
			Node curr=first;
			while(curr!=last)
			{
				if(curr.d>curr.next.d)
				{
					int temp = curr.d;
					curr.d=curr.next.d;
					curr.next.d=temp;
				}
				curr=curr.next;
			}
			ffirst=ffirst.next;
			
		}
		Node curr = first;
		do {
			System.out.println(curr.d);
			curr = curr.next;
		} while (curr != null);
	}
	
	

}
class Node {
	Node next;
	int d;
	Node(int data) {
		d = data;
	}
}
