package com.ycsoft.javacore.unit_3.InputTest;

import java.io.Console;

/**
 * Created by yong on 2017/6/6 0006.
 */
public class ConsoleTest {
    public static void main(String[] args) {
         /*因为输入是可见的，所以Scanner类不适用于从控制台读取密码*/
        Console cons = System.console();
        if(cons != null){
            System.out.println("input data");
            String data = cons.readLine();
            System.out.println("data = " + data);
            char[] password = cons.readPassword();
            System.out.println("password = " + password);
            data = cons.readLine("hello %s", "test");
            System.out.println(data);
            password = cons.readPassword("hell password %s","test");
            System.out.println(password);

            cons.format("fuck %s\n", "you");
            cons.writer().println("finish");
            cons.flush();
        }else{
            System.out.println("cons == null");
        }
    }
}
