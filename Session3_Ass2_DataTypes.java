import java.util.Scanner;


/*
 * Write a Java statement to assign the value true to the boolean variable same ,
when the String variable S1 has the same contents as the String variable S2 ,
and false otherwise


if s1 equals s2
boolean same=true;

else 
false

*/

public class Session3_Ass2_DataTypes {
 public static void main(String args[])
	{
		String S1=null,S2=null ;
		boolean same=false;
		
		System.out.println("Enter Two Strings");
		
		Scanner scan=new Scanner(System.in);
		S1=scan.nextLine();
		S2=scan.nextLine();
		
		
		if(S1.length()== 0 || S2.length()==0)
		{
			  S1=null;
			  S2=null;

				same=true;
				
			  System.out.println(" Both are null. boolean same = " +same);
			
		}
		else if(S1.equalsIgnoreCase(S2))
		{
			
			same=true;
			System.out.println(" Value : " +same);
			
		}
		else
		{
			System.out.println(" Value : " +same);
			
		}
		 
		
	}

}
