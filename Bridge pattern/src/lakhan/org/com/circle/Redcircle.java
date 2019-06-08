package lakhan.org.com.circle;

import lakhan.org.com.DrawApi.DrawAPI;

public class Redcircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("drawing red circle"+"radius :"+radius+" x:"+x+" y:"+y);
	}

}
