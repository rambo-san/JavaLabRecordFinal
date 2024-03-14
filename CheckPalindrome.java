import java.io.*;
import java.util.*;
class CheckPalindrome{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	String str;
	System.out.println("Enter the String : ");
	str=s.nextLine().trim();
	System.out.println("Entered String : "+str);
	if(checkPal(str)==1)
		System.out.println("The string is palindrome!");
	else
		System.out.println("The string is not palindrome!");
	}
	
	public static int checkPal(String str){
	char[] rev = str.toCharArray();
	StringBuilder st= new StringBuilder();
	for(int i=rev.length-1;i>=0;i--){
		st.append(rev[i]);
	}
	System.out.println("The string is "+st.toString());

		if(st.toString().equals(str))
			return 1;
		else
			return 0;
	}
}