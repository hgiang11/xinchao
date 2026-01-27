import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập file nguồn: ");
        String sourcePath = sc.nextLine();

        System.out.print("Nhập file đích: ");
        String targetPath = sc.nextLine();

        FileCopier copier = new FileCopier();

        try {
            int result = copier.copy(sourcePath, targetPath);

            if (result != -1) {
                System.out.println("Sao chép thành công");
                System.out.println("Số ký tự: " + result);
            }

        } catch (IOException e) {
            System.out.println("Có lỗi khi sao chép file");
        }
    }
}
