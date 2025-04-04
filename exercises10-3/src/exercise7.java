import java.io.*;
import java.io.RandomAccessFile;
public class exercise7 {
    public static void main(String[] args) {
        String fileName = "largefile.txt";
        long fileSize = new File(fileName).length();
        int numThreads = 4;
        long chunkSize = fileSize / numThreads;

        for (int i = 0; i < numThreads; i++) {
            long start = i * chunkSize;
            long end = (i == numThreads - 1) ? fileSize : (i + 1) * chunkSize;
            new Thread(new FileReadTask(fileName, start, end)).start();
        }
    }
}

class FileReadTask implements Runnable {
    private String fileName;
    private long start, end;

    public FileReadTask(String fileName, long start, long end) {
        this.fileName = fileName;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        try (RandomAccessFile file = new RandomAccessFile(fileName, "r")) {
            file.seek(start);
            byte[] buffer = new byte[(int) (end - start)];
            file.read(buffer);
            System.out.println(new String(buffer));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
