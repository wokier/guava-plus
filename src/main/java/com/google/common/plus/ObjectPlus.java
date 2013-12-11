package com.google.common.plus;


/**
 * Objects Plus
 *
 * @see com.google.common.base.Objects
 * @author francois wauquier
 */

public class ObjectPlus {

	private ObjectPlus() {
	}

	public static <T> T firstNonNull(T... values) {
		for (T value : values) {
			if (value != null) {
				return value;
			}
		}
		throw new NullPointerException();
	}

}
