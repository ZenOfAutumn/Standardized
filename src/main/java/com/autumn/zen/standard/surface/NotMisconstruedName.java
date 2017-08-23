package com.autumn.zen.standard.surface;

// 2、不会误解的名字
public class NotMisconstruedName {

	// 2.1 用min和max表示极限

	public static final int CART_TOO_BIG_LIMIT = 10; // bad
	public static final int MAX_ITEMS_IN_CART = 10; // good

	// 2.2 使用first和last表示包含的范围

	static void displayByte(String str, int first, int last) {
		byte[] strBytes = str.getBytes();
		if (first < 0 || last >= strBytes.length || first > last) {
			throw new ArrayIndexOutOfBoundsException();
		}
		for (int i = first; i <= last; i++) {
			System.out.println(strBytes[i]);
		}
	}

	// 2.3 使用begin表示包含，使用end表示不包含

	// 2.4 布尔值命名
	private boolean hasRead;
	private boolean isMale;
	private boolean canUpdate;
	private boolean shouldChange;

	// 2.5 衡量多个备选名字

}
