package ru.kpfu.classwork.FileExamples;

import java.io.*;
import java.util.Scanner;

public class Test {

    public static void copyIntReverse(String filename) throws IOException {
        Scanner scanner = new Scanner(new File(filename));

        StringBuilder sb = new StringBuilder();
//        String s = "";
        while (scanner.hasNextInt()) {
//            s = " " + scanner.nextInt() + s;
            sb.insert(0, " " + scanner.nextInt());
        }
        scanner.close();

        FileWriter fileWriter = new FileWriter(filename, true);
//        fileWriter.write(sb.toString());
        fileWriter.append(sb);
//        fileWriter.flush();
        fileWriter.close();
    }

    public static void copyToSmallest(String filename1, String filename2, String filename3) throws IOException {
        FileInputStream fileInputStream1 = new FileInputStream(filename1);
        FileInputStream fileInputStream2 = new FileInputStream(filename2);
        FileInputStream fileInputStream3 = new FileInputStream(filename3);

        System.out.println("av count1 = " + fileInputStream1.available());
        int count1 = 0;
        int count2 = fileInputStream2.available();
        int count3 = fileInputStream3.available();
//        while (fileInputStream1.read() != -1) {
//            count1++;
//        }
        System.out.println("count1 = " + count1);
//        if (count1 > count2 && count1 > count3) {
//            // 1 biggest
//        } else if () {
//
//        }

        FileOutputStream fos = new FileOutputStream(filename1+"_");
        int b;
        while ((b = fileInputStream1.read()) != -1) {
            fos.write(b);
        }
        fos.close();
        fileInputStream1.close();
        fileInputStream2.close();
        fileInputStream3.close();


    }


    public static void copyMinLines(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename.replace(".txt", "_2.txt"))));
        String line = null;

        int minLength = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        while (br.ready() && (line = br.readLine()) != null) {
            if (line.length() < minLength) {
                minLength = line.length();
//                sb.delete(0, sb.length());
                pw.write("");
            }
            if (line.length() == minLength) {
//                sb.append(line).append("\r\n");
                pw.println(line);
            }
        }
        pw.close();
    }

    public static void main(String[] args) {
        String path = "src/main/java/ru/kpfu/classwork/FileExamples/";
        String filename = path + "ints.txt";
        try {
            copyIntReverse(filename);
            copyToSmallest(path + "1.jpg", path + "2.jpg", path + "3.jpg");
            copyMinLines(path + "file64.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
