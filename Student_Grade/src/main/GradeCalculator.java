package main;

import input.InputHandler;
import util.GradeCalculatorUtil;

public class GradeCalculator {

    public static void main(String[] args) {
        int numStudents = InputHandler.getNumStudents();
        double totalGrade = 0;

        for (int i = 1; i <= numStudents; i++) {
            double grade = InputHandler.getStudentGrade(i);
            totalGrade += grade;
        }

        double averageGrade = GradeCalculatorUtil.calculateAverageGrade(totalGrade, numStudents);
        System.out.println("The average grade of the students is: " + averageGrade);
    }
}
