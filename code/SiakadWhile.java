import java.util.Scanner;

public class SiakadWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int studentCount = sc.nextInt();
        int i = 0;
        while (i < studentCount) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            int score = sc.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a valid score!");
                continue;
            }
            String grade;
            if (score > 80) grade = "A";
            else if (score > 73) grade = "B+";
            else if (score > 65) grade = "B";
            else if (score > 60) grade = "C+";
            else if (score > 50) grade = "C";
            else if (score > 39) grade = "D";
            else grade = "E";
            System.out.println("The grade of student " + (i + 1) + " is " + grade);
            if (grade.equals("A")) System.out.println("Well done, keep up the good work!");
            i++;
        }
        sc.close();
    }
}
