package bank;

public class Account {
    public String accountType = "계좌";
    private String accountNumber; // 계좌번호
    private String customerName; // 고객명
    private long balance; // 잔액
    private double interestRate; // 이자율

    public Account() {
    }

    public Account(String accountNumber, String customerName, long balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // 출금
    public void withdraw(long amount) {
        if (amount > balance) {
            System.out.println("[출금불가] 잔액이 부족합니다.");
            return;
        }
        if (amount <= 0) {
            System.out.println("[출금불가] 금액을 다시 입력해주세요.");
            return;
        }
        balance -= amount;
    }

    // 입금
    public void deposit(long amount) {
        if (amount <= 0) {
            System.out.println("[입금불가] 금액을 다시 입력해주세요.");
            return;
        }
        balance += amount;

        System.out.println("[안내] " + amount + "원이 입금되었습니다.");
    }

    // 이자 조회
    public double getInterest() {
        return this.balance * this.interestRate / 100;
    }

    // 출력 함수
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[안내] " + accountType + "가 개설되었습니다!🥳\n");
        sb.append("➜ Account{\"");
        sb.append("accountNumber='").append(accountNumber).append('\'');
        sb.append(", customerName='").append(customerName).append('\'');
        sb.append(", balance=").append(balance);
        sb.append(", interestRate=").append(interestRate);
        sb.append('}');
        return sb.toString();
    }

    // getter

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public long getBalance() {
        return balance + (long) getInterest();
    }

    public double getInterestRate() {
        return interestRate;
    }
}
