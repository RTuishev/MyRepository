package com.company;

public class Main {

    public static void main(String[] args) {
        String Link = "Шаурмяу";// Первое задание
        System.out.println("До: " + Link);
        String a = Link.substring(0, 5);
        System.out.println("После: " + a + "а");
        System.out.println();
        String b = "Много $";// Второе задание
        System.out.println(b);
        String c = b.substring(0, 6);
        System.out.println(c + "&");
        System.out.println();
        String value = "осталось много времени до нового года".replace("много времени", "4 месяца");// Третье задание
        System.out.println(value);
        System.out.println();
        String e = value.substring(8, 10);// Четвертое задание
        int i = Integer.parseInt(e.trim());
        int j = i - 1;
        String f = Integer.toString(j);
        String value1 = value.replace("4", f);
        System.out.println(value1);
        System.out.println();
        String value2 = "Сосед и децибелы".replace(" и децибе", "и имбеци");// Пятое задание
        System.out.println(value2);


    }
}
