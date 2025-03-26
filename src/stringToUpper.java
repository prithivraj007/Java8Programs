import java.util.*;
import java.util.stream.*;
public class stringToUpper {
    // Convert a list of strings to uppercase using Stream API.

    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "cherry");
        List<String> upperNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperNames);
    }
}
