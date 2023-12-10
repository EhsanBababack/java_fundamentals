public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] mt = new int[11][11];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                mt[i][j] = i * j;
            }
        }
//        ................................
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(mt[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
