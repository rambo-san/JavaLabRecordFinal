package Learning;

public class Learn1 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int b[] = new int[10];
        for (int i = 0; i < 10; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(b[i]);
        }
        int[][] c = new int[3][3];
        int[][] d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = d[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(c[i][j]);
            }
        }
        for(int[] x : d){
            for(int y : x) {
                System.out.println(y);
            }
        }
        System.out.println("Hello World");
    }
}
