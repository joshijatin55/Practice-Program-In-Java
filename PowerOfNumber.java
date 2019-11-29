package handsOnPrograms;
import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args) {
		
		int Num,Pow,result=1;
		Scanner sc=new Scanner(System.in);
	    while(true)
	    {
	       System.out.println("Entered a Number:");
	       Num=sc.nextInt();
	       System.out.println("Enter the Exponent of Number:");
	       Pow=sc.nextInt();
	       if(Pow<=0)
	       {
	    	   System.out.println("Wrong Value Entered Of Exponent");
	    	   continue;
	       }
	       else
	       {
	    	   for(int i=1;i<=Pow;i++)
	    		 result=result*Num; 
	    	   System.out.println("Result="+result);
	    	   System.exit(0);	   
	       }
	     }

	}

}
