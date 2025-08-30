// The "try-with-resources" statement in Java is used to automatically manage resources like files, sockets, or database connections that need to be closed after use. It ensures that each resource is closed at the end of the statement, even if an exception occurs. This feature was introduced in Java 7.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("gfgtextfile.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}