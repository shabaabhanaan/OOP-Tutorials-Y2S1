import java.util.Scanner;

public class PointApp{
     public static void main(String[] args){
           Scanner scanner = new Scanner(System.in);
            
           System.out.print("Enter x,y,z :");
           double x1 = scanner.nextDouble();
           double y1 = scanner.nextDouble();
           double z1 = scanner.nextDouble();
           
           Point3D point1 = new Point3D(x1,y1,z1);
          
           System.out.print("Enter x,y,z :");
           double x2 = scanner.nextDouble();
           
           double y2 = scanner.nextDouble();
           double z2 = scanner.nextDouble();
           
            Point3D point2 = new Point3D(x2,y2,z2);

          System.out.println("Distance of first point from origin: " + point1.distance());
          System.out.println("Distance of second point from origin: " + point2.distance());
          scanner.close();
}
}