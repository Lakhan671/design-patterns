package lakhan.org.com.FactoryProducer;

import lakhan.org.com.Factory.ColorFactory;
import lakhan.org.com.Factory.ShapeAndColorFactory;
import lakhan.org.com.ShapeAndColorObjectActivity.AbstractFactorys;

public class FactoryProducer {
	 public static ShapeAndColorFactory getFactory(String choice){
	      if(choice.equalsIgnoreCase("SHAPE")||choice.equalsIgnoreCase("COLOR")){
	         return new ShapeAndColorFactory();
	      } else {
	         return null;
	      }
	      
	   }

}
