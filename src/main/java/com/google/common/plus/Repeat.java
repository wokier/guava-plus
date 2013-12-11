package com.google.common.plus;

import java.util.ArrayList;
import java.util.List;

/**
 * Repeat a value a given number of times
 * @author francois wauquier
 */
public class Repeat {

	private Repeat() {

	}

    public static List<String> repeat(int times, String value) {
        List<String> result = new ArrayList<String>(times);
        for (int i = 0; i < times; i++) {
            result.add(value);
        }
        return result;
    }
    public static List<Integer> repeat(int times, int value) {
		List<Integer> result = new ArrayList<Integer>(times);
		for (int i = 0; i < times; i++) {
			result.add(value);
		}
        return result;
	}

    public static List<Long> repeat(int times, long value) {
        List<Long> result = new ArrayList<Long>(times);
        for (int i = 0; i < times; i++) {
            result.add(value);
        }
        return result;
    }
    public static List<Float> repeat(int times, float value) {
        List<Float> result = new ArrayList<Float>(times);
        for (int i = 0; i < times; i++) {
            result.add(value);
        }
        return result;
    }
    public static List<Double> repeat(int times, double value) {
        List<Double> result = new ArrayList<Double>(times);
        for (int i = 0; i < times; i++) {
            result.add(value);
        }
        return result;
    }


}
