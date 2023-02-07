public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Person  > 45 old , other wise  young
		/*
		int age =29;
		if  (age>45)
		{
		 System.out.println("old");
	    }
		else
		{ 
		  System.out.println("Young");
		}
		*/
		/*
		//nested if else
		int i=15;
		int j=25 ;
		
		if (i==10) //f1
		{
			 if (j < 20) 
			{
				 System.out.print("inside if ie f2");  // f2
			 }
			 else
			 {
				 System.out.print("else maps to nearest if  ie f2");
			 }
		}
		else
		{
			System.out.print("else maps to nearest if  ie f1");
		}
		*/

		// WAP to calculate division obtained by student   
		//when percentage of marks are given 

		int marks =  55;

		if (marks >60)
			System.out.print("First Division");
		else if (marks>= 50 && marks <=60)
			System.out.print("Second Division");
		else
			System.out.print("Third Division");

	}


}