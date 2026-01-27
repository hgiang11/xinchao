import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopier {

    public int copy(String sourcePath, String targetPath) throws IOException {

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.out.println("File nguồn không tồn tại");
            return -1;
        }

        if (targetFile.exists()) {
            System.out.println("File đích đã tồn tại");
            return -1;
        }

        FileInputStream input = new FileInputStream(sourceFile);
        FileOutputStream output = new FileOutputStream(targetFile);

        int count = 0;
        int data;

        while ((data = input.read()) != -1) {
            output.write(data);
            count++;
        }

        input.close();
        output.close();

        return count;
    }
}
