public abstract class RectangleTest implements Resizeable {

    @Override
    public void resize(double percent) {




    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        //1, 1, green, filled

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        //2.3, 5.8, green, filled

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        //2.5, 3.8, orange, filled
    }
}