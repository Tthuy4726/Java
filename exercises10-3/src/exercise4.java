import java.io.*;
public class exercise4 {
        public static void main(String[] args) {
            String fileName = "numbers.dat";
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
                int[] numbers = {10, 20, 30, 40, 50};
                for (int num : numbers) {
                    dos.writeInt(num);
                }
                System.out.println("Numbers written to file.");
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Reading from file:");
            try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
                while (true) {
                    System.out.println(dis.readInt());
                }
            } catch (EOFException e) {
                // End of file reached
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

