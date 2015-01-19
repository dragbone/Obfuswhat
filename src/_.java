import java.lang.reflect.Method;

public class _ {
	int _1 = 1, _2 = 2, _3 = _1 + _2, _7 = _1 << _2 ^ _3, _6 = _7 >> _1 << _1, _8 = _2 << _2, _9 = _1 ^ _8, _4 = _9 >> _1, _5 = _4 ^ _1, _0 = _5 >> _5;

	public static void main(String[] _) throws Exception {
		new _();
	}

	_() throws Exception {
		Object obj = callCastClass(callCastClass(this, _7), _9);
		Object sy = subSeq(call(getMethod(obj, 61), 5), 2, 4);
		Object st = subSeq(call(getMethod(obj, 4), 5), 4, 6);
		Object em = subSeq(call(getMethod(obj, 60), 5), 3, 5);
		Object javalang = subSeq(getName(obj), _0, _8 | _2);
		Object javaLangSystem = concat(concat(concat(javalang, sy), st), em);
		call(((Class<?>) call(Class.class, _0, javaLangSystem)).getFields()[_1].get(null), _3, "Hello World");
	}

	Object concat(Object o1, Object o2) throws Exception {
		Object someString = call(getMethod(o1, 2), 5);
		return call(someString, 32, "%1$s%2$s", new Object[] { o1, o2 });
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
		//System.out.println("Accessing: " + ⁀.getClass() + " (" + ⁀.getClass().getMethods().length + ")[" + ‿ + "]");
		return ⁀.getClass().getMethods()[‿];
	}

	Object call(Object ‿, int ⁀, Object... ৲) throws Exception {
		return getMethod(‿, ⁀).invoke(‿, ৲);
	}
}