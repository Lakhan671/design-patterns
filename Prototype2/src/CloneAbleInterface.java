
public class CloneAbleInterface implements Cloneable{
	String loc;
	String namee;
	public String getNamee() {
		return namee;
	}

	public void setNamee(String namee) {
		this.namee = namee;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	
	
	@Override
	public String toString() {
		return "CloneAbleInterface [loc=" + loc + ", namee=" + namee + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CloneAbleInterface ca=new CloneAbleInterface();
		ca.setLoc("ddd");
		ca.setNamee("lakaha");
		
		System.out.println(ca);
		try{
			
		
		CloneAbleInterface cv= (CloneAbleInterface)ca.clone();
		
		cv.setNamee("lakhan simgh");
		System.out.println(cv);
		}catch(Exception gg){
			System.out.println(gg);
			
			
		}
	}
}
