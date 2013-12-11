package com.google.common.plus;

import org.fest.assertions.Assertions;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * @author francois wauquier
 */
public class EnumPlusTest {

	enum MyEnum {
		IN, OUT
	}

	@Test
	public void testToNameOrNull() throws Exception {
		assertThat(EnumPlus.toNameOrNull(null)).isNull();
		assertThat(EnumPlus.toNameOrNull(MyEnum.IN)).isEqualTo("IN");

	}
}
