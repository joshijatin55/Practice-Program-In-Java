package handsOnPrograms;
import java.util.Scanner;
public class AddTwoNumbers {
      
	//New Added Comment
	public static void main(String[] args)
	{
		float number1,number2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		number1=sc.nextFloat();
		System.out.println("Enter the second number:");
		number2=sc.nextFloat();
		System.out.println("Sum ="+ (number1+number2));
	}
}
