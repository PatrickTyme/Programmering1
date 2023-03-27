package Opgave1;

public class Opgave1 {
    public static void main(String[] args) {
        int[][] numbers = {
                {0, 4, 3, 9, 6},
                {1, 3, 5, 2, 2},
                {3, 3, 1, 0, 1},
                {0, 0, 9, 7, 1}

        };
        print(numbers);
        int rowSum = sumRow(numbers, 2);
        System.out.println("Sum of row 2: " + rowSum);
        int columnSum = sumColumn(numbers, 2);
        System.out.println("Sum of column 2: " + columnSum);
        System.out.println("The total sum of the table is: " + sum(numbers));
        int value = getValueAt(numbers, 2, 3);
        System.out.println("Value at row 2, column 3: " + value);
        setValueAt(numbers, 1, 2, 15);
        print(numbers);
    }

    public static void print(int[][] numbers) {
        System.out.println("table:");
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[0].length; column++) {
                System.out.print(numbers[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int sumRow(int[][] numbers, int row) {
        int rowSum = 0;
        for (int column = 0; column < numbers.length; column++) {
            rowSum += numbers[row][column];
        }
        return rowSum;
    }

    public static int sumColumn(int[][] numbers, int column) {
        int columnSum = 0;
        for (int row = 0; row < numbers.length; row++) {
            columnSum += numbers[row][column];
        }
        return columnSum;
    }

    public static int sum(int[][] numbers) {
        int rowSum = 0;
        int columnSum = 0;
        int totalSum = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                totalSum += numbers[row][column];
            }

        }
        return totalSum;
    }
    public static int getValueAt(int[][] numbers, int row, int column) {
            return numbers[row][column];
    }
    public static void setValueAt(int[][] numbers, int row, int column, int value) {
            numbers[row][column] = value;
    }
}

