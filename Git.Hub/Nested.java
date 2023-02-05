
public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				int v = 100;
				int k = 500;
				
				if ( v == 100)   // f1
				{
					if (k < 200)
					{
						System.out.print("inside if is f2");    // f2
								
					}
					else
					{
						System.out.print("else maps to nerest if ie f2");
						System.out.print("else maps to nerest if ie f1");
					}

			}


	}

}
