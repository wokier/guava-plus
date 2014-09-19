package com.google.common.plus;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Simple Maths without boundary checks
 *
 * @author francois wauquier
 */
public class Maths {

	private Maths() {
	}

	public static Long sum(Iterable<Integer> values) {
		long total = 0L;
		for (Integer value : values) {
			total += value;
		}
		return total;
	}

	public static Double average(Collection<Integer> values) {
		return sum(values).doubleValue() / values.size() ;
	}
}