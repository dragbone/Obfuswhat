import java.lang.reflect.Method;

public class _ {
	_[] _ = {this};
	int ︳ = _.length,
			︳︳ = ︳ << ︳, 
			︳︳︳ = ︳ | ︳︳, 
			︳︳︳︳ = ︳ << ︳︳, 
			︳︳︳︳︳ = ︳︳︳︳ | ︳, 
			︳︳︳︳︳︳ = ︳︳︳︳︳ ^ ︳︳︳, 
			︳︳︳︳︳︳︳ = ︳ << ︳︳ ^ ︳︳︳, 
			︳︳︳︳︳︳︳︳ = ︳︳ << ︳︳, 
			︳︳︳︳︳︳︳︳︳ = ︳ ^ ︳︳︳︳︳︳︳︳, 
			︳︳︳︳︳︳︳︳︳︳ = ︳ ^ ︳︳ ^ ︳︳︳ ^ ︳︳︳︳ ^ ︳︳︳︳︳ ^ ︳︳︳︳︳︳ ^ ︳︳︳︳︳︳︳;
	
	public static void main(String[] _) throws Exception {
		new _();
	}

	_() throws Exception {
		Object obj = callCastClass(callCastClass(this, ︳︳︳︳︳︳︳), ︳︳︳︳︳︳︳︳︳);
		Object sy = subSeq(call(getMethod(obj, 61), ︳︳︳︳︳), ︳︳, ︳︳︳︳);
		Object st = subSeq(call(getMethod(obj, ︳︳︳︳), ︳︳︳︳︳), ︳︳︳︳, ︳︳︳︳︳︳);
		Object em = subSeq(call(getMethod(obj, 60), ︳︳︳︳︳), ︳︳︳, ︳︳︳︳︳);
		Object javalang = subSeq(getName(obj), ︳︳︳︳︳︳︳︳︳︳, ︳︳︳︳︳︳︳︳ | ︳︳);
		Object javaLangSystem = concat(concat(concat(javalang, sy), st), em);
		call(((Class<?>) call(Class.class, ︳︳︳︳︳︳︳︳︳︳, javaLangSystem)).getFields()[︳].get(null), ︳︳︳, "Hello World");
	}

	Object concat(Object ৲, Object ‿) throws Exception {
		return call(৲, ︳︳︳︳︳ << ︳︳ | ︳︳︳︳︳︳︳, ‿);
	}

	Object getName(Object obj) throws Exception {
		return call(obj, ︳︳︳︳︳︳︳︳ | ︳︳︳);
	}

	Object subSeq(Object ৲, int a, int b) throws Exception {
		return call(৲, ︳︳︳︳︳︳︳ << ︳︳︳ | ︳︳︳, a, b);
	}

	Class<?> callCastClass(Object ⁀, int ‿) throws Exception {
		return (Class<?>) call(⁀, ‿);
	}

	Method getMethod(Object ⁀, int ‿) {
		// System.out.println("Accessing: " + ⁀.getClass() + " (" +
		// ⁀.getClass().getMethods().length + ")[" + ‿ + "]");
		return ⁀.getClass().getMethods()[‿];
	}

	Object call(Object ‿, int ⁀, Object... ৲) throws Exception {
		௹:{break ௹;} // TURBAN SMILEYS!
		return getMethod(‿, ⁀).invoke(‿, ৲);
	}
}