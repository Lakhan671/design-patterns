import java.util.Hashtable;


public class ShapeCache {
	private static Hashtable<String, Shape> shapeMape=new Hashtable<String, Shape>();
	static Shape getShape(String shapeId){
		Shape cacheShape=shapeMape.get(shapeId);
		
		return (Shape)cacheShape.clone();
		
	}
	public static void loadcache(){
		Circle circle=new Circle();
		circle.setId("201");
		shapeMape.put(circle.getId(),circle);
		Square square=new Square();
		square.setId("202");
		shapeMape.put(square.getId(),square);
		
		Rectangle rectangle=new Rectangle();
		rectangle.setId("202");
		shapeMape.put(rectangle.getId(),rectangle);
		
	}
	
	}


