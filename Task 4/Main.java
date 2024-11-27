package org.example;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        // ����� �����
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
    }

    // ������ 1
    public static void task1() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // ������ 2
    public static void task2() {
        checkSumSign(5, -10); // ����� �������������
        checkSumSign(10, 15); // ����� �������������
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("����� �������������");
        } else {
            System.out.println("����� �������������");
        }
    }

    // ������ 3
    public static void task3() {
        printColor(50);  // Ƹ����
        printColor(150); // ������
        printColor(-10); // �������
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("�������");
        } else if (value <= 100) {
            System.out.println("Ƹ����");
        } else {
            System.out.println("������");
        }
    }

    // ������ 4
    public static void task4() {
        compareNumbers(10, 20); // a < b
        compareNumbers(20, 10); // a >= b
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // ������ 5
    public static void task5() {
        System.out.println(checkSumInRange(5, 5));  // true
        System.out.println(checkSumInRange(5, 20)); // false
    }

    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // ������ 6
    public static void task6() {
        printIfPositive(10);  // �������������
        printIfPositive(-5);  // �������������
        printIfPositive(0);   // ������������� (0 ��������� �������������)
    }

    public static void printIfPositive(int number) {
        if (number >= 0) {
            System.out.println("����� �������������");
        } else {
            System.out.println("����� �������������");
        }
    }

    // ������ 7
    public static void task7() {
        System.out.println(isPositive(10));  // true
        System.out.println(isPositive(-10)); // false
        System.out.println(isPositive(0));   // true
    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // ������ 8
    public static void task8() {
        repeatString("Hello", 3);
    }

    public static void repeatString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    // ������ 9
    public static void task9() {
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(1900)); // false
        System.out.println(isLeapYear(2024)); // true
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    // ������ 10
    public static void task10() {
        int[] arr = {1, 0, 1, 1, 0, 0, 1};
        invertArray(arr);
        System.out.println(Arrays.toString(arr)); // [0, 1, 0, 0, 1, 1, 0]
    }

    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
    }

    // ������ 11
    public static void task11() {
        int[] array = fillArray();
        System.out.println(Arrays.toString(array));
    }

    public static int[] fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // ������ 12
    public static void task12() {
        int[] arr = {1, 5, 3, 7, 11, 2, 4};
        multiplyIfLessThanSix(arr);
        System.out.println(Arrays.toString(arr)); // [2, 10, 6, 7, 11, 4, 8]
    }

    public static void multiplyIfLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    // ������ 13
    public static void task13() {
        fillDiagonals(5);
    }

    public static void fillDiagonals(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1; // ����� ���������
            array[i][size - i - 1] = 1; // ������ ���������
        }
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    // ������ 14
    public static void task14() {
        int[] array = createArray(5, 7);
        System.out.println(Arrays.toString(array)); // [7, 7, 7, 7, 7]
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}