package handsOnPrograms;
import java.util.Scanner;
public class TypeOfInputCharacter {

	public static void main(String[] args) {
		
        char Ch;    //Ch-->Character Variable
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Single Character:");
		Ch=sc.next().charAt(0);
	    if(Ch>=48&&Ch<=57)
		 System.out.println("Entered Character is a Digit");
	    else if(Ch>=65&&Ch<=90)
		 System.out.println("Entered Character is a Uppercase Letter");
	    else if(Ch>=97&&Ch<=122)
		 System.out.println("Entered Character is a Lowercase Letter");
		else
		 System.out.println("Entered Character is a digit");
					
		
		

	}

}
