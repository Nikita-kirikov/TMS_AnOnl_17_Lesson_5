import java.util.Arrays;
import java.util.Scanner;
public class Zero {
    public static void Run() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int[][][] numbers = {
                { { 2, 3, 4 }, { 3, 2, 1 } },
                { { 2, 5, 3 }, { 3, 4, 1 } },
                { { 2, 4, 1 }, { 4, 4, 0 } }
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int k = 0; k < numbers[i][j].length; k++) {
                    numbers[i][j][k] += input;
                }
            }
        }
        System.out.println(Arrays.deepToString(numbers));
    }
}
