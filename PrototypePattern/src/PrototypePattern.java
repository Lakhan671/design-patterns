
public class PrototypePattern {
	public static void main(String[] arg){
		Shape cloneShape=(Shape) ShapeCache.getShape("201");
		System.out.println("shape:"+cloneShape.getType());
		Shape cloneShape1=(Shape) ShapeCache.getShape("202");
		System.out.println("shape:"+cloneShape.getType());
		Shape cloneShape3=(Shape) ShapeCache.getShape("203");
		System.out.println("shape:"+cloneShape.getType());
	}

}
