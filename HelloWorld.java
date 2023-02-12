import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloWorld {

    private static final String FILE_NAME = "README.md";

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

}
