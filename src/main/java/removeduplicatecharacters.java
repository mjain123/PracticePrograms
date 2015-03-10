
public class removeduplicatecharacters {
	public static void main(String args[])
	{
		String test="hnhi809897";
		int length=test.length()-1;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<=length;j++)
			{
				if(test.charAt(i)==test.charAt(j))
				{
					if(j<length){
					test=test.substring(0,j)+test.substring(j+1,test.length());
					length--;
					j--;}
					else
						{
						test=test.substring(0,j);
						length--;
						j--;
						}	
				}
				
			}
		}
		System.out.println(test);
	}

}
