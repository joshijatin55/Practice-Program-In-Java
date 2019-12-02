package handsOnPrograms;

public class PatterProgram2 {

	public static void main(String[] args) {
		
		int num;
		for(int i=1;i<=5;i++)
		{
		   num=6-i;
		   for(int j=1;j<=5;j++)
		   {	   
			  if(j<=6-i)
			  {
				  System.out.print(num);
				  num--;
			  }
			  else
			      System.out.print(" ");
		   }
		   System.out.print("\n");
		}

	}

}
