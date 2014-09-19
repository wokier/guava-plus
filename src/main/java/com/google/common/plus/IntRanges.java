package com.google.common.plus;

import java.util.AbstractList;
import java.util.List;

/**
 * Create a range of values from a starting value to en ending value<br>
 * An increment step value can be given (default is 1)<br/>
 * @deprecated Use Ranges instead starting with guava 17
 * @author francois wauquier
 */
public class IntRanges {

	private int start;
	private int step = 1;

	private IntRanges(int start) {
		super();
		this.start = start;
	}

	public static IntRanges from(int start) {
		return new IntRanges(start);
	}

	public static IntRanges from0() {
		return from(0);
	}

	public List<Integer> to(final int end) {
		final int size = end - start + 1 / step;
		return new AbstractList<Integer>() {
			@Override
			public Integer get(int index) {
				return start + index * step;
			}

			@Override
			public int size() {
				return size;
			}
		};
	}

	public IntRanges step(int step) {
		this.step = step;
		return this;
	}
}
