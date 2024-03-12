import java.util.Scanner;
import java.lang.String;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isMyTurn = false;

        int cur = 0;
        while(cur < 40) {
            cur++;
            String strCur = Integer.toString(cur);

            // answer
            String answer = "";
            int cnt = 0;
            for(int i=0; i<strCur.length(); ++i) {
                if(strCur.charAt(i) == '3' || strCur.charAt(i) == '6' || strCur.charAt(i) == '9') {
                    ++cnt;
                }
            }

            if(cnt > 0) {
                for(int i=0; i<cnt; ++i) {
                    answer += 'X';
                }
            } else {
                answer = strCur;
            }

            // 컴퓨터 차례일 때
            if(!isMyTurn) {
                System.out.print("컴퓨터 : ");
                if(cnt == 0) {
                    System.out.println(strCur);
                } else {
                    System.out.println(answer);
                }

                isMyTurn = !isMyTurn;
                continue;
            }

            // 내 차례일 때
            System.out.print("나 : ");
            String input = sc.next();

            if(!input.equals(answer)) {
                System.out.println("컴퓨터 승!");
                break;
            }

            if(input.equals("40")) {
                System.out.println("무승부!");
                break;
            }

            isMyTurn = !isMyTurn;
        }

        System.out.println("게임종료");
    }
}
