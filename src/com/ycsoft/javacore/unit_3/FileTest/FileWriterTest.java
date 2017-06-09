package com.ycsoft.javacore.unit_3.FileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by yong on 2017/6/7 0007.
 */
public class FileWriterTest {
    public static void main(String[] args) {
        try {
            //要想写入文件，就需要构造一个PrintWriter对象.如果文件不存在，创建该文件。
            //如果一个不能被创建的文件名构造一个PrintWriter对象，那么就会发生异常
            PrintWriter out = new PrintWriter("D://myFile.txt");
            out.write("hello ");
            out.close();

            Scanner in = new Scanner(new File("d://myFile.txt"));
            while (in.hasNext()) {
                System.out.println(in.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
