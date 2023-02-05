
public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       int month = Integer.parseInt(args[0]);
				if (month == 12  || (month >= 1  && month <=2))
				{
					System.out.println("Winter season");
					// Dec,Jan,Feb
				}
				else if (month >2 && month <5)
				{
					System.out.println("Summer season");
					// March,May
					
				}
				else if (month >5 && month <=8)
				{
					System.out.println("Spring season");
					// Jun,July,Aug
					
				}
				else if (month >8 && month <=11)
				{
					System.out.println("Spring Autumn");
					// Sep,Oct,Nov
				}
				else
				{
					System.out.println("Invalid month");
				}
					
					

			}

		}


	


