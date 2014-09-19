package com.google.common.plus;

import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * @author francois wauquier
 */
public class SetPlusTest {

    @Test
    public void testGetRandom() {
        Set<Integer> set = Sets.newHashSet(1,2,3,4);
        for (int i = 0; i < 1000; i++) {
            Integer random = SetPlus.getRandom(set);
            System.out.println(random);
        }
    }
}
