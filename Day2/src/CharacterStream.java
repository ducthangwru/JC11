
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("input1.txt");
        FileWriter out = new FileWriter("output1.txt");

        int c;

        while ((c = in.read()) != -1) {
            out.write(c);
        }

        in.close();
        out.close();
    }
}
