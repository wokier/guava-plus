package com.google.common.plus;

/**
 * Min and max constraints to apply to a value
 * @author francois wauquier
 */
public class IntConstraint {

	int min = Integer.MIN_VALUE;
	int max = Integer.MAX_VALUE;

	public IntConstraint() {
           super();
	}

    public IntConstraint(int min, int max) {
        super();
        this.min = min;
        this.max = max;
    }

	public IntConstraint withMin(int min) {
		this.min = Math.max(this.min, min);
        return this;
	}

	public IntConstraint withMax(int max) {
		this.max = Math.min(this.max, max);
        return this;
	}

	public boolean check(int value) {
		return value >= min && value <= max;
	}

	public int applyTo(int value) {
        return Math.max(min, Math.min(max, value));
	}

}
