
public class Box3 {
	double width; 
	double height;  
	double depth;
	
		Box3(double w, double h, double d)
		{
			System.out.println("constructing a box");
			this.width =w;
			this.height =h;
			this.depth =d;
		}
		double volume()
		{
			return width *height *depth;
		}
	}
