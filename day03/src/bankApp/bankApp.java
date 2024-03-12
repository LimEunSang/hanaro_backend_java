package bankApp;

import bank.Account;

public class bankApp {
    public static void main(String[] args) {
        // 객체 생성 전에 클래스 변수를 호출할 수 있다.
        System.out.println(Account.count);

        Account acc1 = new Account("", "James", 1000L, 2.3);
        Account acc2 = new Account("", "James", 1000L, 2.3);
        Account acc3 = new Account("", "James", 1000L, 2.3);
        Account acc4 = new Account("", "James", 1000L, 2.3);

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        System.out.println(acc4);
//        acc1.deposit(-1000L);
//        System.out.println(acc1);
//        acc1.withdraw(100000000L);
//        System.out.println(acc1);
//        System.out.println(acc1.getCalInterest());
//        System.out.println(acc1.getCalInterest(12));

        System.out.println(Account.count);

        System.out.println(Math.PI);
    }
}
