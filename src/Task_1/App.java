package Task_1;

public class App {
    public static void main(String[] args) {
        Square sq = new Square(12);
        System.out.println(sq.getArea());
        Rectangle rec = new Rectangle(12, 10);
        System.out.println(rec.getArea());
        rec.setHeight(10);
        System.out.println(rec.getArea());
        Circle circ = new Circle(10);
        System.out.println(circ.getArea());
    }
}
