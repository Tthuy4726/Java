import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CrawlTask implements Runnable {
    private String url;
    private static final Lock lock = new ReentrantLock();

    public CrawlTask(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            Document doc = Jsoup.connect(url).get();
            Elements listings = doc.select(".listing"); // Chỉnh sửa theo cấu trúc của trang web

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/RealEstateDB", "root", "password");
            String sql = "INSERT INTO real_estate (title, price, address, area, description) VALUES (?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);

            for (Element listing : listings) {
                String title = listing.select(".title").text();
                String price = listing.select(".price").text();
                String address = listing.select(".address").text();
                String area = listing.select(".area").text();
                String description = listing.select(".description").text();

                // Ghi dữ liệu vào database
                stmt.setString(1, title);
                stmt.setString(2, price);
                stmt.setString(3, address);
                stmt.setString(4, area);
                stmt.setString(5, description);
                stmt.executeUpdate();
            }
        } catch (IOException | java.sql.SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (java.sql.SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
