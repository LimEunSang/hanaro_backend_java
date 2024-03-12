import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요일을 입력하시오.");
        int input = sc.nextInt();
        if(input % 2 == 0) {
            System.out.println("enjoy!");
        } else {
            System.out.println("oh my god~");
        }
    }
}