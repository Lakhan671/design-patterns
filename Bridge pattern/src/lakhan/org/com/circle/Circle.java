package lakhan.org.com.circle;

import lakhan.org.com.DrawApi.DrawAPI;
import lakhan.org.comshape.Shape;

public class Circle extends Shape{
 private int x,y,radius;
	public Circle(int x,int y,int radius,DrawAPI draApi) {
		super(draApi);
		this.x=x;
		this.y=y;
		this.radius=radius;
		
	}

	@Override
	public void darw() {
		drawapi.drawCircle(radius,x,y);	
		
	}

}
