package com.google.common.plus;

import org.fest.assertions.Assertions;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * @author francois wauquier
 */
public class IntConstraintTest {

	@Test
	public void testApply() throws Exception {
		assertThat(new IntConstraint(1, 3).applyTo(0)).isEqualTo(1);
		assertThat(new IntConstraint(1, 3).applyTo(1)).isEqualTo(1);
		assertThat(new IntConstraint(1, 3).applyTo(2)).isEqualTo(2);
		assertThat(new IntConstraint(1, 3).applyTo(3)).isEqualTo(3);
		assertThat(new IntConstraint(1, 3).applyTo(4)).isEqualTo(3);
	}

    @Test
    public void testWith() throws Exception {
        assertThat(new IntConstraint().withMin(1).withMax(3).applyTo(0)).isEqualTo(1);
        assertThat(new IntConstraint().withMin(1).withMax(3).applyTo(1)).isEqualTo(1);
        assertThat(new IntConstraint().withMin(1).withMax(3).applyTo(2)).isEqualTo(2);
        assertThat(new IntConstraint().withMin(1).withMax(3).applyTo(3)).isEqualTo(3);
        assertThat(new IntConstraint().withMin(1).withMax(3).applyTo(4)).isEqualTo(3);
    }

	@Test
	public void testCheck() throws Exception {
		assertThat(new IntConstraint(1, 3).check(0)).isFalse();
		assertThat(new IntConstraint(1, 3).check(1)).isTrue();
		assertThat(new IntConstraint(1, 3).check(2)).isTrue();
		assertThat(new IntConstraint(1, 3).check(3)).isTrue();
		assertThat(new IntConstraint(1, 3).check(4)).isFalse();
	}
}
