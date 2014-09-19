package com.google.common.plus;

import com.google.common.base.Strings;

/**
 * String Plus
 *
 * @see com.google.common.base.Strings
 * @author francois wauquier
 */
public class StringPlus {

	private StringPlus() {
	}

	public static String capitalize(String value) {
        if(Strings.isNullOrEmpty(value)){
            return value;
        }
		return Character.toTitleCase(value.charAt(0)) + value.substring(1).toLowerCase();
	}

}
