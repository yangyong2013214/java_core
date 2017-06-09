package com.ycsoft.javacore.unit_3.StringTest;

import java.util.Date;

public class TestPrintfDate {
    public static void main(String[] args) {
        Date d = new Date();

        System.out.printf("完整时间: %tc", d);
        System.out.println();
        System.out.printf("ISO 8601 日期：%tF", d);
        System.out.println();
        System.out.printf("美国格式：%tD", d);
        System.out.println();
        System.out.printf("24小时：%tT", d);
        System.out.println();
        System.out.printf("12小时：%tr", d);
        System.out.println();
        System.out.printf("24小时，没有秒：%tR", d);

        System.out.println();
        System.out.printf("4位年：%tY", d);
        System.out.println();
        System.out.printf("年的后两位（前面补0）：%ty", d);
        System.out.println();
        System.out.printf("年的前两位（后面补0）：%tC", d);
        System.out.println();
        System.out.printf("完整月份：%tB", d);

        System.out.println();
        System.out.printf("星期几的完整拼写：%tA", d);
        System.out.println();
        System.out.printf("星期几的缩写：%ta", d);
        System.out.println();
        System.out.printf("三位数的年中的日子（前面补0）：%tj", d);
        System.out.println();
        System.out.printf("两位数字的小时（补0）24小时制：%tH", d);

        System.out.println();
        System.out.printf("两位数字的小时（不补0）24小时制：%tk", d);
        System.out.println();
        System.out.printf("两位数字的小时（补0）12小时制：%tI", d);
        System.out.println();
        System.out.printf("两位数字的小时（不补0）12小时制：%tl", d);

        System.out.println();
        System.out.printf("两位数字的分钟：%tM", d);
        System.out.println();
        System.out.printf("两位数字的秒：%tS", d);
        System.out.println();
        System.out.printf("三位数字的毫秒：%tL", d);
        System.out.println();
        System.out.printf("9位数字的毫微秒：%tN", d);

        System.out.println();
        System.out.printf("上午下午，小写：%tp", d);
        System.out.println();
        System.out.printf("时区偏移量：%tz", d);
        System.out.println();
        System.out.printf("时区：%tZ", d);

        System.out.println();
        System.out.printf("1970-01-01起的毫秒数：%ts", d);
        System.out.println();
        System.out.printf("1970-01-01起的毫微秒数：%tQ", d);


        /**
         * 如果需要多次对日期操作才能实现对每一部分进行格式化的目的就太麻烦了。
         * 为此，可以采用一个格式化的字符串指出要被格式的参数索引。
         * 索引必须紧跟在%后面，并以$终止。参数索引值从1开始，而不是从0开始。%1$..对第一个参数格式化。
         *
         * 还可以使用 < 标志。它指示前面格式说明的参数将被再次使用。
         *
         */
        System.out.println();
        System.out.printf("%1$s %2$tB %2$te, %2$tY ", "Due date", d);
        System.out.println();
        System.out.printf("%s %tB %<te, %<tY ", "Due date", d);

    }
}
