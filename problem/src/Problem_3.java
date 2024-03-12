import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오.");
        int input = sc.nextInt();

        for(int i=1; i<=input; ++i) {
            if(i % 3 == 0) {
                System.out.print("X ");
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
