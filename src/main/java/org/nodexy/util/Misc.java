package org.nodexy.util;

/**
 * Created by phoenix on 11/1/16.
 */
public class Misc {
    private Misc() {}
    public static void put(Object ... args) {
        for (Object obj : args) System.out.println(obj);
        System.out.println();
    }
}
