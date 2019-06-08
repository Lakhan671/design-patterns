package lakhan.org.com.coldDrink;

import lakhan.org.com.Interface.Item;
import lakhan.org.com.Interface.Packing;
import lakhan.org.comWrapperAndBottle.Bottle;

public abstract class ColdDrink implements Item{

	
	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();
}
