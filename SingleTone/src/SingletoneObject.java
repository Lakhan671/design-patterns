class lazySingleTon{
	private lazySingleTon(){}
	private static lazySingleTon intance=null;
	public static lazySingleTon getInstance(){
		if(intance==null){
			intance=new lazySingleTon();
		}
	  return intance; 
	}
}
public class SingletoneObject {
	
		public static void main(String[]arg){
			lazySingleTon o1=lazySingleTon.getInstance();
			lazySingleTon o2=lazySingleTon.getInstance();
			System.out.println(o1);
			System.out.println(o2);
			lazySingleTon o3=lazySingleTon.getInstance();
			lazySingleTon o4=lazySingleTon.getInstance();
			System.out.println(o3);
			System.out.println(o4);
		}
	
}
