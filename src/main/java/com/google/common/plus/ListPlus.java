package com.google.common.plus;

import java.util.List;

/**
 * List Plus
 *
 * @see com.google.common.collect.Lists
 * @author francois wauquier
 */
public class ListPlus {

	private ListPlus() {
	}

	public static <T> T getRandom(List<T> list) {
		return list.get((int) (Math.random() * list.size()));
	}

    public static <T> List<T> firsts(List<T> list, int size){
        return list.subList(0, Math.min(list.size(), size)) ;
    }

}
