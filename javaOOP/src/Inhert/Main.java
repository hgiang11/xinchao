package Inhert;
import java.util.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        int choice ;
        do {
            System.out.println("1.Circle");
            System.out.println("2.Cylinder");
            System.out.println("0. Thoát");
            System.out.print("Vui lòng chọn: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Circle");
                    System.out.print("Nhập bán kính : ");
                    float radiusCircle = sc.nextFloat();
                    System.out.println("Nhập màu sắc : ");
                    String colorCircle = sc.next();
                    Circle c = new Circle(radiusCircle , colorCircle);
                    System.out.println(c);
                    c.getArea();

                    break;

                case 2:
                    System.out.println("Cylinder");
                    System.out.print("Nhập bán kính : ");
                    float radiusCylinder = sc.nextFloat();
                    System.out.println("Nhập màu sắc : ");
                    String colorCylinder = sc.next();
                    System.out.print("Nhập chiều cao: ");
                    float height = sc.nextFloat();
                    Cylinder cy = new Cylinder(radiusCylinder, colorCylinder, height);
                    System.out.println(cy);
                    cy.getArea();
                    break;

                case 0:
                    System.out.println("Thoát !");
                    break;
                default:
                    System.out.println("Nhập sai!");
            }
        } while ( choice != 0 );










    }
}
