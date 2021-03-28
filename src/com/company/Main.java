package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
//        String Link = "Шаурмяу";// Первое задание
//        System.out.println("До: " + Link);
//        String a = Link.substring(0, 5);
//        System.out.println("После: " + a + "а");
//        System.out.println();
//        String b = "Много $";// Второе задание
//        System.out.println("До: " + b);
//        String c = b.substring(0, 6);
//        System.out.println("После: " + c + "&");
//        System.out.println();
//        String value0 = "осталось много времени до нового года";
//        System.out.println("До: " + value0);
//        value0 = value0.replace("много времени", "4 месяца");// Третье задание
//        System.out.println("После: " + value0);
//        System.out.println();
//        System.out.println("До: " + value0);
//        String e = value0.substring(8, 10);// Четвертое задание
//        int i = Integer.parseInt(e.trim());
//        int j = i - 1;
//        String f = Integer.toString(j);
//        String value1 = value0.replace("4", f);
//        System.out.println("После: " + value1);
//        System.out.println();
//        String value2 = "Сосед и децибелы";// Пятое задание
//        System.out.println("До: " + value2);
//        value2 = value2.replace(" и децибе", "и имбеци");
//        System.out.println("После: " + value2);


        Cycle();


    }

    public static void Cycle() {
        for (int i = 0; i < 5; i++) {
            try {
                int a = i + 1;
                if (a == 3)
                    throw new Exception("Number " + a + " is exception");
                System.out.println(a);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
