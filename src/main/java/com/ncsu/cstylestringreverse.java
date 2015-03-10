package com.ncsu;

public class cstylestringreverse {

	public static void main(String[] args) {
		String a = "madras/"; 
		StringBuffer rev=new StringBuffer();
		for(int i=a.length()-2;i>=0;i--){
			rev.append(a.charAt(i));
		}
		rev.append("/");
		System.out.println(rev);
		 a = "madras/"; 
		String rev1=new String();
		for(int i=a.length()-2;i>=0;i--){
			rev1=rev1+a.charAt(i);
		}
		rev1=rev1+"/";
		System.out.println(rev);

}
}
// read difference of string and stringbuffer/ builder
//stringbuilder has method setCharAt()..