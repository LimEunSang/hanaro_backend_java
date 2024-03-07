package operator;

public class Operator1 {
    public static void main(String[] args) {
        long a = 10;
        long b = 10;
        int c = (int)(a / b);
        System.out.println("c: " + c);

        int i1 = 10;
        int i2 = 3;
        // double i3 = (double)i1 / (double)i2;
        double i3 = 1.0 * i1 / i2;
        System.out.println("i3: " + i3);

        int result = (i1++) + (++i2);
        System.out.printf("%d %d %d\n", result, i1, i2);

        // 삼항연산자
        int aa = 0;
        if(3 > 5) {
            aa = 6;
        } else {
            aa = 9;
        }

        int bb = (3 > 5) ? 6 : 9;

        // problem
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        // 세 수의 최대값을 구하시오
        int num4 = (num1 > num2) ? ((num1 > num3) ? num1: num3) : ((num2 > num3) ? num2 : num3);


    }
}