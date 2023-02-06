import java.io.IOException;

public class Dowhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int num =10;
		do
		{
			System.out.println("Welcome to java programming :"+ num);
			num--;
			
		} while (num>0);
		
		char choice;
		   System.out.println("Do did you learn today");
		do
		{
			System.out.println("1. condition statements");
			System.out.println("2. loops");
			System.out.println("3. push code to remote repository");
			System.out.println("choose one :");
			
		   choice= (char)System. in.read();
			System.out.println("value of choice :"+ choice);
		}
		while(choice < '1' || choice >'3');
		    System.out.println("\n");
		    switch(choice)
		{
		    case'1':
		    	System.out.println("Today we have learned condition statements");
		    	break;
		    case'2':
		    	System.out.println("Today we have learned loops statements");
		    	break;
		    case'3':
		    	System.out.println("Today we have learned git statements");
		    	break;
			
		}
		

	}

}
