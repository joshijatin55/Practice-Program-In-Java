package handsOnPrograms;
import java.util.Scanner;
public class CaseConversion {

	public static void main(String[] args) {
		
		char ch;
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a single Character:");
		ch=sc.next().charAt(0);
		temp=(int)ch;
		if((temp>=65&&temp<=90)||(temp>=97&&temp<=122))
		{
			if(temp>=65&&temp<=90)
			{	
			  temp=temp+32;
			  ch=(char)temp;
			  System.out.println(ch);
			}  
			else
			{	
			  temp=temp-32;
			  ch=(char)temp;
			  System.out.println(ch);
			}  
		}
		else
		 System.out.println("Wrong Value Entered!Enter only alphabats character");	
    }

}
