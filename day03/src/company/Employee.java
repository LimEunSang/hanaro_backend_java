package company;

public class Employee {
    private int id;
    private String idc;
    private String name; // 이름
    private long sal; // 급여
    private static int num = 100;

    public Employee(){
        System.out.println("Default Constructor ...");
    }

    public Employee(int id) {
        this(id, "", "");
        this.sal = 10000L;
    }

    public Employee(int id, String idc, String name) {
        this(id, idc, name, 100000L);
    }

    public Employee(int id, String idc, String name, long sal) {
        this.id = num++;
        this.idc = idc;
        this.name = name;
        this.sal = sal;
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

    public long getSal() {
        return sal;
    }

    // Methods, Operator
    public long getAnnSalary(){
        return sal * 12;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", idc='").append(idc).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", sal=").append(sal);
        sb.append('}');
        return sb.toString();
    }
}
