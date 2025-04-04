import java.sql.Connection;
import java.sql.DriverManager;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        String baseUrl = "https://batdongsan.com.vn"; // Thay bằng URL của trang web bạn muốn crawl
        int numberOfPages = 10; // Số trang muốn crawl

        ExecutorService executor = Executors.newFixedThreadPool(5); // Sử dụng thread pool
        try {
            // Kết nối MySQL (Kiểm tra trước để đảm bảo kết nối)
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/RealEstateDB", "root", "password");
            System.out.println("Connected to MySQL");

            // Tạo các thread để crawl từng trang
            for (int i = 1; i <= numberOfPages; i++) {
                String url = baseUrl + "/page-" + i; // URL với các trang (cần điều chỉnh cấu trúc URL của trang web)
                executor.submit(new CrawlTask(url)); // Mỗi thread sẽ crawl một trang
            }

            // Đóng Executor sau khi tất cả các task hoàn thành
            executor.shutdown();
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);

            System.out.println("Crawl completed and data saved to MySQL.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
