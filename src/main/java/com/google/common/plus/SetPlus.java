package com.google.common.plus;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Set;

/**
 * Set Plus
 *
 * @see com.google.common.collect.Sets
 * @author francois wauquier
 */
public class SetPlus {


    private SetPlus(){}

    public static <T> T getRandom(Set<T> set) {
        return Lists.newArrayList(set).get((int) (Math.random() * set.size()));
    }
}
