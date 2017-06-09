package com.ycsoft.javacore.unit_3.FileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by yong on 2017/6/7 0007.
 */
public class FileReaderTest {
    public static void main(String[] args) {
        try {
            //要想对文件进行读取，就需要用一个File对象构造一个Scanner对象。
            //如果用一个不存在的文件构造一个Scanner对象，那么就会发生异常
            Scanner in = new Scanner(new File("d://log_network.txt"));
            while (in.hasNext()) {
                System.out.println(in.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
