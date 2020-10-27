package ru.kpfu.classwork.lesson_11;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_11 {
    public static void main(String[] args) {
        String str = "asdf Asdf fsasf";
        String res = "Asdf Asdf Fsasf";


        System.out.println(Arrays.toString(str.split(" ")));
        StringBuilder sb = new StringBuilder();
        for (String word : str.split(" ")) {
            sb.append(word.substring(0, 1).toUpperCase());
            sb.append(word.substring(1));
            sb.append(" ");
        }
        System.out.println(sb);

//      String69
//        "(((" => -1
//          "(asdf))" => 6
        // "((())) => 0

        String a = "aab";
        String b = "aae";

        System.out.println(a.compareTo(b)); // < 0; -3
        System.out.println(a.compareTo("aab")); // == 0
        System.out.println(a.compareTo("aa")); // > 0; 1

        // regex for email:
        // ^((?![_\-.])[A-Za-z0-9_\-.]+)@((?![_\-.])[A-Za-z0-9_\-.]+)$
        // [\s\xA0]
        // [a-d[m-p]] => a to d, m to p
        // [a-z&&[e-l]] => e-l
        // [a-z&&[^e-l]] => a-d, m-z

        String str2 = "asdfasf, asdf, asdf.";

        System.out.println(Arrays.toString(str2.split("[\\s,.]+")));
        System.out.println(str2.replaceAll("asdf\\b", "ASDF"));

        String email_re = "(?i)^((?![_\\-.])[a-z0-9_\\-.]+)@([^_\\-.][a-z0-9_\\-.]+)$";
        String emails = "Asf.asf@int.kpfu.ru";

        Pattern pattern = Pattern.compile(email_re, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(emails);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println("login = " + matcher.group(1));
            System.out.println("domain = " + matcher.group(2));
        }

        String txt = "adfasf asfas fas fdasfas A.A. Ivanov, Ivan M. Petrov";
        // find A.A. Ivanov using regex

        String fio_re = "[A-Z]\\.\\s?[A-Z]\\.\\s[A-Z][a-z]*\\b";
        //+79123321233 asfd +78945656652
        //+7-123-123-23-33

        String phone_re = "(?:\\+{0,1}\\d{1,2}\\s?\\(?-?\\d{3}[ \\-)]*)?\\d{3}[ -]*\\d{2}[ -]*\\d{2}";

        String test = " .!  afdasdfas asfdsa   \t\t.....";
        System.out.println(test.trim());
        System.out.println(trim(test, " ."));
        System.out.println(trim(test, " .!\t"));

        String link_re = "<(\\w+)(?:[^>]*)(?:href\\s*=\\s*[\"']([^\"']*))[\"'](?:[^>]*)>\\s*(.*?)\\s*<\\/\\1>";
        String latex_title_re = "\\\\title({((?:[^}{]++|(?1))++)})";

    }
    public static String trim(String str, String remove) {
        String pattern = "^[" + remove + "]*|[" + remove + "]*$";
        return str.replaceAll(pattern, "");
    }


}
