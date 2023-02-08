
public class AccessControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         AccessControDemo obj1= new AccessControDemo();
		
		obj1.a =10;
		obj1.b =20;
		obj1.setC (30);
		    System.out.println("volume of a:"+obj1.a);
		    System.out.println("volume of b:"+obj1.b);
		    System.out.println("volume of c:"+obj1.getC);

	}

}
