public class First {
    public static void Run() {
        String[][] table = new String[8][8];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                if ((j  + i) % 2 == 0 ) {
                    table[i][j] = "W";
                } else {
                    table[i][j] = "B";
                }
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
