package com.google.common.plus;

import com.google.common.base.Function;

import java.util.*;

/**
 * Compose a collection by extracting values from the elements of a source collection
 * @author francois wauquier
 */
public class Compose<T> {

	private Collection<T> source;

	private Compose(Collection<T> source) {
        super();
		this.source = source;
	}

	public static <T> Compose<T> from(Collection<T> source) {
		return new Compose(source);
	}

	public <F> List<F> by(Function<T, ? extends Collection<F>> function) {
		List<F> result = new ArrayList<F>();
		for (T type : source) {
			result.addAll(function.apply(type));
		}
		return result;
	}

}
