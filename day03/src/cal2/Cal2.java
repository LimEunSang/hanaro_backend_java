package cal2;

public class Cal2 {
    static double PI = 3.14;

    public static double sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double div(int num1, int num2) {
        return num1 / (double) num2;
    }

    public static double getCircleArea(int r) {
        return r * r * PI;
    }
}
