public class Main {
    public static void main(String[] args) {
        Feet mylength = new Feet(5, 6);
        mylength.print("Length: "); 

        Feet newlen = new Feet(6, 7);
        mylength.add(newlen);
        mylength.print(); 

        Feet f1 = new Feet(3, 8);
        Feet f2 = new Feet(4, 10);
        Feet f3 = new Feet(5, 5);
        Feet result = Feet.add(f1, f2, f3);
        Feet.print(result); // Output: 13’11”
    }
}
