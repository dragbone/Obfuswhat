import java.lang.reflect.Method;

public class _ {
	// valid identifiers: $ _ ¢ £ ¤ ¥ ֏ ؋ ৲ ৳ ৻ ૱ ௹ ฿ ៛ ‿ ⁀ ⁔ ₠ ₡ ₢ ₣ ₤ ₥ ₦ ₧ ₨
	// ₩ ₪ ₫ € ₭ ₮ ₯ ₰ ₱ ₲ ₳ ₴ ₵ ₶ ₷ ₸ ₹ ₺ ꠸ ﷼ ︳ ︴ ﹍ ﹎ ﹏ ﹩ ＄ ＿ ￠ ￡ ￥ ￦
	// side note: there are three dollar symbols (o.O)
	_[] _ = {
			this
	};

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
		Object _this = call(this, ︳︳︳︳︳︳︳);
		Object obj = call(_this, ︳︳︳︳︳︳︳︳︳);
		Object sy = subSeq(call(getMethod(obj, ︳︳︳︳︳︳︳ << ︳︳︳ | ︳︳︳︳︳), ︳︳︳︳︳), ︳︳, ︳︳︳︳);
		Object st = subSeq(call(getMethod(obj, ︳︳︳︳), ︳︳︳︳︳), ︳︳︳︳, ︳︳︳︳︳︳);
		Object em = subSeq(call(getMethod(obj, ︳︳︳︳︳︳︳ << ︳︳︳ | ︳︳︳︳), ︳︳︳︳︳), ︳︳︳, ︳︳︳︳︳);
		Object javalang = subSeq(getName(obj), ︳︳︳︳︳︳︳︳︳︳, ︳︳︳︳︳︳︳︳ | ︳︳);
		Object javaLangSystem = concat(concat(concat(javalang, sy), st), em);

		//System.out.println();

		Object H = call(subSeq(call(getMethod(obj, 68), 5), 0, 1), 65);
		Object e = subSeq(call(getMethod(_this, 5), 5), 1, 2);
		Object lo = call(subSeq(call(getMethod(call(obj, 2), 63), 5), 2, 4), 64);
		Object hello = concat(concat(H, e), concat(subSeq(lo, 0, 1), lo));

		Object space = subSeq(call(call(trycall(call(this, ︳︳︳︳︳︳), 32, ︳, ︳︳︳︳︳︳︳︳︳︳), 0), 9), 1, 2);

		Object W = call(subSeq(call(getMethod(_this, 62), 5), 2, 3), 65);
		Object or = subSeq(call(getMethod(obj, 0), 5), 1, 3);
		Object ld = subSeq(call(getMethod(obj, 31), 5), 14, 16);
		Object world = concat(W, concat(or, ld));
		
		call(((Class<?>) call(Class.class, ︳︳︳︳︳︳︳︳︳︳, javaLangSystem)).getFields()[︳].get(null), ︳︳︳, concat(hello, concat(space,world)));
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
			‿ = call(‿, ⁀, ৲);
			return ‿;
		} catch (Exception __) {
			‿ = __;
			return ‿;
		} finally {
			‿ = null;
		}
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
