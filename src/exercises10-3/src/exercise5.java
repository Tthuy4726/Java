import java.io.*;
public class exercise5 {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Public\\Documents"); // Chỉnh sửa đường dẫn thư mục tại đây
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Invalid directory.");
        }
    }
}
