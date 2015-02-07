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
		Object _this = trycall(this, ︳︳︳︳︳︳︳);
		Object obj = trycall(_this, ︳︳︳︳︳︳︳︳︳);
		Object sy = subSeq(trycall(getMethod(obj, ︳︳︳︳︳︳︳ << ︳︳︳ | ︳︳︳︳︳), ︳︳︳︳︳), ︳︳, ︳︳︳︳);
		Object st = subSeq(trycall(getMethod(obj, ︳︳︳︳), ︳︳︳︳︳), ︳︳︳︳, ︳︳︳︳︳︳);
		Object em = subSeq(trycall(getMethod(obj, ︳︳︳︳︳︳︳ << ︳︳︳ | ︳︳︳︳), ︳︳︳︳︳), ︳︳︳, ︳︳︳︳︳);
		Object javalang = subSeq(getName(obj), ︳︳︳︳︳︳︳︳︳︳, ︳︳︳︳︳︳︳︳ | ︳︳);
		Object javaLangSystem = concat(concat(concat(javalang, sy), st), em);

		Object H = trycall(subSeq(trycall(getMethod(obj, 68), 5), 0, 1), 65);
		Object e = subSeq(trycall(getMethod(_this, 5), 5), 1, 2);
		Object lo = trycall(subSeq(trycall(getMethod(trycall(obj, 2), 63), 5), 2, 4), 64);
		Object hello = concat(concat(H, e), concat(subSeq(lo, 0, 1), lo));

		Object space = subSeq(trycall(trycall(trycall(trycall(this, ︳︳︳︳︳︳), 32, ︳, ︳︳︳︳︳︳︳︳︳︳), 0), 9), 1, 2);

		Object W = trycall(subSeq(trycall(getMethod(_this, 62), 5), 2, 3), 65);
		Object or = subSeq(trycall(getMethod(obj, 0), 5), 1, 3);
		Object ld = subSeq(trycall(getMethod(obj, 31), 5), 14, 16);
		Object world = concat(W, concat(or, ld));
		
		trycall(((Class<?>) trycall(Class.class, ︳︳︳︳︳︳︳︳︳︳, javaLangSystem)).getFields()[︳].get(null), ︳︳︳, concat(hello, concat(space,world)));
	}

	Object concat(Object ৲, Object ‿) throws Exception {
		return trycall(৲, ︳︳︳︳︳ << ︳︳ | ︳︳︳︳︳︳︳, ‿);
	}

	Object getName(Object obj) throws Exception {
		return trycall(obj, ︳︳︳︳︳︳︳︳ | ︳︳︳);
	}

	Object subSeq(Object ৲, int a, int b) throws Exception {
		return trycall(৲, ︳︳︳︳︳︳︳ << ︳︳︳ | ︳︳︳, a, b);
	}

	Object trycall(Object ‿, int ⁀, Object... ৲) {
		try {
			‿ = getMethod(‿, ⁀).invoke(‿, ৲);
			return ‿;
		} catch (Exception _) {
			‿ = _;
			return ‿;
		} finally {
			‿ = null;
		}
	}

	Method getMethod(Object ⁀, int ‿) {
		௹:{ break ௹;} // TURBAN SMILEYS!
		return ⁀.getClass().getMethods()[‿];
	}
}
