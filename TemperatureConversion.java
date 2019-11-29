package handsOnPrograms;
import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) {
		
		float Celcius_Temp,Fahrenheit_Temp; 
		int ch;       //Ch-->Choice
		Scanner sc=new Scanner(System.in);
		while(true)
		{	
			System.out.print("\n1.Enter 1 for Celcius to Fahrenheit\n2.Enter 2 for Fahrenheit to Celcius\n3.Enter 3 for Exit\n");
			System.out.println("Enter your Choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			 case 1:
				   System.out.println("Enter the Temperature Value in Celcius:");
				   Celcius_Temp=sc.nextFloat();
				   Fahrenheit_Temp=(Celcius_Temp*9/5)+32;
				   System.out.println("Fahrenheit Temperature="+Fahrenheit_Temp);
				   break;
			 case 2:
				   System.out.println("Enter the Temperature Value in Fahrenheit:");
				   Fahrenheit_Temp=sc.nextFloat();
				   Celcius_Temp=(Fahrenheit_Temp-32)*5/9;
				   System.out.println("Celcius Temperature="+Celcius_Temp);
				   break;
			 case 3:
				   java.lang.System.exit(0);
				   break;
			 
			}      
			
		}

	}

}
