import java.util.Scanner;

public class IT26102429Lab9Q4 {

    // a) calcFinalMark - 30% assignment + 70% exam
    static double calcFinalMark(double assignment, double exam) {
        return assignment * 0.30 + exam * 0.70;
    }

    // b) findGrades
    static String findGrades(double finalMark) {
        if (finalMark >= 75) {
            return "A";
        } else if (finalMark >= 60) {
            return "B";
        } else if (finalMark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    // c) printDetails
    static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-10s %-12.2f %s\n", name, finalMark, grade);
    }

    // d) Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            String name = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + name + ": ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + name + ": ");
            double exam = input.nextDouble();

            double finalMark = calcFinalMark(assignment, exam);
            String grade = findGrades(finalMark);

            names[i] = name;
            finalMarks[i] = finalMark;
            grades[i] = grade;
        }

        System.out.println();
        System.out.printf("%-10s %-12s %s\n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}

