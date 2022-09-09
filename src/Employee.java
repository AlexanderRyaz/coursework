public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private int id;

    private static int counter = 1;



    public Employee (String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter++;
    }
    public String getFullName () {
        return this.fullName;
    }
    public int getDepartment () {
        return  this.department;
    }
    public double getSalary() {
        return this.salary;
    }
    public int getId () {
        return this.id;
    }
    public void setDepartment (int department) {
        this.department = department;
    }
    public  void setSalary (double salary) {
        this.salary = salary;
    }
    @Override
    public String toString () {
        return this.id + ". " + this.fullName + ", Отдел № " + this.department + ", зароботная плата " + this.salary;
    }
}
