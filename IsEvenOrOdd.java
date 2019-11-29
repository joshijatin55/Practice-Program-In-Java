package handsOnPrograms;
import java.util.Scanner;
public class IsEvenOrOdd {

	public static void main(String[] args) {
		
		int Num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		Num=sc.nextInt();
		if((Num/2)*2==Num)
		 System.out.println("Even Number");
		else
		 System.out.println("Odd Number");
	 }

}
