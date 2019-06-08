package lakhan.test;

import lakhan.ShapeMaker.SapeMaker;

public class FacadePatternDemo {
	public static void main(String[] args) {
		SapeMaker shapeMaker = new SapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSqure();
		}
		
}
