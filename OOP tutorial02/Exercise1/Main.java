import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        Student student = new Student(id, name);

        System.out.print("Enter marks for Subject 1: ");
        double m1 = scanner.nextDouble();
        System.out.print("Enter marks for Subject 2: ");
        double m2 = scanner.nextDouble();
        System.out.print("Enter marks for Subject 3: ");
        double m3 = scanner.nextDouble();

        student.setMarks(m1, m2, m3);
        student.calculateAverage();
        student.displayStudentDetails();

        scanner.close();
    }
}
