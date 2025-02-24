public class Student{
      private String studentID;
      private String name;
      private double mark1,mark2,mark3,average;

      public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.mark1 = 0;
        this.mark2 = 0;
        this.mark3 = 0;
    }
    
     public void setMarks(double m1, double m2, double m3) {
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
    }
   
    // Method to calculate average
    public void calculateAverage() {
        this.average = (mark1 + mark2 + mark3) / 3;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Average Marks: " + average);
    }
}
