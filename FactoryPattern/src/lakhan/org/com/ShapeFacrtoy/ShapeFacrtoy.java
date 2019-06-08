package lakhan.org.com.ShapeFacrtoy;

import lakhan.org.com.Interface.Shape;

public class ShapeFacrtoy {
	private Shape shape;
	public void shapeDrawing(Shape shape){
		this.shape=shape;
		shape.draw();
	}

}
