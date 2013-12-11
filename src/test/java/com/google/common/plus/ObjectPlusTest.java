package com.google.common.plus;

import com.google.common.base.Objects;
import org.fest.assertions.Assertions;
import org.junit.Test;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.fest.assertions.Assertions.assertThat;

/**
 * @author francois wauquier
 */
public class ObjectPlusTest {

	@Test
	public void testFirstNonNull() {
		assertThat(ObjectPlus.firstNonNull("a")).isEqualTo("a");
		assertThat(ObjectPlus.firstNonNull(null, "a")).isEqualTo("a");
		assertThat(ObjectPlus.firstNonNull(null, "a", "b")).isEqualTo("a");
	}

	@Test(expected = NullPointerException.class)
	public void testFirstNonNull_noValues() {
		ObjectPlus.firstNonNull();
	}

	@Test(expected = NullPointerException.class)
	public void testFirstNonNull_nullValue() {
		ObjectPlus.firstNonNull(null);
	}

	@Test(expected = NullPointerException.class)
	public void testFirstNonNull_allNullValues() {
		ObjectPlus.firstNonNull(null, null);
	}
}
