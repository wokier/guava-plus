package com.google.common.plus;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;

/**
 * @author francois wauquier
 */
public class ComposeTest {

	@Test
	public void testCollect() {
		assertThat(Compose.from(new HashMap<String, List<Integer>>() {
			{
				put("a", Lists.newArrayList(1, 2));
				put("b", Lists.newArrayList(3));
			}
		}.entrySet()).by(new Function<Map.Entry<String, List<Integer>>, List<Integer>>() {
			@Override
			public List<Integer> apply(Map.Entry<String, List<Integer>> input) {
				return input.getValue();
			}
		})).contains(1, 2, 3);
	}
}
