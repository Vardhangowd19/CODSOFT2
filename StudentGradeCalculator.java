
    import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            totalMarks += scanner.nextInt();
        }

        double averagePercentage = (double) totalMarks / numSubjects;
        String grade = calculateGrade(averagePercentage);

        System.out.printf("Total Marks: %d\nAverage Percentage: %.2f%%\nGrade: %s\n", totalMarks, averagePercentage, grade);
        scanner.close();
    }

    private static String calculateGrade(double average) {
        if (average >= 90) return "A+";
        else if (average >= 80) return "A";
        else if (average >= 70) return "B+";
        else if (average >= 60) return "B";
        else if (average >= 50) return "C";
        else if (average >= 40) return "D";
        else return "F";
    }
}

    

