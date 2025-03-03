public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", "Computer Science", "123456789");
        Student student2 = new Student("Jane Smith", "Software Engineering", "987654321");
        Student student3 = new Student("Alice Brown", "Data Science", "555555555");
        Student student4 = new Student("Bob Johnson", "Information Technology", "444444444");
        Student student5 = new Student("Charlie White", "Cybersecurity", "666666666");

        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            student.print();
            System.out.println("--------------------");
        }
    }
}
