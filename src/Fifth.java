import java.util.Arrays;

public class Fifth {
    public static void Run() {
        int[][] numbers = { {7,1,9,4}, {5,8,2,1}};

        for (int i = 0; i < numbers.length; i++) {
                Arrays.sort(numbers[i]);
        }

        System.out.println(Arrays.deepToString(numbers));
    }
}
