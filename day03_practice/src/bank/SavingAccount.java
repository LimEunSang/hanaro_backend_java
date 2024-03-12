package bank;

import java.time.LocalDate;
import java.time.Period;

// 적금 계좌
public class SavingAccount extends Account {
    private int depositCount = 0; // 적금 카운트
    private LocalDate startDate; // 적금 시작일
    private LocalDate expirationDate; // 적금 만료일
    private int durationMonth; // 적금 기간 (개월)
    private long monthlyAmount; // 매월 적금 금액
    private int depositDay; // 매월 적금 일

    public SavingAccount() {
    }

    public SavingAccount(String accountNumber, String customerName, long balance, double interestRate, int durationMonth, long monthlyAmount, int depositDay) {
        super(accountNumber, customerName, balance, interestRate);
        this.durationMonth = durationMonth;
        this.monthlyAmount = monthlyAmount;
        this.depositDay = depositDay;

        this.startDate = LocalDate.now();
        this.expirationDate = startDate.plusMonths(durationMonth);
    }

    // 출금
    @Override
    public void withdraw(long amount) {
        LocalDate today = LocalDate.now();
        if (today.isBefore(expirationDate)) {
            System.out.println("[출금불가] 적금 만료일 전입니다.");
            return;
        }
        super.withdraw(amount);
    }

    // 입금
    @Override
    public void deposit(long amount) {
        LocalDate today = LocalDate.now();
        if (today.getDayOfMonth() != depositDay) {
            System.out.println("[입금불가] 적금 가능한 날은 매월 " + depositDay + "일 입니다.");
            return;
        }
        if (amount != monthlyAmount) {
            System.out.println("[입금불가] 적금 금액은 매달 " + monthlyAmount + "원 입니다.");
            return;
        }
        Period period = Period.between(startDate, today);
        if (depositCount >= period.getMonths() + 1) {
            System.out.println("[입금불가] 이미 납부하셨으며, 월 1회만 납부 가능합니다.");
            return;
        }
        super.deposit(amount);
        depositCount++;
    }

    // 만기 예상 금액
    public long getMaturityAmount() {
        return (long) (this.monthlyAmount * this.durationMonth * (1 + this.getInterestRate() * (this.durationMonth / 12)));
    }
}
