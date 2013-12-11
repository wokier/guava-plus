package com.google.common.plus;

import org.fest.assertions.Assertions;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * @author francois wauquier
 */
public class RepeatTest {

    @Test
	public void testRepeatString() throws Exception {
		assertThat(Repeat.repeat(3, "a")).hasSize(3).contains("a", "a", "a");
	}

	@Test
	public void testRepeatInt() throws Exception {
		assertThat(Repeat.repeat(3, 3)).hasSize(3).contains(3, 3, 3);
	}

	@Test
	public void testRepeatLong() throws Exception {
		assertThat(Repeat.repeat(3, 3L)).hasSize(3).contains(3L, 3L, 3L);
	}

	@Test
	public void testRepeatFloat() throws Exception {
		assertThat(Repeat.repeat(3, 3F)).hasSize(3).contains(3F, 3F, 3F);
	}

	@Test
	public void testRepeatDouble() throws Exception {
		assertThat(Repeat.repeat(3, 3D)).hasSize(3).contains(3D, 3D, 3D);
	}
}
