import java.io.*;

public class BufferredStream {
    public static void main(String[] args) {
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("input.txt"));
            int c = 0;
            try {
                while ((c = in.read()) != -1)
                    System.out.print((char) c);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
