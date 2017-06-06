package com.ycsoft.javacore.unit_3.StringTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yong on 2017/6/6 0006.
 */
public class StringTest {

    public static String BESTINFO = "Mr.Y";

    public static final int COUNT = 2000000;

    /**
     * 执行String 赋值测试
     */
    public static void doStringTest() {

        String str = new String(BESTINFO);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < COUNT / 100; i++) {
            str = str + "miss";
            //str += "miss";
        }

        long endTime = System.currentTimeMillis();

        System.out.println((endTime - startTime)
                + " millis has costed when used String.");

    }

    /**
     * 执行StringBuffer 赋值测试
     */
    public static void doStringBufferTest() {

        StringBuffer sb = new StringBuffer(BESTINFO);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < COUNT / 100; i++) {
            sb = sb.append("miss");
        }

        long endTime = System.currentTimeMillis();

        System.out.println((endTime - startTime)
                + " millis has costed when used StringBuffer.");

    }


    /**
     * 执行StringBuilder赋值测试
     */
    public static void doStringBuilderTest() {

        StringBuilder sb = new StringBuilder(BESTINFO);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < COUNT / 100; i++) {
            sb = sb.append("miss");
        }

        long endTime = System.currentTimeMillis();

        System.out.println((endTime - startTime)
                + " millis has costed when used StringBuilder.");

    }

    /**
     * 执行StringBuffer遍历赋值测试
     */
    public static void doStringBufferListTest(List<String> list) {

        StringBuffer sb = new StringBuffer();
        long startTime = System.currentTimeMillis();

        for (String s : list) {
            sb.append(s);
        }

        long endTime = System.currentTimeMillis();

        System.out.println(sb.toString() + " buffer cost:" + (endTime - startTime)
                + " millis ");

    }


    /**
     * 执行StringBuilder迭代赋值测试
     */
    public static void doStringBuilderListTest(List<String> list) {

        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            sb.append(iterator.next());
        }

        long endTime = System.currentTimeMillis();

        System.out.println(sb.toString() + " builder cost:" + (endTime - startTime)
                + " millis ");

    }


    public static void main(String[] args) {
        doStringTest();
        doStringBufferTest();
        doStringBuilderTest();

        List<String> list = new ArrayList<String>();
        list.add(" I ");
        list.add(" like ");
        list.add(" BeiJing ");
        list.add(" tian ");
        list.add(" an ");
        list.add(" men ");
        list.add(" . ");

        doStringBufferListTest(list);
        doStringBuilderListTest(list);
    }
}
