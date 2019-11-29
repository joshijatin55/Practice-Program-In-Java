package handsOnPrograms;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		int N;
		int temp1=-1,temp2=1,temp3;
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
			   for(int i=1;i<=N;i++)
			    {
			      temp3=temp1+temp2;
			      System.out.print(temp3+" ");
			      temp1=temp2;
			      temp2=temp3;
			    }
			   System.exit(0);
			}	
		 }	
	}
}
