package loop;

public class Loop2 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=10; ++i) {
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        int i = 1;
        while(i <= 10) {
            sum += i;
            ++i;
        }

        System.out.println(sum);
    }
}
