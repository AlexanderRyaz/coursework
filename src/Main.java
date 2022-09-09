public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        Employee employee1 = new Employee("Александр Викторович Рязанов", 1, 200);
        Employee employee2 = new Employee("Александр Викторович Петров", 2, 150);
        Employee employee3 = new Employee("Александр Викторович Иванов", 3, 115);
        Employee employee4 = new Employee("Александр Викторович Сидоров", 4, 100);
        Employee employee5 = new Employee("Александр Викторович Захаров", 5, 155);
        Employee employee6 = new Employee("Александр Викторович Семенов", 3, 112);
        Employee employee7 = new Employee("Александр Викторович Патрушев", 2, 200);
        Employee employee8 = new Employee("Александр Викторович Путин", 3, 299);
        Employee employee9 = new Employee("Александр Викторович Лукашенко", 5, 300);
        Employee employee10 = new Employee("Александр Викторович Байден", 1, 100);


        employeeBook.addEmployee(employee1);
        employeeBook.addEmployee(employee4);
        employeeBook.addEmployee(employee3);
        employeeBook.addEmployee(employee2);
        employeeBook.addEmployee(employee5);
        employeeBook.addEmployee(employee6);
        employeeBook.addEmployee(employee7);
        employeeBook.addEmployee(employee8);
        employeeBook.addEmployee(employee9);
        employeeBook.addEmployee(employee10);
        employeeBook.printAllEmployeesByDepartment();

    }


}