import java.util.*;
public class StringRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		Scanner s= new Scanner(System.in);
		s1=s.next();s2=s.next();
		String s3 = s1+s1;
		if(s3.contains(s2))
		{
			System.out.println("yes");
		}
		
		StringBuffer s4=new StringBuffer("");
		int i=0;
		while(i<s3.length())
		{
			if(!(s3.charAt(i)=='a' || s3.charAt(i)=='e' || s3.charAt(i)=='i' || s3.charAt(i)=='o' || s3.charAt(i)=='u'  ))
			{
				s4.append(s3.charAt(i));
			}
			i++;
		}
		System.out.println(s4);
	}

}
