
public class BoxDum {
	
	double width;
	double height;
	double depth;
	
}
class BoxDem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoxDum b1 = new BoxDum();
		double volume;
		
		b1.width =5;
		b1.height =6;
		b1.depth =7;
		
		 volume = b1.width *b1.height *b1.depth;
		 System.out.println("volume of box b1 is "+volume);
		 
		 
		BoxDum b2;
		 b2 = new BoxDum();
		 b2.width =10;
	     b2.height =5;
		 b2.depth =6;
		 
		 volume = b2.width *b2.height *b2.depth;
		 System.out.println("volume of box b2 is "+volume);
	}

}
