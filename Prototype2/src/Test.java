
public class Test {
	static Complex c=new Complex();
	static Complex copyOfComplex(){
		return (Complex)c.clone();
	}
	
	public static void main(String[] arg){
	Complex c1=	copyOfComplex();
	
	
	Test t=new Test();
	
	
		
		System.out.println(c);
		
		System.out.println(c1);
		//System.out.println(c2);
		System.out.println("clone object before changing index 0");
		int[] mycopy=c1.getNums();
		for(int i:mycopy){
			System.out.println(i);
			
		}
		System.out.println("after changimg index 0");
		mycopy[0]=10;
		for(int i:mycopy){
			System.out.println(i);
			
		}
		System.out.println("original object");
		for(int i:t.c.nums){
			System.out.println(i);
			
		}
			
	}

}
