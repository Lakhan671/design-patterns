package lakhan.ShapeMaker;
import lakhan.Interface.Shape;
import lakhan.model.Circle;
import lakhan.model.Square;
import lakhan.model.Rectangle;
public class SapeMaker {
 private Shape circle=null;
 private Shape square=null;
 private Shape rectangle=null;
 public SapeMaker(){
	 circle=new Circle();
	 square=new Square();
	 rectangle= new Rectangle(); 
 }
 public void drawCircle(){
	 circle.draw();
 }
 public void drawSqure(){
	 square.draw();
	 
 }
 public void drawRectangle(){
	 rectangle.draw();
 }
}
