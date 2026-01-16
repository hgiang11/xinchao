//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0, "red", true);
        shapes[1] = new Rectangle(7, 9, "rex", true);
        shapes[2] = new Square(12, "red", true);


        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                ((Circle) shape).resize(100);
            } else if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(100);
            } else if (shape instanceof Square) {
                ((Square) shape).resize(100);
            }
            System.out.println(shape);
            System.out.println();
        }
    }
}