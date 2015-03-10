import java.util.*;
import java.io.*;

public class hashmapprac {
	
	 public static void main(String[] args) throws IOException {
		    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		    String s;
		    Hashtable<String,Integer> family = new Hashtable<String,Integer>();
		    s = in.readLine();

		    String array[]= s.split(",");
		    int length = array.length;
		    for(int i =0;i<array.length-1;i++)
		    {
		    	String val1[] = array[i].split("->");
		    	if (family.containsKey(val1[0]))
		    	{
		    		family.put(val1[1], family.get(val1[0])+1);
		    	}
		    	else
				    	{
				    	    family.put(val1[0], 1);
				    	    family.put(val1[1], 2);
				    	}
		    }
		    List<String> output = new ArrayList<String>();
		    
		    for(Map.Entry<String, Integer> entry : family.entrySet()) {
		        String key = entry.getKey();
		        Integer value = entry.getValue();
		        if(value==Integer.parseInt(array[length-1]))
		        output.add(key);
		    }
		    Collections.sort(output);
		    if(output.size()==0)
		    {
		    	System.out.println("No member at level "+ Integer.parseInt(array[length-1]));
		    }
		    else
		    {
		    	System.out.print(output.get(0));
		    	int i=1;
		    	while(i<output.size())
		    	{
		    		System.out.print(",");
		    		System.out.print(output.get(i));
		    		i++;
		    	}
		    }
		    		
	 }
}
