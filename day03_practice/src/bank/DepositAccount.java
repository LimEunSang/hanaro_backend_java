package bank;

import java.time.LocalDate;
import java.util.Date;

// 예금 계좌
public class DepositAccount extends Account {
    private Date expirationDate; // 만료일

    public DepositAccount() {
    }

    public DepositAccount(String accountNumber, String customerName, long balance, double interestRate, Date expirationDate) {
        super(accountNumber, customerName, balance, interestRate);
        this.expirationDate = expirationDate;
        this.accountType = "예금 계좌";
    }

    // 출금
    @Override
    public void withdraw(long amount) {
        Date today = java.sql.Date.valueOf(LocalDate.now());
        if (today.before(expirationDate)) {
            System.out.println("[출금불가] 예금 만료일 전입니다.");
            return;
        }
        super.withdraw(amount);
    }

    // 입금
    @Override
    public void deposit(long amount) {
        System.out.println("[입금불가] 예금은 최초 1회만 가능합니다.");
    }

    // 출력 함수
    @Override
    public String toString() {
        return super.toString() + "\n➜ 만료일 : " + expirationDate;
    }
}
