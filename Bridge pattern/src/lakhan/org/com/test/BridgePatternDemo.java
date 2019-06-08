package lakhan.org.com.test;
import lakhan.org.com.circle.Circle;
import lakhan.org.com.circle.GreenCircle;
import lakhan.org.com.circle.Redcircle;
import lakhan.org.comshape.Shape;

public class BridgePatternDemo {

	public static void main(String[] args) {
		  Shape redCircle = new Circle(100,100, 10, new Redcircle());
	      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

	      redCircle.darw();
	      greenCircle.darw();
	   }

	}


