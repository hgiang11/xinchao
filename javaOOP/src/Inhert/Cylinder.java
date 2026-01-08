package Inhert;
import java.util.*;


public class Cylinder extends Circle {

    private final float height;

    public Cylinder(float radius, String color, float height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(float height) {
        this.height = height;
    }

// sai
@Override
    public double getArea() {
        return super.getArea() * height;
    }
}
