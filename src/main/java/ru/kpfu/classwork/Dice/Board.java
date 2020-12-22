package ru.kpfu.classwork.Dice;

public class Board {
    private int size;
    private int[][] field;

    public Board(int size) {
        this.size = size;
        field = new int[size][size];
    }

    public void place(int row, int col) {
        field[row][col] = 1;
//        field[row][i] = 2;
    }

    public void remove(int row, int col) {
        if (field[row][col] == 1)
        field[row][col] = 0;
    }

    public boolean isSafe(int row, int col) {
        return false;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (field[i][j] == 1) res += "Q";
                else res += " ";
            }
            res += "\n";
        }
        return res;
    }
}
