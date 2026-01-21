import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị của a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập giá trị của b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập giá trị của c: ");
        double c = sc.nextDouble();



        try {
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalArgumentException("Cạnh phải lớn hơn 0");

            }
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalArgumentException("Ba cạnh không tạo thành tam giác");

            }


            Triangular triangular1 = new Triangular(a, b, c);
            System.out.println("Diện tích tam giác là: " + triangular1.area());


        }catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }finally {
            System.out.println("Kết thúc chương trình !");
        }
    }
}