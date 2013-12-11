package com.google.common.plus;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * @author francois wauquier
 */
public class MathsTest {

	@Test
	public void testSum() {
		assertThat(Maths.sum(Lists.newArrayList(1, 2, 3))).isEqualTo(6);
        assertThat(Maths.sum(Lists.newArrayList(Integer.MAX_VALUE, Integer.MAX_VALUE))).isEqualTo(4294967294L);
	}

    @Test
    public void testAverage() {
        assertThat(Maths.average(Lists.newArrayList(1, 2, 3))).isEqualTo(2);
        assertThat(Maths.average(Lists.newArrayList(1, 2))).isEqualTo(1.5d);
        assertThat(Maths.average(Lists.newArrayList(Integer.MAX_VALUE, Integer.MAX_VALUE))).isEqualTo(Integer.MAX_VALUE);

    }




}
