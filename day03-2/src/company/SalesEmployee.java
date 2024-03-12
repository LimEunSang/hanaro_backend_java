package company;

public class SalesEmployee extends Employee{
    // 생성자를 제외한 모든 멤버를 상속받는다

    private long bonus;

    public SalesEmployee() {
    }

    public SalesEmployee(String id, String name, String dept, long salary, long bonus) {
        super(id, name, dept, salary); // 반드시 첫 번째 줄에 위치
        this.bonus = bonus;
    }

    public long getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "bonus: " + this.bonus;
    }

    @Override
    public long getAnnSalary() {
        return super.getAnnSalary() + this.bonus;
    }
}
