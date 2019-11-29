package handsOnPrograms;
import java.util.Scanner;
public class SimpleInterestCalculation {

	public static void main(String[] args) {
		
		float Principal,Rate,Time;
		float Simple_Interest;
		Scanner sc=new Scanner(System.in);
		while(true)	
	   {
		System.out.println("Enter the Principal Value:");
		Principal=sc.nextFloat();
		if(Principal<0||Principal==0)
		{
			 System.out.println("Enter the positive value of Principal");
			 break;
		}	 
		System.out.println("Enter the Rate Value:");
		Rate=sc.nextFloat();
	    if(Rate<0||Rate==0)
		{
			 System.out.println("Enter the positive value of Rate");
			 break;
		}	 
		System.out.println("Enter the Time Value:");
		Time=sc.nextFloat();
	    if(Time<0||Time==0)
	    { 	
			 System.out.println("Enter the positive value of Time");
			 break;
	    }	 
	    else
	    { 	
		     Simple_Interest=(Principal*Rate*Time)/100;
	         System.out.println("Simple Interest="+Simple_Interest);
	         break;
	    }     
	    
		
	   }
		
	}

}
