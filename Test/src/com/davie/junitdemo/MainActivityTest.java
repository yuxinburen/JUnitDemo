package com.davie.junitdemo;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.davie.junitdemo.MainActivityTest \
 * com.davie.junitdemo.tests/android.test.InstrumentationTestRunner
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super("com.davie.junitdemo", MainActivity.class);
    }


    public void testIsEmpty(String s){

    }




    //单元测试

    public void testMax(){
        int max,a,b;
        a = 3;
        b = 5;
        MainActivity activity = getActivity();
        max = activity.max(a, b);
        //单元测试大量的使用了断言的方法
        //断言的方法通常可以通过TestCase类以及在子类中直接调用
        assertEquals(5,max);
    }

}
