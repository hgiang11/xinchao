public abstract class SquareTest extends Square implements Colorable, Resizeable {



    @Override public void resize(double percent) {
        double newSide = getSide() * (percent / 100 + 1); setWidth(newSide); setLength(newSide);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides...");
    }
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        //1, 1, 1, green, filled

        square = new Square(2.3);
        System.out.println(square);
        //2.3, 2.3, 1, green, filled

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
        //5.8, 5.8, 1, yellow, filled


    }
}