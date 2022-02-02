import java.util.Arrays;

public class Minesweeper {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[][] bombs1 = { { 0, 2 }, { 2, 0 } };
        // mineSweeper(bombs1, 3, 3) should return:
        // [[0, 1, -1],
        // [1, 2, 1],
        // [-1, 1, 0]]

        int[][] bombs2 = { { 0, 0 }, { 0, 1 }, { 1, 2 } };
        // mineSweeper(bombs2, 3, 4) should return:
        // [[-1, -1, 2, 1],
        // [2, 3, -1, 1],
        // [0, 1, 1, 1]]

        int[][] bombs3 = { { 1, 1 }, { 1, 2 }, { 2, 2 }, { 4, 3 } };
        // mineSweeper(bombs3, 5, 5) should return:
        // [[1, 2, 2, 1, 0],
        // [1, -1, -1, 2, 0],
        // [1, 3, -1, 2, 0],
        // [0, 1, 2, 2, 1],
        // [0, 0, 1, -1, 1]]

        printField(mineSweeper(bombs1, 3, 3));
        printField(mineSweeper(bombs2, 3, 4));
        printField(mineSweeper(bombs3, 5, 5));
    }

    // Implement your solution below.
    public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
        int[][] field = new int[numRows][numCols];

        // filling the array
        for (int[] linha : field) {
            Arrays.fill(linha, 0);
        }

        // seting the bombs
        for (int[] bomb : bombs) {
            int bomb_line = bomb[0];
            int bomb_column = bomb[1];
            field[bomb_line][bomb_column] = -1;

            for (int i = bomb_line - 1; i <= bomb_line + 1; i++) {
                for (int j = bomb_column - 1; j <= bomb_column + 1; j++) {
                    if ((0 <= i && i < numRows) && (0 <= j && j < numCols) && (field[i][j] != -1)) {
                        field[i][j] += 1;
                    }
                }
            }

        }

        return field;
    }

    public static void printField(int[][] field) {
        System.out.println("\n############ Field\n");
        for (int i = 0; i < field.length; i++) {
            System.out.print("|\t");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + "\t|\t");
            }
            System.out.println("\n");
        }
    }
}
