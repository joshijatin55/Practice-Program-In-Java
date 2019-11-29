package handsOnPrograms;
import java.util.Scanner;
public class SumOfDigitsWithoutUsingLoops {

	public static void main(String[] args) {
		
		int Num,digit1,digit2,digit3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 3 digit number:");
		Num=sc.nextInt();
		digit1=Num%10;
		Num=Num/10;
		digit2=Num%10;
		Num=Num/10;
		digit3=Num%10;
		System.out.println("Sum of digits="+(digit1+digit2+digit3));
	}

}
