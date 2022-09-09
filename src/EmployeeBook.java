public class EmployeeBook {
    private Employee[] employees;
    public EmployeeBook(){
        this.employees=new Employee[5];
    }

    public Employee[] getEmployees() {
        return this.employees;
    }

    public void printEmployees() {
        for (Employee employee : this.employees) {
            System.out.println(employee.toString());
        }
    }

    public double calculateSalary() {
        double sum = 0;
        for (Employee employee : this.employees) {
            sum += employee.getSalary();

        }
        return sum;
    }

    public Employee getEmployeeWithMinSalary() {
        Employee employee1 = this.employees[0];
        double minSalary = employee1.getSalary();
        int employeeIndex = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i].getSalary() < minSalary) {
                minSalary = this.employees[i].getSalary();
                employeeIndex = i;
            }
        }
        return this.employees[employeeIndex];
    }

    public Employee getEmployeeWithMaxSalary() {
        Employee employee1 = this.employees[0];
        double maxSalary = employee1.getSalary();
        int employeeIndex = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i].getSalary() > maxSalary) {
                maxSalary = this.employees[i].getSalary();
                employeeIndex = i;
            }
        }
        return this.employees[employeeIndex];
    }

    public double getAverageSalary() {
        return calculateSalary() / this.employees.length;

    }

    public void printFullNames() {
        for (Employee employee : this.employees) {
            System.out.println(employee.getFullName());
        }
    }

    public void changeSalary(double argument) {
        for (Employee employee : this.employees) {
            double salaryChange = employee.getSalary() * argument / 100;
            if (argument > 0) {
                employee.setSalary(employee.getSalary() + salaryChange);
            } else {
                employee.setSalary(employee.getSalary() - salaryChange);
            }
        }
    }

    public Employee getEmployeeWithMinSalary(int department) {
        double minSalary = Double.MAX_VALUE;
        int employeeIndex = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (minSalary > this.employees[i].getSalary() && this.employees[i].getDepartment() == department) {
                minSalary = this.employees[i].getSalary();
                employeeIndex = i;
            }

        }
        return this.employees[employeeIndex];
    }

    public Employee getEmployeeWithMaxSalary(int department) {
        double maxSalary = Double.MIN_VALUE;
        int employeeIndex = 0;
        for (int i = 0; i < this.employees.length; i++) {
            if (maxSalary < this.employees[i].getSalary() && this.employees[i].getDepartment() == department) {
                maxSalary = this.employees[i].getSalary();
                employeeIndex = i;
            }
        }
        return this.employees[employeeIndex];
    }

    public double calculateSalary(int department) {
        double sumSalary = 0;
        for (Employee employee : this.employees) {
            if (department == employee.getDepartment()) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }

    public double getAverageSalary(int department) {
        double sumSalary = 0;
        int employeeCount = 0;
        for (Employee employee : this.employees) {
            if (department == employee.getDepartment()) {
                employeeCount++;
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary / employeeCount;
    }

    public void changeSalary(double argument, int department) {
        for (Employee employee : this.employees) {
            if (department == employee.getDepartment()) {
                double salaryChange = employee.getSalary() * argument / 100;
                employee.setSalary(employee.getSalary() + salaryChange);
            }
        }
    }

    public void printEmployeesByDepartment(int department) {
        System.out.println("Сотрудники отдела № " + department);
        for (Employee employee : this.employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getId() + ". " + employee.getFullName() + ", " + employee.getSalary());
            }
        }
    }

    public void printEmployeesWithSalaryLessThanValue(double value) {
        for (Employee employee : this.employees) {
            if (employee.getSalary() < value) {
                System.out.println(employee.getId() + ". " + employee.getFullName() + ", " + employee.getSalary());
            }
        }
    }

    public void printEmployeesWithSalaryGreaterThanValue(double value) {
        for (Employee employee : this.employees) {
            if (employee.getSalary() >= value) {
                System.out.println(employee.getId() + ". " + employee.getFullName() + ", " + employee.getSalary());
            }
        }
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] == null) {
                this.employees[i] = employee;
                return;
            }

        }
        int arrayEmployeesLength = this.employees.length;
        Employee[] newArray = new Employee[arrayEmployeesLength * 2];
        for (int i = 0; i < this.employees.length; i++) {
            newArray[i] = this.employees[i];
        }
        newArray[arrayEmployeesLength + 1] = employee;
        this.employees = newArray;
    }

    public void deleteEmployee(String fullName, int id) {
        for (int i = 0; i < this.employees.length; i++) {
            Employee employeeByIndex = this.employees[i];
            if (employeeByIndex.getFullName().equals(fullName) && employeeByIndex.getId() == id) {
                this.employees[i] = null;
                return;
            }
        }
        System.out.println("Сотрудника с именем " + fullName + "  и id " + id + " не существует");
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            Employee employeeByIndex = this.employees[i];
            if (employeeByIndex.getId() == id) {
                this.employees[i] = null;
                return;
            }

        }
        System.out.println("Сотрудника с id " + id + " не существует");
    }

    public void updateSalary(String fullName, int id, double salary) {
        for (int i = 0; i < employees.length; i++) {
            Employee employeeByIndex = this.employees[i];
            if (employeeByIndex.getFullName().equals(fullName) && employeeByIndex.getId() == id) {
                employeeByIndex.setSalary(salary);
                return;
            }
        }
        System.out.println("Сотрудника с именем " + fullName + "  и id " + id + " не существует");
    }

    public void updateSalary(int id, double salary) {
        for (int i = 0; i < employees.length; i++) {
            Employee employeeByIndex = this.employees[i];
            if (employeeByIndex.getId() == id) {
                employeeByIndex.setSalary(salary);
                return;
            }
        }
        System.out.println("Сотрудника с id " + id + " не существует");
    }

    public void updateDepartment(String fullName, int id, int department) {
        for (int i = 0; i < employees.length; i++) {
            Employee employeeByIndex = this.employees[i];
            if (employeeByIndex.getFullName().equals(fullName) && employeeByIndex.getId() == id) {
                employeeByIndex.setDepartment(department);
                return;
            }

        }
        System.out.println("Сотрудника с именем " + fullName + "  и id " + id + " не существует");
    }

    public void updateDepartment(int id, int department) {
        for (int i = 0; i < employees.length; i++) {
            Employee employeeByIndex = this.employees[i];
            if (employeeByIndex.getId() == id) {
                employeeByIndex.setDepartment(department);
                return;
            }

        }
        System.out.println("Сотрудника с id " + id + " не существует");
    }
    public void printAllEmployeesByDepartment(){
        for (int department =1; department<6;department++){
            printEmployeesByDepartment(department);
        }
    }
}