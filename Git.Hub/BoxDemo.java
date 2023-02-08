
class BoxDemo {

   public static void main(String[] args) {
		double volume;
		  Box1 b1 = new Box1();
			
			b1.width =10;
			b1.high =20;
			b1.depth =15;
			 
			volume = b1.volume();
			System.out.println("volume is"+volume);
			
			Box1 b2;
			b2= new Box1();
			 
			b2.width =15;
			b2.hight =5;
			b2.depth =16;
			
			volume =b2.volume();
			System.out.println("volume is"+volume);
			
		}

	}
