package Stars;

public class StarsC {
    public static void main(String[] args) {
        exA(10);
    }

    public static void exA(int rowCount) {
        for (int row = 1; row <= rowCount; row++) {
            // print row number
            System.out.printf("%2d: ", row);

            // print dashes
            int dashCount = rowCount - row;
            for (int i = 9; i > dashCount; i--) {
                System.out.print("-");
            }

            // print stars
            int starCount = rowCount - dashCount;
            for (int i = 10; i >= starCount; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
