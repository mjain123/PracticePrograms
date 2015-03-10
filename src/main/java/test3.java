// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
import java.util.*;
public class test3
{
 //METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
 public static int grayCheck(byte term1, byte term2){
  // INSERT YOUR CODE HERE
  int check = 0;
  long c = term1^term2;
  //System.out.println(c);
  if(c<0)
  c=c*-1;
  int i=1;

  while(i<=c)
  {
      if(i==c)
      {

          check = 1;
      }
      i=i*2;
  }

  return check;
 }
// METHOD SIGNATURE ENDS

// DO NOT IMPLEMENT THE main( ) METHOD
 public static void main(String[] args) 
 {
      // PLEASE DO NOT MODIFY THIS FUNCTION
      // YOUR FUNCTION SHALL BE AUTOMATICALLY CALLED AND THE INPUTS FROM HERE SHALL BE PASSED TO IT
      byte term1=(byte)(10),term2=(byte)(11);
      int out;
      // ASSUME INPUTS HAVE ALREADY BEEN TAKEN
      out = grayCheck(term1,term2);
      System.out.println(out);
      //Print the output
 }
}