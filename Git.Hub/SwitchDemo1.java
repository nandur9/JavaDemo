
public class SwitchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int month =Integer.parseInt(args[0]); 
				
				String season="";
				
				switch(month)
				{
				
				case 1:
				    season ="winter";
				    break;
			    case 2:
				    season ="winter";
				    
			    case 3:
				    season ="summer";
				    break;
			    case 4:
				    season ="summer";
				    
			    case 5:
				    season ="summer";
				  
			    case 6:
				    season ="spring";
				    break;
			    case 7:
				    season ="spring";
			    case 8:
				    season ="spring";
				    
			    case 9:
				    season ="autumn";
				    break;
			    case 10:
				    season ="autumn";
				    
			    case 11:
				    season ="autumn";
			     default :
				 
			          System.out.print("Invalid month");
				}
			      
		          System.out.print("season is:"+ season);

			}

		}





