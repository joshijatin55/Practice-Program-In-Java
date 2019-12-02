package handsOnPrograms;
import java.util.Scanner;
public class SumOfDigitsUsingDoWhile {

	public static void main(String[] args) {
		
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		 System.out.println("Enter a number:");
		 num=sc.nextInt();
		 if(num/100==0||num/10==0)
		 {	 
		    System.out.println("Enter number must be of 3 digits or more");
		    continue;
		 } 
		 else
		 {	 
		  do
		  {
			sum=sum+num%10;
			num=num/10;
		  }
		  while(num!=0);
		  System.out.println("Sum of digits="+sum);
		  System.exit(0);
		 }
		 
		}
		
	}

}
