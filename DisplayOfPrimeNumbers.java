package handsOnPrograms;
import java.util.Scanner;
public class DisplayOfPrimeNumbers {

	public static void main(String[] args) {
		
		int N,x=2,i;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a number:");
			N=sc.nextInt();
			if(N<=0)
			{
				System.out.println("Wrong Value Entered");
				continue;
			}
			else
			{
			    while(N!=0)
			    {
			    	for(i=2;i<x;i++)
			    	 if(x%i==0)
			    	   break;
			    	if(i==x)
			    	{
			    		System.out.println(x);
			    		N--;
			    	}
			    	x++;
			    }
			    System.exit(0);
			}
		}

	}

}
