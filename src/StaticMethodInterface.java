/*
 * Java interface static method is similar to default method except that we can’t override them in 
 * the implementation classes.
 */

interface MyData {
	static boolean isNull(String str) {
		System.out.println("Interface isNull");
		
		return str == null ? true : false;
	}
}
public class StaticMethodInterface implements MyData {
	
	boolean isNull(String str) {
		System.out.println("Child class isNull");
		
		return str == null ? true : false;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StaticMethodInterface obj = new StaticMethodInterface();
		System.out.println(MyData.isNull("abc"));
		System.out.println(MyData.isNull(null));
		System.out.println(obj.isNull("abc"));
		System.out.println(obj.isNull(null));
	}

}
