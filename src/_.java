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
		Object sy = subSeq(call(getMethod(obj, ︳︳︳︳︳︳︳ << ︳︳︳ | ︳︳︳︳︳), ︳︳︳︳︳), ︳︳, ︳︳︳︳);
		Object st = subSeq(call(getMethod(obj, ︳︳︳︳), ︳︳︳︳︳), ︳︳︳︳, ︳︳︳︳︳︳);
		Object em = subSeq(call(getMethod(obj, ︳︳︳︳︳︳︳ << ︳︳︳ | ︳︳︳︳), ︳︳︳︳︳), ︳︳︳, ︳︳︳︳︳);
		Object javalang = subSeq(getName(obj), ︳︳︳︳︳︳︳︳︳︳, ︳︳︳︳︳︳︳︳ | ︳︳);
		Object javaLangSystem = concat(concat(concat(javalang, sy), st), em);

		Object hello = "Hello";
		Object space = subSeq(call(call(trycall(call(this, ︳︳︳︳︳︳), 32, ︳, ︳︳︳︳︳︳︳︳︳︳), 0), 9), 1, 2);
		Object world = "World";
		call(((Class<?>) call(Class.class, ︳︳︳︳︳︳︳︳︳︳, javaLangSystem)).getFields()[︳].get(null), ︳︳︳, concat(concat(hello, space), world));
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

	Object trycall(Object ‿, int ⁀, Object... ৲) {
		try {
			return call(‿, ⁀, ৲);
		} catch (Exception _) {
			return _;
		}
	}

	/**
	 * @param ⁀
	 *            object
	 * @param ‿method
	 *            number
	 * @return method return value cast to Class<?>
	 * @throws Exception
	 */
	Class<?> callCastClass(Object ⁀, int ‿) throws Exception {
		return (Class<?>) call(⁀, ‿);
	}

	/**
	 * @param ⁀
	 *            object
	 * @param ‿
	 *            method number
	 * @return
	 */
	Method getMethod(Object ⁀, int ‿) {
		// System.out.println("Accessing: " + ⁀.getClass() + " (" +
		// ⁀.getClass().getMethods().length + ")[" + ‿ + "]");
		return ⁀.getClass().getMethods()[‿];
	}

	/**
	 * @param ‿
	 *            object
	 * @param ⁀
	 *            method number
	 * @param ৲
	 *            params
	 * @return
	 * @throws Exception
	 */
	Object call(Object ‿, int ⁀, Object... ৲) throws Exception {
		௹: {
			break ௹;
		} // TURBAN SMILEYS!
		return getMethod(‿, ⁀).invoke(‿, ৲);
	}
}
