package lakhan.factory;

import java.util.HashMap;

import lakhan.Interface.Shape;
import lakhan.model.Circle;

public class ShapeFactory {
	private static final HashMap<String, Shape> circlemap=new HashMap();
    public static Shape getCircle(String color){
    	Circle circle=(Circle)circlemap.get(color);
    	if(circle==null){
    		circle=new Circle(color);
    		circlemap.put(color, circle);
    		System.out.println("creating circle of color:"+color);
    	}
		return circle;
    	
    }
}
