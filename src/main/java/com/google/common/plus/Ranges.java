package com.google.common.plus;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a range of values from a starting value to en ending value<br>
 * An increment step value can be given (default is 1)
 * @author francois wauquier
 */
public class Ranges {

	private int start;
	private int step = 1;

	private Ranges(int start) {
        super();
		this.start = start;
	}

	public static Ranges from(int start) {
		return new Ranges(start);
	}

	public static Ranges from0() {
		return from(0);
	}

	public List<Integer> to(int end) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = start; i <= end; i += step) {
			result.add(i);
		}
		return result;
	}

	public Ranges step(int step) {
		this.step = step;
        return this;
	}
}
