import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class exercise8 implements Runnable {
    private String fileName;
    private String keyword;

    public exercise8(String fileName, String keyword) {
        this.fileName = fileName;
        this.keyword = keyword;
    }

    @Override
    public void run() {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(keyword)) {
                    count++;
                }
            }
            System.out.println("File: " + fileName + " - Occurrences: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String keyword = "Java";
        String[] files = {"file1.txt", "file2.txt", "file3.txt"};
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (String file : files) {
            executor.execute(new exercise8(file, keyword));
        }
        executor.shutdown();
    }
}
