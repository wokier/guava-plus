package com.google.common.plus;

import org.fest.assertions.Assertions;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * @author francois wauquier
 */
public class RangesTest {

	@Test
	public void testRanges() {
        assertThat(Ranges.from0().to(3)).contains(0,1, 2, 3);
        assertThat(Ranges.from(1).to(3)).contains(1, 2, 3);
        assertThat(Ranges.from(1).step(2).to(3)).contains(1,  3);
    }
}
