import java.util.*;

public class MoveablePoint extends Point {

    protected float xSpeed;
    protected float ySpeed;

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xs, float ys) {
        this.xSpeed = xs;
        this.ySpeed = ys;
    }

    public float[] getSpeed() {
        return new float[] {xSpeed, ySpeed};
    }



    // move() dùng để di chuyển điểm hoặc cập nhật vị trí của điểm
    public MoveablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xs=" + xSpeed +
                ", ys=" + ySpeed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
