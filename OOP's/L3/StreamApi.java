// Use to process collection of objects
// Stream<T> stream()
import java.util.*;
import java.util.stream.*;
public class StreamApi{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Alice", "Bob", "Joe");
        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("J"))
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}