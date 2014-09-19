package com.google.common.plus;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

/**
 * @author francois wauquier
 */
public class ListPlusTest {

	@Test
	public void testGetRandom() {
		List<Integer> list = IntRanges.from0().to(100);
		for (int i = 0; i < 1000; i++) {
			Integer random = ListPlus.getRandom(list);
			System.out.println(random);
		}
	}

	@Test
	public void testFirst() {
		assertThat(ListPlus.firsts(Lists.newArrayList(1, 2, 3), 2)).contains(1, 2);
		assertThat(ListPlus.firsts(Lists.newArrayList(1), 2)).contains(1);

	}

}
