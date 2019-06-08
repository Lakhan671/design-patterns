package lakhan.org.com.testCalss;

import lakhan.org.com.Interface.Shape;
import lakhan.org.com.ShapeFacrtoy.ShapeFacrtoy;
import lakhan.org.com.model.Rectangle;

public class FactortPatternDemo {
	public static void main(String[] ar){
		ShapeFacrtoy sf=new ShapeFacrtoy();
		Shape shape=new Rectangle();
		sf.shapeDrawing(shape);
	}

}
