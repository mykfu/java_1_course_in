package ru.kpfu.classwork.ChainsGame;

import java.io.*;
import java.util.Arrays;

public class Test {

    private static String[] dictionary;
    private static String[] history;
    private static int historyLength = 0;
    private static String[] queue;
    private static int queueBegin = -1;
    private static int queueEnd = -1;

    private static boolean queueEmpty() {
        return queueBegin == queueEnd;
    }

    private static String pop() {
        return queue[++queueBegin];
    }

    private static void push(String add) {
        queue[++queueEnd] = add;
    }

    private static void readDictionary(String filename) throws IOException {
        File file = new File(filename);
        long size = file.length() / 10;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        int counter = 0;

        dictionary = new String[(int) size + 1];
        history = new String[(int) size + 1];
        queue = new String[(int) size + 1];
        int i = 0;
        while ((line = br.readLine()) != null) {
            dictionary[i++] = line;
        }
        br.close();
    }

    /*
    * left < right => -1 or negative
    * left == right => 0
    * left > right => 1 or positive
    *
    * */

    // клен клон

    public static int compare(String left, String right) {
        int minLength = Math.min(left.length(), right.length());
        int c1, c2;
        for (int i = 0; i < minLength; i++) {
            c1 = left.charAt(i) * 2; // 184*2
            c2 = right.charAt(i);

            c2 = c2 == 'ё' ? 'е' * 2 + 1 : c2 * 2;
            if (c1 == 'ё' * 2) c1 = 'е' * 2 + 1;

//            if (c1 < c2) return -1;
//            if (c1 > c2) return 1;

            if (c1 != c2) {
                return c1 - c2;
            }
        }
        return left.length() - right.length();
    }

    public static boolean binarySearch(String findMe, String[] sorted) {
        int left = 0;
        int right = sorted.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (compare(sorted[middle], findMe) < 0) {
                left = middle + 1;
            } else if (compare(sorted[middle], findMe) > 0) {
                right = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }


    private static String[] getWords(String begin, String end) {
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < begin.length(); i++) {
            String current = begin;
            if (!(current.charAt(i) == end.charAt(i))) {
                for (int j = 0; j < abc.length(); j++) {
                    char[] word = current.toCharArray();
                    word[i] = abc.charAt(j);
                    current = String.valueOf(word);
                    if (!current.equals(begin) && !inArray(current, history, historyLength)
                            && binarySearch(current, dictionary)) {
                        sb.append(current).append(",");
                        history[historyLength] = current;
                        historyLength++;
                    }
                }
            }
        }
        if (sb.length() == 0) return new String[0];
        return sb.toString().split(",");
    }

    private static boolean inArray(String findMe, String[] history, int size) {
        for (int i = 0; i < size; i++) {
            if (findMe.equals(history[i])) {
                return true;
            }
        }
        return false;
    }

    static boolean found = false;

    private static void game(String begin, String end, String chain, int chainLength) {
        if (begin.equals(end)) {
            System.out.println(end);
            System.out.println("Found!");
            chain += end;
            System.out.println("Цепочка найдена: " + chain);
            System.out.println("Размер цепочки = " + chainLength);
            found = true;
            return;
        }
        history[historyLength++] = begin;
        System.out.print(begin + ": ");
        String[] words = getWords(begin, end);
        if (words.length > 0) {
            chainLength++;
            chain += begin + " - ";
        }
        System.out.println(Arrays.toString(words));
        // sort words
        // quickSortBySimilarity(end, words);
        for (int i = 0; i < words.length; i++) {
            if (found) return;
            game(words[i], end, chain, chainLength);
        }

    }

    public static void game(String begin, String end) {
        game(begin, end, "", 1);
    }

    static class Pair {
        String parent;
        String child;

        public Pair(String parent, String child) {
            this.parent = parent;
            this.child = child;
        }
    }

    private static void gameBFS(String begin, String end) {
        push(begin);
        history[historyLength++] = begin;

        Pair[] pairs = new Pair[dictionary.length];
        int pairsLength = 0;


        while (!queueEmpty()) {
            String current = pop();

            if (current.equals(end)) {
                System.out.println(end);
                System.out.println("Found!");
                String chain = "";

                //n(n+1)/2 = O(n^2)

                int chainLength = 1;
                for (int i = 0; i < pairsLength && !current.equals(begin); i++) {
                    if (pairs[i].child.equals(current)) {
//                        chain += " - " + current;
//                        chain = chain + " - " + current;
                        chain = " - " + current + chain;
                        chainLength++;
                        current = pairs[i].parent;
                        i = 0;
                    }
                }
                chain = begin + chain;

                System.out.println(chain);
                System.out.println("chainLength = " + chainLength);

//                chain += end;
//                System.out.println("Цепочка найдена: " + chain);
                return;
            }

            System.out.print(current + ": [");
            for (String child : getWords(current, end)) {
                System.out.print(" " + child);
                push(child);
                pairs[pairsLength++] = new Pair(current, child);
            }
            System.out.println("]");
        }



    }

    public static void main(String[] args) {
//
//        String[] test = new String[] {"ель", "ёжик", "ёлка", "клён", "клон", "стен"};
//
//        System.out.println("Search yozik: ");
//        System.out.println(binarySearch("клён", test));
        // муха => слон
        // стук - сток - стон - слон
        String begin = "аист";
        String end = "джип";
        try {
            readDictionary("src/main/java/ru/kpfu/classwork/ChainsGame/dict_len4.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Depth-First-Search:");
        game(begin, end);
        historyLength = 0;
//        System.out.println("Breadth-First-Search:");
//        gameBFS(begin, end);


    }

}
