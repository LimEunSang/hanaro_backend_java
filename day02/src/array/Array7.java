package array;

import java.util.Random;

public class Array7 {
    public static void main(String[] args) {
        // 5행 5열 배열에
        // Random 하게 중복되지 않은 1~100까지의 수 발생
        // 각 열에 최대값의 합과 최소값의 합 출력

        Random r = new Random();

        int[][] a = new int[5][5];
        for(int i=0; i<a.length; ++i) {
            int max = 0, min = 0;

            for(int j=0; j<a[i].length; ++j) {
                a[i][j] = r.nextInt(100) + 1;

                // 중복 제거
                for (int k = 0; k < j; ++k) {
                    if (a[i][j] == a[i][k]) {
                        j--;
                        break;
                    }
                }

                if (j == 0) {
                    max = a[i][j];
                    min = a[i][j];
                } else {
                    max = (a[i][j] > max) ? a[i][j] : max;
                    min = (a[i][j] < min) ? a[i][j] : min;
                }

                if (j == a[i].length - 1) {
                    System.out.println(i + "행의 max = " + max);
                    System.out.println(i + "행의 min = " + min);
                    System.out.println(i + "행의 max + min = " + (max + min));
                }
            }
        }

        /* print arr
        for(int[] arr : a) {
            for(int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        */
    }
}
