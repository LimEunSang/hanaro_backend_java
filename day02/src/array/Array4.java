package array;

import java.util.Arrays;
import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        // int 형 배열, 사이즈 10
        // 배열에 1~10까지의 숫자를 Random 하게 넣고
        // 합과 평균을 구하시오

        int[] a = new int[10];
        int sumA = 0;
        Random r = new Random();
        for(int i=0; i<a.length; ++i) {
            a[i] = r.nextInt(10) + 1;
            sumA += a[i];
        }

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("a 합: " + sumA);
        System.out.println("a 평균: " + sumA/a.length);

        // int 형 배열, 사이즈 10
        // 배열에 1~100까지의 숫자를 Random 하게 넣고
        // 단 중복되지 않는 숫자를 입력
        // 합과 평균을 구하시오

        int[] b = new int[10];
        int sumB = 0;
        for(int i=0; i<b.length; ++i) {
            b[i] = r.nextInt(100) + 1;
            for(int j=0; j<i; ++j) {
                if(b[i] == b[j]) {
                    i--;
                    break;
                }
            }

            sumB += b[i];
        }

        System.out.println("b: " + Arrays.toString(b));
        System.out.println("b 합: " + sumB);
        System.out.println("b 평균: " + sumB/a.length);
    }
}
