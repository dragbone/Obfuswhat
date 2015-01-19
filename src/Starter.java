import java.lang.reflect.Method;


public class Starter {
	public static void main(String[] args) throws Exception {
		Object out = Class.forName("java.lang.System").getFields()[1].get(null);
		out.getClass().getMethods()[3].invoke(out, "Hello World.");
		
	}
	
	private static void k(Object o) throws Exception{
		o.getClass().getMethods()[3].invoke(o, "Hello World.");
	}
}
