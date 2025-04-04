import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class exercise6 {
    public static void main(String[] args) {
        String[] inputFiles = {"file1.txt", "file2.txt", "file3.txt"};
        String outputFile = "output.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(output.txt))) {
            for (String fileName : files) {
                Thread thread = new Thread(new FileMergeTask(fileName, writer));
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class FileMergeTask implements Runnable {
    private String fileName;
    private BufferedWriter writer;

    public FileMergeTask(String fileName, BufferedWriter writer) {
        this.fileName = fileName;
        this.writer = writer;
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            synchronized (writer) { // Prevent multiple threads from writing at the same time
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
