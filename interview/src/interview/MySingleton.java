package interview;

public class MySingleton {
	private int data;

	private MySingleton() {

	}
 public static MySingleton instance;
 Object ob;
	public static  MySingleton getInstance() {
			if(instance == null) {
				synchronized(instance) {
				instance = new MySingleton();
				}
			}
			return instance;
		
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new  CloneNotSupportedException("dont try to clone me ");
		
	}
	
}
