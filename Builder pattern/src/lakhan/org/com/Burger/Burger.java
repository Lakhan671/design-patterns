package lakhan.org.com.Burger;

import lakhan.org.com.Interface.Item;
import lakhan.org.com.Interface.Packing;
import lakhan.org.comWrapperAndBottle.Wrapper;

public abstract class Burger implements Item{
	 @Override
	   public Packing packing() {
	      return new Wrapper();
	   }

	   @Override
	   public abstract float price();
}
