public class $ {
	public static void main(String[] args) {
		printIndetifierStart();
		new $();
	}

	public $() {
		printMethods(this);
		System.out.println(this.getClass().getSuperclass().getName());
		System.out.println(this.getClass().getSuperclass().getName().subSequence(0, 8 | 2));
	}

	public static void printIndetifierStart() {
		for (int i = Character.MIN_CODE_POINT; i <= Character.MAX_CODE_POINT; i++)
			if (Character.isJavaIdentifierStart(i) && !Character.isAlphabetic(i))
				System.out.print((char) i + " ");
		System.out.println();
	}

	public static void printArray(Object[] os) {
		for (int i = 0; i < os.length; ++i)
			System.out.println(i + ": " + os[i]);
	}

	public static void printMethods(Object o) {
		printMethods(o.getClass());
	}

	public static void printMethods(Class<?> c) {
		System.out.println(c.getName() + ":");
		printArray(c.getMethods());
	}
}
