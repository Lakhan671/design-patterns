
public class Complex implements Cloneable{
	/*The prototype is typically used to clone an object, 
	i.e. to make a copy of an object. 
	When an object is complicated or time consuming to be created ,
	you may take prototype pattern to make such object cloneable.
	Assume the Complex class is a complicated,
	you need to implement Cloneable interface and
	override the clone method(protected Object clone()).*/
int nums[]={1,2,3,4,5,67,90};
public Object clone(){
	try{
		return super.clone();
	}catch(CloneNotSupportedException ss){
		System.out.println(ss.getMessage());
		return null;
		
		
	}
}
	public int[] getNums(){
		return nums;
	
	
}
}
