
public class lcmgcd {
	public static void main(String args[])
	{
		int a=12;int b=3;int answer =1;int i=2,j=2;int gcd=1;
		for(i=2;i<=Math.min(a, b);i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					break;
			}
			if(j<i)
				continue;
			if(a%i==0&&b%i==0)
			{
				answer=answer*i;gcd=gcd*i;
				a=a/i;
				b=b/i;
				i--;
			}
			else if(a%i==0)
			{
				answer=answer*i;
				a=a/i;
				i--;
			}
			else if(b%i==0)
			{
				answer=answer*i;
				b=b/i;
				i--;
			}	
		}
		System.out.println(answer*a*b);
		System.out.println(gcd);;
	}

}
