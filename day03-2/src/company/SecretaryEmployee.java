package company;

public class SecretaryEmployee extends Employee{
    // 생성자를 제외한 모든 멤버를 상속받는다

    private String boss;

    public SecretaryEmployee() {
    }

    public SecretaryEmployee(String id, String name, String dept, long salary, String boss) {
        super(id, name, dept, salary); // 반드시 첫 번째 줄에 위치
        this.boss = boss;
    }

    public String getBoss() {
        return boss;
    }


    @Override
    public String toString() {
        return super.toString() + this.boss;
    }
}
