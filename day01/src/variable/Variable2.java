package variable;

public class Variable2 {

    public static void main(String[] args) {
        byte a1 = 100;
        byte a2 = 100;
        byte a3 = (byte) (a1 + a2);
        System.out.println("a3: " + a3);
        long a5 = 2150000000L;
        long a6 = 1150000000 + 1150000000L;
        System.out.println("a6: " + a6);

        char c = 'a';
        System.out.println((int)c);

        double d = 10.0;
        float f = 10.0f;

        char c2 = '\u0042'; // unicode
        System.out.println("c2: " + c2);

        char c3 = 0xac00; // 16진수
        System.out.println("c3: " + c3);
    }
}
