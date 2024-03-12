package array;

public class Array1 {
    public static void main(String[] args) {
        int a [];
        // a = {1, 2, 3}; (X)
        a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[3] = 10;

        for(int i=0; i<a.length; ++i) {
            System.out.println(a[i]);
        }

        int [] b;
        b = new int[] {1, 2, 3, 4, 5};

        int c [] = {1, 2, 3, 4, 5};

        String str [] = {"A", "B", "C"}; // 메모리에 저장되어 있는 구조 파악하기
    }
}
