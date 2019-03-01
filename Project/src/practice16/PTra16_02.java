/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b1 = true;
		byte by1 = 100;
		short s1 = 300;
		char c1 = '日';
		int i1 = 1000;
		long l1 = 2000L;
		float f1 = 3.14F;
		double d1 = 453.592;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください

		Boolean b2=Boolean.valueOf(b1);
		System.out.println(b2);
		Byte by2=Byte.valueOf(by1);
		System.out.println(by2);
		Short s2=Short.valueOf(s1);
		System.out.println(s2);
		Character c2=Character.valueOf(c1);
		System.out.println(c2);
		Integer i2=Integer.valueOf(i1);
		System.out.println(i2);
		Long l2=Long.valueOf(l1);
		System.out.println(l2);
		Float f2=Float.valueOf(f1);
		System.out.println(f2);
		Double d2=Double.valueOf(d1);
		System.out.println(d2);




	}
}
