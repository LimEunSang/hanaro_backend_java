package array;

public class Array6 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(a.length); // 2
        System.out.println(a[0].length); // 3

        for(int i=0; i<a.length; ++i) {
            for(int j=0; j<a[i].length; ++j) {
                System.out.printf("[%d][%d] : %d  ", i, j, a[i][j]);
            }
            System.out.println();
        }

        for(int[] arr : a) {
            for(int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
