package handsOnPrograms;
import java.util.Scanner;
public class LargestOfThreeNumber {

	public static void main(String[] args) {
		
		int Num1,Num2,Num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		Num1=sc.nextInt();
		System.out.println("Enter Second Number");
		Num2=sc.nextInt();
		System.out.println("Enter Third Number");
		Num3=sc.nextInt();
		if(Num1>Num2)
		{
			if(Num1>Num3)
			 System.out.println("Largest Number="+Num1);
			else
			 System.out.println("Largest Number="+Num3);
		}
		else if(Num2>Num3)
		  System.out.println("Largest Number="+Num2);
		else
		  System.out.println("Largest Number="+Num3);
		

	}

}
