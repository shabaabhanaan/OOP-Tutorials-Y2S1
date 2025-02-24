public class Point3D{
    private double x,y,z;
    
    public Point3D(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
     public double distance() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}