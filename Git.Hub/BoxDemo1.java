
public class BoxDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double volume;
		
	 Box1 b1 = new Box1();
		b1.width =5;
		b1.height =4;
		b1.depth =6;
		
		volume = b1.width* b1.height* b1.depth;
		
		 System.out.println("volume of box b1 is "+ volume);
		 
		 
		 Box1 b2;
		 b2 = new Box1();
		 b2.width =15;
		 b2.height =5;
		 b2.depth =16;
		 volume = b2.width* b2.height* b2.depth;
		 System.out.println("volume of boxb2 is"+ volume);
		 
		 /*

	double volume ;
	
	       Box1 b1 = new Box1(10,5 ,3); // constructor for a class is called automatically when object is created 
	            volume = b1.volume();
	              System.out.println("Volume is " + volume);

	         Box1 b2 = new Box1(12,4,6);
	            volume = b2.volume(); // volume of object b2
	              System.out.println("Volume is " + volume);
		 
	
	    */

	    
	
	}

}
