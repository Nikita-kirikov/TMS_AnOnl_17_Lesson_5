public class Third {
    public static void Run() {
        int[][] numbers = { {1,8,7}, {3,9,4} };
        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                int a = numbers[i][j];
                sum += numbers[i][j];
                System.out.println(a);
            }
        }
        System.out.println("Сумма всех элементов массива равна " + sum);
    }
}
