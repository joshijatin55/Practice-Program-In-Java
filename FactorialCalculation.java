package handsOnPrograms;
import java.util.Scanner;
public class FactorialCalculation {

	public static void main(String[] args) {
		
		int fact=1,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
	    if(num==0)
		  System.out.println("Factorial=0");
		else if(num<0)
		  System.out.println("Wrong Value Entered");
		else
		{
			for(int i=1;i<=num;i++)	
			  fact=fact*i;
			System.out.println("Factorial="+fact);

		}
	}

}
