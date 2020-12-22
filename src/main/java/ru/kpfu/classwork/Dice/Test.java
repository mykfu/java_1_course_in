package ru.kpfu.classwork.Dice;

public class Test {

    public static void diceRoll(int dice) {
        diceRoll(dice, "");
    }

    private static void diceRoll(int dice, String answer) {

//        if (answer.length() == 2 * dice) {
//            System.out.println(answer);
//            return;
//        }
        if (dice == 0) {
            System.out.println(answer);
            return;
        }
        for (int i = 1; i <= 6; i++) {
            String temp = answer + i + " ";

//            answer = i + " ";
//            diceRoll(dice, temp);
            diceRoll(dice - 1, temp);

        }
    }

    public static void diceSum(int dice, int sum) {
        diceSum(dice, sum, "", 0);
    }
    static int counter = 0;
    private static void diceSum(int dice, int sum, String answer, int diceSum) {
        counter++;
        if (dice == 0) {
            if (diceSum == sum) {
                System.out.println(answer);
            }
            return;
        }
//        if (diceSum >= sum) return;
        if (diceSum + dice > sum || diceSum + dice * 6 < sum) return;
        for (int i = 1; i <= 6; i++) {
            String temp = answer + i + " ";
            diceSum(dice - 1, sum, temp, diceSum + i);
        }
    }

    public static void main(String[] args) {
//        diceRoll(3);
        diceSum(3, 6);
        System.out.println("counter = " + counter);
    }
}
