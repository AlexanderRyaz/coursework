public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees [0] = new Employee("Александр Викторович Рязанов", 1, 200);
        employees [1] = new Employee("Александр Викторович Петров", 2, 150);
        employees [2] = new Employee("Александр Викторович Иванов", 3, 115);
        employees [3] = new Employee("Александр Викторович Сидоров", 4, 100);
        employees [4] = new Employee("Александр Викторович Захаров", 5, 155);
        employees [5] = new Employee("Александр Викторович Семенов", 3, 112);
        employees [6] = new Employee("Александр Викторович Патрушев", 2, 200);
        employees [7] = new Employee("Александр Викторович Путин", 3, 299);
        employees [8] = new Employee("Александр Викторович Лукашенко", 5, 300);
        employees [9] = new Employee("Александр Викторович Байден", 1, 100);
        printEmployees(employees);
        System.out.println("////////");
        System.out.println("Суммарная зарплата: " + calculateSalary(employees) );
        System.out.println("////////");
        System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeWithMinSalary(employees) );
        System.out.println("////////");
        System.out.println("Сотрудник с максимальной зарплатой: " + getEmployeeWithMaxSalary(employees) );
        System.out.println("////////");
        System.out.println("Средняя зарплата: " + getAverageSalary(employees));
        System.out.println("////////");
        printFullNames(employees);
    }

    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static double calculateSalary(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();

        }
        return sum;
    }

    public static Employee getEmployeeWithMinSalary(Employee[] employees) {
        Employee employee1 = employees[0];
        double minSalary = employee1.getSalary();
        int employeeIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                employeeIndex = i;
            }
        }
        return employees[employeeIndex];
    }

    public static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee employee1 = employees[0];
        double maxSalary = employee1.getSalary();
        int employeeIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                employeeIndex = i;
            }
        }
        return employees[employeeIndex];
    }
    public static double getAverageSalary (Employee[] employees) {
        return calculateSalary(employees)/employees.length;

    }
    public static void printFullNames (Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

}