import java.lang.reflect.Method;

public class _ {
	int _1 = 1, _2 = 2, _3 = _1 + _2, _7 = _1 << _2 ^ _3, _6 = _7 >> _1 << _1, _8 = _2 << _2, _9 = _1 ^ _8, _4 = _9 >> _1, _5 = _4 ^ _1, _0 = _5 >> _5;

	public static void main(String[] _) throws Exception {
		new _();
	}

	_() throws Exception {
		Object obj = callCastClass(callCastClass(this, _7), _9);
		Object sy = subSeq(call(getMethod(obj, 61), _5), _2, _4);
		Object st = subSeq(call(getMethod(obj, _4), _5), _4, _6);
		Object em = subSeq(call(getMethod(obj, 60), _5), _3, _5);
		Object javalang = subSeq(getName(obj), _0, _8 | _2);
		Object javaLangSystem = concat(concat(concat(javalang, sy), st), em);
		call(((Class<?>) call(Class.class, _0, javaLangSystem)).getFields()[_1].get(null), _3, "Hello World");
	}

	Object concat(Object ৲, Object ‿) throws Exception {
		return call(৲, _5 << _2 | _7, ‿);
	}

	Object getName(Object obj) throws Exception {
		return call(obj, _8 | _3);
	}

	Object subSeq(Object ৲, int a, int b) throws Exception {
		return call(৲, _7 << _3 | _3, a, b);
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
		return getMethod(‿, ⁀).invoke(‿, ৲);
	}
}