package ru.kpfu.classwork.Lesson_18;

import java.io.*;
import java.util.Scanner;

public class FileTest {

    public static void listFilesRecursive(File file, String indent) {
        System.out.println(indent + file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File current : files) {
                listFilesRecursive(current, indent + "\t");
            }
        }
    }

    public static void listFilesRecursive(String filename) {
        listFilesRecursive(new File(filename), "");
    }

    public static void main(String[] args) {
        String filename = "./";
        foo(filename);

        listFilesRecursive(filename);
        bar();
        copyFile("src/main/java/ru/kpfu/classwork/Lesson_18/JPEG_example_down.jpg");
        copyFile("src/main/java/ru/kpfu/classwork/Lesson_18/test.txt");
    }

    private static String addSlashToFilename(String filename) {
        return filename.replaceFirst("(\\.\\w*)?$", "_$1");
    }

    private static void copyFile(String filename) {
        String newFilename = addSlashToFilename(filename);
        System.out.println(newFilename);
        try {
            FileInputStream fr = new FileInputStream(filename);
            FileOutputStream fw = new FileOutputStream(newFilename);
            int b;
            while ((b = fr.read()) != -1) {
                fw.write(b);
            }
            fr.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bar() {
        String filename = "src/main/java/ru/kpfu/classwork/Lesson_18/test.txt";
        File file = new File(filename);
        if (file.exists()) {
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        try {
            Scanner scanner = new Scanner(new File(filename));

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(filename)) {
            int b;
            while ((b = fr.read()) != -1) {
                System.out.print((char)b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter("src/main/java/ru/kpfu/classwork/Lesson_18/newfil.txt");
            fileWriter.write("test line\n");
            fileWriter.append("test line 3\n");
            fileWriter.write("test line2\n");

            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    private static void foo(String filename) {
        File file = new File(filename);

        if (file.exists()) {
            System.out.println("exist");
        }

        if (file.isDirectory()) {
            System.out.println("it is dir");
            String[] filesInDir = file.list();
            for (String s : filesInDir) {
                System.out.println(s);
            }
            File[] files = file.listFiles();

        }

        System.out.println(file.getAbsolutePath());
    }
}
