package ru.geekbrains;

public class Employee {
    // задаю имена полям класса
    String name; //ФИО
    String position; //должность
    String email; //емейл
    String phone_number; //номер телефона
    int salary; //зарплата
    int age; //возраст

    // использую this для ссылки на объекты, в скобках переменные, я к ним обращаюсь и уточняю, кто они есть)
    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    // Переопределяю метод toString
    @Override
    public String toString() {
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, email, phone_number, salary, age);
    }

    // печатаю
    public void print() {
        System.out.println(this);
    }

    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Александр Немиров", "Генеральный директор", "an@gmb.ru", "+79213564545", 500000, 50);
        persArray[1] = new Employee("Татьяна Немирова", "Заместитель директора по коммерческим вопросам", "tn@gmb.ru", "+79213254320", 380000, 45);
        persArray[2] = new Employee("Томиль Раядов", "Начальник службы безопасности", "tr@gmb.ru", "+79217752385", 350000, 39);
        persArray[3] = new Employee("Маргарита Раядова", "Главный бухгалтер", "mn@gmb.ru", "+79215354989", 120000, 39);
        persArray[4] = new Employee("Игорь Немиров", "Ведущий менеджер по работе с клиентами", "in@gmb.ru", "+79215554474", 200000, 24);

        // сделаламассив из 5 сотрудников, если у объекта в ячейке i поле age > 40, то у него вызывается метод print()
        for (Employee employee : persArray) if (employee.age > 40) employee.print();
    }
}






