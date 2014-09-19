package com.google.common.plus;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.fest.assertions.Assertions;
import org.junit.Test;

import javax.annotation.Nullable;
import java.util.Map;

/**
 * @author francois wauquier
 */
public class MapPlusTest {
	@Test
	public void testTransform() throws Exception {
		Map<Long, Integer> map = MapPlus.transform(Lists.newArrayList("1", "2"), new Function<String, MapPlus.Entry<Long, Integer>>() {
			@Nullable
			@Override
			public MapPlus.Entry<Long, Integer> apply(@Nullable String input) {
				return MapPlus.entry(Long.valueOf(input), Integer.valueOf(input));
			}
		});
		Assertions.assertThat(map.get(1L)).isEqualTo(1);
		Assertions.assertThat(map.get(2L)).isEqualTo(2);
	}
}
