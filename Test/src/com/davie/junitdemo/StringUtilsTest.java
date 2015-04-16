package com.davie.junitdemo;

import junit.framework.TestCase;

/**
 * User: davie
 * Date: 15-4-16
 */
public class StringUtilsTest extends TestCase {
    public void testIsEmpty(){
        boolean b = StringUtils.isEmpty("abc");
        assertFalse(b);

    }

    public void testSplitString(){
        //参数的选型

        String [] str = StringUtils.splitString("",",");
        assertNull(str);

    }
}
