package com.google.common.plus;

import com.google.common.base.Objects;

/**
 * Min and max constraints to apply to a value
 *
 * @author francois wauquier
 */
public class IntConstraints {

	int min = Integer.MIN_VALUE;
	int max = Integer.MAX_VALUE;

	public IntConstraints() {
           super();
	}

    public IntConstraints(int min, int max) {
        super();
        this.min = min;
        this.max = max;
    }

	public IntConstraints withMin(int min) {
		this.min = Math.max(this.min, min);
        return this;
	}

	public IntConstraints withMax(int max) {
		this.max = Math.min(this.max, max);
        return this;
	}

	public boolean check(int value) {
		return value >= min && value <= max;
	}

	public int applyTo(int value) {
        return Math.max(min, Math.min(max, value));
	}

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("min",min).add("max",max).toString();
    }
}
