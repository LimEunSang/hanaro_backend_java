import java.util.Random;

public class Problem_2 {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        Random r = new Random();

        for(int i=0; i<lotto.length; ++i) {
            lotto[i] = r.nextInt(45) + 1;

            // 중복 검사
            boolean flag = false;
            for(int j=0; j<i; ++j) {
                if(lotto[i] == lotto[j]) {
                    flag = true;
                    System.out.print(lotto[i] + "(중복발생! 재추첨) ");
                    i--;
                    break;
                }
            }

            if(!flag) System.out.print(lotto[i] + " ");
        }
    }
}