public abstract class CircleTest implements Resizeable {

    @Override
    public void resize(double percent) {




    }



    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        //1.0, green, filled

        circle = new Circle(3.5);
        System.out.println(circle);
        //3.5, green, filled

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        //3.5, indigo, not filled
    }
}