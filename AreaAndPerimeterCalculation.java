package handsOnPrograms;
import java.util.Scanner;
public class AreaAndPerimeterCalculation {

	public static void main(String[] args) {
		
		int Length,Breadth,Area,Perimeter;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length Value of Rectangle:");
		Length=sc.nextInt();
		if(Length<0||Length==0)
		{	
			System.out.println("Error!Enter the Positive value of Length");
			java.lang.System.exit(0);
		}
		System.out.println("Enter the Breadth Value of Rectangle:");
		Breadth=sc.nextInt();
	    if(Breadth<0||Breadth==0)
		{	
			System.out.println("Error!Enter the Positive value of Breadth");
			java.lang.System.exit(0);
		}
		
		 Area=Length*Breadth;
		 System.out.println("Area="+Area);
		 Perimeter=2*(Length+Breadth);
		 System.out.println("Perimeter="+Perimeter);
		
        

	}

}
