public class Fourth {
    public static void Run() {
        int[][] numbers = {
                {4,3,2,5},
                {1,2,3,4},
                {4,3,6,3},
                {1,2,3,4},
                {2,5,4,3} };
        int index = 0;

        for (int[] number : numbers) {
            if (index < number.length) {
                System.out.println(numbers[index][index]);
                index++;
            }
        }
    }
}
