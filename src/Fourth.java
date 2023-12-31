public class Fourth {
    public static void Run() {
        int[][] numbers = {
                {4,3,2,1},
                {1,2,3,4},
                {4,3,2,1},
                {1,2,3,4} };
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(index < numbers.length) {
                System.out.println(numbers[index][index]);
                index++;
            }
        }
    }
}
