import java.io.*;
public class exercise3 {
    public static void main(String[] args) {
        String fileName = "input.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int lines = 0;
            while (br.readLine() != null) {
                lines++;
            }
            System.out.println("Total lines: " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
