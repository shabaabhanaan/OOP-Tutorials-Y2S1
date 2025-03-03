public class Feet {
    private int feet;
    private int inches;

    public Feet(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void add(Feet f1, Feet f2) {
        this.feet = f1.feet + f2.feet;
        this.inches = f1.inches + f2.inches;
        if (this.inches >= 12) {
            this.feet += this.inches / 12;
            this.inches = this.inches % 12;
        }
    }

    // Method to display the length
    public void print() {
        System.out.println(feet + "’" + inches + "”");
    }

    public void print(String msg) {
        System.out.println(msg + feet + "’" + inches + "”");
    }

    public Feet(Feet len) {
        this.feet = len.feet;
        this.inches = len.inches;
    }

    public void add(Feet f1) {
        this.feet += f1.feet;
        this.inches += f1.inches;
        if (this.inches >= 12) {
            this.feet += this.inches / 12;
            this.inches = this.inches % 12;
        }
    }

    public static void print(Feet f) {
        System.out.println(f.feet + "’" + f.inches + "”");
    }

    public static Feet add(Feet f1, Feet f2, Feet f3) {
        int totalFeet = f1.feet + f2.feet + f3.feet;
        int totalInches = f1.inches + f2.inches + f3.inches;
        if (totalInches >= 12) {
            totalFeet += totalInches / 12;
            totalInches = totalInches % 12;
        }
        return new Feet(totalFeet, totalInches);
    }
}
