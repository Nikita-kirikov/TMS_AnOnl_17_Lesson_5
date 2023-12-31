public class Second {
    public static void Run() {
        int[][] array1 = { {1,0,4}, {2,2,1}, {0,0,1} };
        int[][] array2 = { {2,1,2}, {1,3,5}, {1,0,1} };
        int[][] result = new int[3][3];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                result[i][j] = array1[i][j] * array2[i][j];
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
