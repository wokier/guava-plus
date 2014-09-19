package com.google.common.plus;

import javax.annotation.Nullable;

/**
 * Enums Plus
 *
 * @see com.google.common.base.Enums
 * @author francois wauquier
 */
public class EnumPlus {

	private EnumPlus() {
	}

	public static String toNameOrNull(@Nullable Enum enumeration) {
		return enumeration == null ? null : enumeration.name();
	}

}
