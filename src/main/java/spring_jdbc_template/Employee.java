package spring_jdbc_template;

public class Employee {
    private int eid;
    private String eName;
    private double eSalary;

    public Employee() {
    }

    public Employee(int eid, String eName, double eSalary) {
        this.eid = eid;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", eName='" + eName + '\'' +
                ", eSalary=" + eSalary +
                '}';
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public double geteSalary() {
        return eSalary;
    }

    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }
}
