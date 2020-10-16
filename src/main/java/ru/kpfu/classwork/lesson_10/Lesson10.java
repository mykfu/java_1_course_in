package ru.kpfu.classwork.lesson_10;

import java.util.StringTokenizer;

public class Lesson10 {
    public static void main(String[] args) {
        String c = "c";
        char ch1 = 'c';
        System.out.println(ch1);
        System.out.println((int) ch1);
        char ch2 = 99;
        System.out.println(ch2);
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch);
        }
        System.out.println();
        for (char ch = 'а'; ch <= 'я'; ch++) {
            System.out.print(ch);
        }
        System.out.println();
        System.out.println(c.charAt(0));
        System.out.println((int)c.charAt(0));
        System.out.println(String.valueOf(c.charAt(0)));
        System.out.println(c.charAt(0) + "");
        // %d - int, %4d 3 => "   3"
        // %s - string
        // %f - float, %3.2f 3.1415826 => "  3.14"
        // %c char
        // %n = \n

        System.out.printf("\t%d = %c%n", (int)ch1, ch1);

        String sentence = "This    is   example sentence, to test split method.";
        String [] words = sentence.split(" +");
        for (String word : words) {
            System.out.println(word);
        }

        StringTokenizer stringTokenizer = new StringTokenizer(sentence);
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
        String punctuations = " ,./!;:'}+=\\{\\}\\[\\]";
        String str2 = "Balls ball test, tests...,,,, javas, adfs.";
        String str3 = "Balls ball test tests javas adfs";
        // allowed methods: split, endsWith, equal, charAt, length, substring
        String[] split = str2.split(" ");
//        for (int i = 0; i < split.length; i++) {
//            split[i];
//        }
        int count = 0;
        for (String word : split) { // for-each
            for (String punctuation : punctuations.split("")) {
                while (word.endsWith(punctuation)) word = word.substring(0, word.length() - 1);
            }
            if (word.endsWith("s")) {
                count++;
            }
        }
        System.out.println(str2);
        System.out.printf("Count of words ends with 's' is %d.%n", count);

        String str4 = "replacement text test";

        String res = str4.replace("replace", "12312312");
        System.out.println(res);

        System.out.println(" \tTest  .  ".trim());
        System.out.println("a" + "b");
        System.out.println("a".concat("b"));

        System.out.println(String.join(" ", split));

        long beginTime, elapsedTime;

//        System.nanoTime()


        String test = "";

        char a = 'a';

        beginTime = System.nanoTime();
        int size = 16536;
        for (int i = 0; i < size; i++) {
            test += a;
            a++;
            if (a > 'z') a = 'a';
        }

        elapsedTime = System.nanoTime() - beginTime;
        System.out.println("Elapsed time is " + elapsedTime);
        String reverse = "";
        beginTime = System.nanoTime();
        for (int i = test.length() - 1; i >= 0; i--) {
            reverse += test.charAt(i);
        }
        elapsedTime = System.nanoTime() - beginTime;
        System.out.println("Elapsed time of reverse with String is " + elapsedTime);

        StringBuffer stringBuffer = new StringBuffer(size);
        beginTime = System.nanoTime();
        for (int i = test.length() - 1; i >= 0; i--) {
            stringBuffer.append(test.charAt(i));
        }
        elapsedTime = System.nanoTime() - beginTime;
        System.out.println("Elapsed time of reverse with StringBuffer is " + elapsedTime);

        StringBuffer reversedTest = new StringBuffer(test);
        beginTime = System.nanoTime();
        reversedTest.reverse();

        elapsedTime = System.nanoTime() - beginTime;
        System.out.println("Elapsed time of reverse with StringBuffer std reverse method is " + elapsedTime);


        StringBuilder stringBuilder = new StringBuilder(size);
        beginTime = System.nanoTime();
        for (int i = test.length() - 1; i >= 0; i--) {
            stringBuffer.append(test.charAt(i));
        }
        elapsedTime = System.nanoTime() - beginTime;
        System.out.println("Elapsed time of reverse with StringBuilder is " + elapsedTime);




    }
}
