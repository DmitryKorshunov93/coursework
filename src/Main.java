public class Main {

    public static void printCostsPerMonth(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        System.out.println(sum);
        ;
    }

    public static void printMaxMinSalary(Employee[] employee) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < min) {
                min = employee[i].getSalary();
            }
            if (employee[i].getSalary() > max) {
                max = employee[i].getSalary();
            }
        }
        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) {
            System.out.println("Error");
        } else {
            System.out.println("Сотрудник с минимальной зарплатой " + min);
            System.out.println("Сотрудник с максимальной зарплатой " + max);
        }
    }

    public static void printAvarageValue(Employee[] employee) {
        double sum1 = 0;

        for (int i = 0; i < employee.length; i++) {
            sum1 = sum1 + employee[i].getSalary();
        }
        double avarageValue = sum1 / employee.length;
        System.out.println(avarageValue);
    }

    public static void printFullName(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFullName());
        }
    }

    public static void print(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("Дмитриев Александр Васильевич", 3, 50000);
        Employee employee2 = new Employee("Алексеев Дмитрий Владимирович", 1, 50000);
        Employee employee3 = new Employee("Иванов Александр Валерьевич", 3, 40000);
        Employee employee4 = new Employee("Егорова Александра Дмитриевна", 5, 56000);
        Employee employee5 = new Employee("Лунин Владимир Валерьевич", 3, 67000);
        Employee employee6 = new Employee("Пирогин Александр Константинович", 2, 36000);
        Employee employee7 = new Employee("Шурыгин Дмитрий Валерьевич", 1, 41000);
        Employee employee8 = new Employee("Бабина Алина Алексеевна", 4, 79000);
        Employee employee9 = new Employee("Игнатенко Иван Александрович", 5, 71000);
        Employee employee10 = new Employee("Головачев Андрей Михайлович", 4, 65000);

        Employee[] employee = new Employee[10];
        employee[0] = employee1;
        employee[1] = employee2;
        employee[2] = employee3;
        employee[3] = employee4;
        employee[4] = employee5;
        employee[5] = employee6;
        employee[6] = employee7;
        employee[7] = employee8;
        employee[8] = employee9;
        employee[9] = employee10;

        System.out.println("Список всех сотрудников");

        print(employee);

        System.out.println();

        System.out.println("Сотрудники с минимальной и максимальной зарплатой");

        printMaxMinSalary(employee);

        System.out.println();

        System.out.println("Сумма затрат на зарплаты в месяц");

        printCostsPerMonth(employee);

        System.out.println();

        System.out.println("Cреднее значение зарплат");

        printAvarageValue(employee);

        System.out.println();

        System.out.println("Ф. И. О. всех сотрудников");
        printFullName(employee);
    }
}