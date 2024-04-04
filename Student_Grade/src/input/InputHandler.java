package input;

import java.util.Scanner;

public class InputHandler {

    private static Scanner scanner = new Scanner(System.in);

    public static int getNumStudents() {
        System.out.print("Enter the number of students: ");
        return scanner.nextInt();
    }

    public static double getStudentGrade(int studentNumber) {
        System.out.print("Enter the grade of student " + studentNumber + ": ");
        return scanner.nextDouble();
    }
}
