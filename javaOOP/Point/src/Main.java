import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in) ;

        int choice ;
        do {
            System.out.println("1.Point");
            System.out.println("2.MoveablePoint");
            System.out.println("0. Thoát");
            System.out.print("Vui lòng chọn: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Point2D");
                    System.out.println("Nhập x : ");
                    float x = sc.nextFloat();
                    System.out.println("Nhập y : ");
                    float y = sc.nextFloat();
                    Point point = new Point(x,y);
                    System.out.println(point);
                    break;

                case 2:
                    System.out.println("MoveablePoint");
                    System.out.println("Nhập x : ");
                    float xm = sc.nextFloat();
                    System.out.println("Nhập y : ");
                    float ym = sc.nextFloat();
                    System.out.println("Nhập xSpeed : ");
                    float xs = sc.nextFloat();
                    System.out.println("Nhập ySpeed : ");
                    float ys = sc.nextFloat();
                    MoveablePoint MoveablePoint = new MoveablePoint(xm,ym,xs,ys);
                    System.out.println(MoveablePoint);
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
