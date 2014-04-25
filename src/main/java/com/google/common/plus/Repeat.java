package com.google.common.plus;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * Repeat a value a given number of times
 * 
 * @author francois wauquier
 */
public class Repeat {

	private Repeat() {

	}

	public static List<String> repeat(final int times, final String value) {
		return new AbstractList<String>() {
			@Override
			public String get(int index) {
				return value;
			}

			@Override
			public int size() {
				return times;
			}
		};
	}

	public static List<Integer> repeat(final int times, final int value) {
        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return value;
            }

            @Override
            public int size() {
                return times;
            }
        };
	}

	public static List<Long> repeat(final int times,final long value) {
        return new AbstractList<Long>() {
            @Override
            public Long get(int index) {
                return value;
            }

            @Override
            public int size() {
                return times;
            }
        };
	}

	public static List<Float> repeat(final int times,final float value) {
        return new AbstractList<Float>() {
            @Override
            public Float get(int index) {
                return value;
            }

            @Override
            public int size() {
                return times;
            }
        };
	}

	public static List<Double> repeat(final int times,final double value) {
        return new AbstractList<Double>() {
            @Override
            public Double get(int index) {
                return value;
            }

            @Override
            public int size() {
                return times;
            }
        };
	}

}
