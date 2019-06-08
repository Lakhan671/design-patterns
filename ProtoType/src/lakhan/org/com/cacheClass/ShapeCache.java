package lakhan.org.com.cacheClass;

import  lakhan.org.com.model.Rectangle;
import java.util.Hashtable;

import lakhan.org.com.Interface.Shape;
import lakhan.org.com.model.Circle;
import lakhan.org.com.model.Square;

 
public class ShapeCache {
	private static Hashtable<String, Shape> shapeMap 
    = new Hashtable<String, Shape>();

 public static Shape getShape(String shapeId) {
    Shape cachedShape = shapeMap.get(shapeId);
    return (Shape) cachedShape.clone();
 }

 // for each shape run database query and create shape
 // shapeMap.put(shapeKey, shape);
 // for example, we are adding three shapes
 public static void loadCache() {
    Circle circle = new Circle();
    circle.setId("1");
    shapeMap.put(circle.getId(),circle);

    Square square = new Square();
    square.setId("2");
    shapeMap.put(square.getId(),square);
      
    Rectangle rect=new Rectangle();
      rect.setId("3");
      shapeMap.put(rect.getId(), square);
    
 }

}
