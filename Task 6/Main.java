package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("������� 1: ����� \"���������\"");
        task1();

        System.out.println("\n������� 2: ������ �� 5 �����������");
        task2();

        System.out.println("\n������� 3: ����� \"����\" � �������������");
        task3();
    }

    // ������� 1: �������� � ����� ���������� � ����������
    public static void task1() {
        Employee employee = new Employee(
                "������ ����",
                "�������",
                "ivanov@mail.com",
                "1234567890",
                50000,
                30
        );
        employee.printInfo();
    }

    // ������� 2: ������ �� 5 �����������
    public static void task2() {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("������ ����", "�������", "ivanov@mail.com", "1234567890", 50000, 30);
        employees[1] = new Employee("������ ����", "��������", "petrov@mail.com", "0987654321", 60000, 35);
        employees[2] = new Employee("������� �������", "�����������", "sidorov@mail.com", "1122334455", 70000, 28);
        employees[3] = new Employee("��������� �����", "��������", "kuznetsova@mail.com", "5566778899", 55000, 26);
        employees[4] = new Employee("������� �������", "��������", "smirnov@mail.com", "6677889900", 65000, 40);

        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println("-------------------------");
        }
    }

    // ������� 3: ����� "����" � �������������
    public static void task3() {
        Park park = new Park(3);

        park.addAttraction(0, "������ ���������", "10:00 - 22:00", 300);
        park.addAttraction(1, "������������ �����", "12:00 - 20:00", 500);
        park.addAttraction(2, "������� ������", "11:00 - 21:00", 400);

        park.printAttractions();
    }
}

// ����� "���������"
class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("���: " + fullName);
        System.out.println("���������: " + position);
        System.out.println("Email: " + email);
        System.out.println("�������: " + phone);
        System.out.println("��������: " + salary);
        System.out.println("�������: " + age);
    }
}

// ����� "����"
class Park {
    private Attraction[] attractions;

    public Park(int numberOfAttractions) {
        attractions = new Attraction[numberOfAttractions];
    }

    public void addAttraction(int index, String name, String workingHours, int cost) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attraction(name, workingHours, cost);
        }
    }

    public void printAttractions() {
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                attraction.printInfo();
                System.out.println("-------------------------");
            }
        }
    }

    // ���������� ����� "����������"
    private class Attraction {
        private String name;
        private String workingHours;
        private int cost;

        public Attraction(String name, String workingHours, int cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("��������: " + name);
            System.out.println("����� ������: " + workingHours);
            System.out.println("���������: " + cost + " ������");
        }
    }
}