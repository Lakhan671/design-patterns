package EarlySinglTon;
class Early{
	private Early(){}
	static Early obj=new Early();
	public static Early getinstance(){
		
		return obj;
	}
	
}
public class EarlySinglTon {
	public static void main(){
		Early o1=Early.getinstance();
		Early o2=Early.getinstance();
		System.out.println(o1);
	    System.out.println(o2);
	}

}
