package lakhan.org.com.Factory;

import lakhan.org.com.ColorModel.Blue;
import lakhan.org.com.ColorModel.Green;
import lakhan.org.com.ColorModel.Red;
import lakhan.org.com.Interface.Color;
import lakhan.org.com.Interface.Shape;
import lakhan.org.com.ShapeAndColorObjectActivity.AbstractFactorys;
import lakhan.org.com.model.Circle;
import lakhan.org.com.model.Rectangle;
import lakhan.org.com.model.Square;

public class ShapeAndColorFactory extends AbstractFactorys {

	@Override
	public Color getColor(String color) {
		
		  if(color == null){
		         return null;
		      }		
		      if(color.equalsIgnoreCase("RED")){
		         return new Red();
		      } else if(color.equalsIgnoreCase("GREEN")){
		         return new Green();
		      } else if(color.equalsIgnoreCase("BLUE")){
		         return new Blue();
		      }
		      return null;
		   }
	

	@Override
	public Shape getShape(String shape) {
		
		 if(shape == null){
	         return null;
	      }		
	      if(shape.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	      } else if(shape.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	      } else if(shape.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      return null;
	}

}
