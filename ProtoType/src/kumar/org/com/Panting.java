package kumar.org.com;

public class Panting {
	 static void paint(Shape s){
	        if ( s instanceof Rectangle)
	           s.draw();
	           //more job here
	        if (s instanceof Square)
	           s.draw();
	           //more job here
	        if (s instanceof Circle)
	           s.draw();
	           //more job here
	   }
	public static void main(String[] as){
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Square s=new Square();
		paint(r);
		paint(c);
		paint(s);
		
	}

}
