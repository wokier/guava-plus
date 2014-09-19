package com.google.common.plus;

import com.google.common.base.Function;

import java.util.HashMap;
import java.util.Map;

/**
 * Map Plus
 *
 * @see com.google.common.collect.Maps
 * @author francois wauquier
 */
public class MapPlus {

	private MapPlus() {
	}

	public static class Entry<K, V> implements Map.Entry<K, V> {

		private K key;
		private V value;

		private Entry(K key, V value) {
			super();
			this.key = key;
			this.value = value;
		}

		@Override
		public K getKey() {
			return key;
		}

		@Override
		public V getValue() {
			return value;
		}

		@Override
		public V setValue(V value) {
			V oldValue = this.value;
			this.value = value;
			return oldValue;
		}

		public int hashCode() {
			return key.hashCode();
		}

		public boolean equals(Object object) {
			return object instanceof Entry && key.equals(((Entry) object).getKey());
		}
	}

	public static <S, K, V> Map<K, V> transform(Iterable<S> iterable, Function<S, MapPlus.Entry<K, V>> function) {
		Map<K, V> result = new HashMap<K, V>();
		for (S item : iterable) {
			Entry<K, V> entry = function.apply(item);
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}

	public static <K, V> Entry<K, V> entry(K key, V value) {
		return new Entry<K, V>(key, value);
	}
}
