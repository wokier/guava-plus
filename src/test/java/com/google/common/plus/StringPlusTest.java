package com.google.common.plus;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * @author francois wauquier
 */
public class StringPlusTest {

	@Test
	public void testCapitalize() throws Exception {
		assertThat(StringPlus.capitalize("title")).isEqualTo("Title");
        assertThat(StringPlus.capitalize(null)).isNull();
        assertThat(StringPlus.capitalize("")).isEqualTo("");
	}
}
