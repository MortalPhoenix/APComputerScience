package Chapter_4.Labs.Grades;

import java.util.Scanner;

public class Student {

    private String name;
    private int test1, test2;

    public Student(String studentName) {
        name = studentName;
    }

    public void inputGrades() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the grade for test 1: ");
        test1 = input.nextInt();

        System.out.print("Enter the grade for test 2: ");
        test2 = input.nextInt();
    }

    public double getAverage() {
        return ((double) (test1 + test2)) / 2;
    }

    public void getName() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", test1=" + test1 +
                ", test2=" + test2 +
                '}';
    }
}
