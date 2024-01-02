import java.util.Arrays;

public class Second {
    public static void Run() {
        int[][] array1 = { {1,0,0,0}, {0,1,0,0}, {0,0,0,0} };
        int[][] array2 = { {1,2,3}, {1,1,1}, {0,0,0}, {2,1,0} };
        int[][] result = new int[array1.length][array2[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int k = 0; k < array1[0].length; k++) {
                    result[i][j] = result[i][j] + array1[i][k] * array2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}
