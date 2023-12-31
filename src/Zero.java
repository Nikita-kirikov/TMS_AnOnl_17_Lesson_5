import java.util.Arrays;
import java.util.Scanner;
public class Zero {
    public static void Run() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int[][] numbers = { { 2, 3, 4 }, { 3, 2, 1 }, {2, 5, 3 } };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] += input;
                System.out.println(numbers[i][j]);
            }
        }
    }
}
