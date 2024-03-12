package app;

import bank.Account;
import bank.DepositAccount;
import bank.SavingAccount;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        // 일반 계좌 테스트
        Account account = new Account("1002123123312", "황혬숙", 1000, 0.2);
        System.out.println(account);

        account.withdraw(0);
        account.withdraw(10000);
        account.deposit(0);
        account.deposit(5000);
        System.out.println("이자 : " + account.getInterest() + "원");
        System.out.println("총액 : " + account.getBalance() + "원");


        // 예금 계좌 테스트
        DepositAccount depositAccount = new DepositAccount("1002123123323", "임은동", 500, 0.2, new Date(2030, 4, 10));
        System.out.println(depositAccount);

        account.withdraw(0);
        account.withdraw(10000);
        account.withdraw(500);
        account.deposit(8000); // 예금은 최초 1회만 입금 가능
        System.out.println("이자 : " + account.getInterest() + "원");
        System.out.println("총액 : " + account.getBalance() + "원");

        // 적금 계좌  테스트
        SavingAccount savingAccount = new SavingAccount(
                "1002123445566",
                "김루피",
                0,
                0.03,
                24,
                20_0000,
                11
        );
        System.out.println(savingAccount);
        savingAccount.withdraw(0);
        savingAccount.withdraw(10000);
        savingAccount.withdraw(500);
        savingAccount.deposit(10_000);
        savingAccount.deposit(20_0000);
        savingAccount.deposit(20_0000);
        System.out.println("이자 : " + savingAccount.getInterest() + "원");
        System.out.println("총액 : " + savingAccount.getBalance() + "원");
        System.out.println("만기예상액 : " + savingAccount.getMaturityAmount() + "원");
    }
}
