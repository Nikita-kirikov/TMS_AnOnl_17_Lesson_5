public class Third {
    public static void Run() {
        int[][] numbers = { {1,8,7}, {3,9,4,5,4,3,6}, {3,5,4,2,1} };
        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        System.out.println("Сумма всех элементов массива равна " + sum);
    }
}
