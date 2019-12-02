package handsOnPrograms;
public class PatternProgram1 {

	public static void main(String[] args) {
		
		int ch;
		for(int i=0;i<=5;i++)
		{	
		 ch='A';
		 for(int j=0;j<=5;j++)
		 {
		   if(j<=i)
		   {
			  System.out.print((char)ch);
			  ch++;
		   }
		   else
			  System.out.print(" ");  
		 }
		 System.out.print("\n");
		}

	}

}
