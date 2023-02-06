
public class BoxDum {
	
	double width;
	double height;
	double depth;

	void  volume() 
	{
	 System.out.print("volume is :");
	 System.out.println(width *height *depth);
	}
}
class BoxDem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BoxDum b1;
		b1 = new BoxDum();
		double volume;
		
		b1.width =5;
		b1.height =6;
		b1.depth =7;
		
		 b1.volume();
		 
		 
		BoxDum b2;
		 b2 = new BoxDum();
		 b2.width =10;
	     b2.height =5;
		 b2.depth =6;
		 
		 b2.volume();
		 
		 BoxDum b3;
		 b3 = b2;
		 b2 = null;
	}

}