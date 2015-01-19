public class _ {
	public static void main(String[] _) throws Throwable {
		new _();
		//p(Class.class.getMethods());
	}

	_() throws Exception {
		//﹏(Class.class,0,"java.lang.System")
		﹏(Class.forName("java.lang.System").getFields()[1].get(null), 3, "Hello World.");
	}

	Object ﹏(Object o, int i, Object... s) throws Exception {
		return o.getClass().getMethods()[i].invoke(o, s);
	}
	
	public static void p(Object[] os){
		for(int i=0;i<os.length;++i)
			System.out.println(os[i]);
	}
}