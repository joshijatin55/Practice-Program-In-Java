package handsOnPrograms;
import java.util.Scanner;
public class PercentageCalculation {

	public static void main(String[] args) {
		
		int M1,M2,M3,M4,M5,Total;              //M1-->Marks of Subject 1 and so on
		float Percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks of First Subject:");
		M1=sc.nextInt();
		if(M1<0||M1==0)
		{
		   System.out.println("Error!Enter Positive Marks Value");
		   java.lang.System.exit(0);
		}
		System.out.println("Enter the Marks of Second Subject:");
		M2=sc.nextInt();
		if(M2<0||M2==0)
		{
		   System.out.println("Error!Enter Positive Marks Value");
		   java.lang.System.exit(0);
		}
		System.out.println("Enter the Marks of Third Subject:");
		M3=sc.nextInt();
		if(M3<0||M3==0)
		{
		   System.out.println("Error!Enter Positive Marks Value");
		   java.lang.System.exit(0);
		}
		System.out.println("Enter the Marks of Fourth Subject:");
		M4=sc.nextInt();
		if(M4<0||M4==0)
		{
		   System.out.println("Error!Enter Positive Marks Value");
		   java.lang.System.exit(0);
		}
		System.out.println("Enter the Marks of Fivth Subject:");
		M5=sc.nextInt();
		if(M5<0||M5==0)
		{
		   System.out.println("Error!Enter Positive Marks Value");
		   java.lang.System.exit(0);
		}
		
		Total=M1+M2+M3+M4+M5;
		System.out.println("Total Marks="+Total);
		Percentage=(Total/5);
		System.out.println("Percentage="+Percentage);
		
		

	}

}
