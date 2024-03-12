package company;

public class Employee {
    private int id;
    private String idc;
    private String name;
    private long salary;

    public Employee() {
    }

    public Employee(int id, String idc, String name, long salary) {
        this.id = id;
        this.idc = idc;
        this.name = name;
        this.salary = salary;
        // this: stack 메모리 공간에 현재 만들어진 객체의 주소값
        // 실제 객체는 new 연산자를 만날 때 생성된다
    }

    public int getId() {
        return id;
    }

    public String getIdc() {
        return idc;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public long getAnnSalary() {
        return salary * 12;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", idc='").append(idc).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
