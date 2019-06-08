package lakhan.org.comshape;

import lakhan.org.com.DrawApi.DrawAPI;

public abstract class Shape{
  protected DrawAPI drawapi;
  protected Shape (DrawAPI draApi){
	  this.drawapi=draApi;
	  
  }
  public abstract void darw() ;

}
