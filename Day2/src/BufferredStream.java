import java.io.*;

public class BufferredStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("input.txt"));
        int c = 0;
        while ((c = in.read()) != -1)
            System.out.print((char) c);

        in.close();
    }
}
