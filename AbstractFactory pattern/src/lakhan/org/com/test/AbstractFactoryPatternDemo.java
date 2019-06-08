package lakhan.org.com.test;

import lakhan.org.com.FactoryProducer.FactoryProducer;
import lakhan.org.com.Interface.Shape;
import lakhan.org.com.ShapeAndColorObjectActivity.AbstractFactorys;

public class AbstractFactoryPatternDemo {
public static void main(String[] arg){
	AbstractFactorys af=FactoryProducer.getFactory("shape");
	Shape shape=af.getShape("rectangle");
	shape.draw();
	
}
}
