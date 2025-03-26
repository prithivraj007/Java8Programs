import java.util.*;

public class count {
    public static void main(String[] args) {
        // Count the number of elements greater than 50 in a list.

        List<Integer> numbers = Arrays.asList(10, 60, 70, 40, 30);
        long values = numbers.stream().filter(a->(a>50)).count();
        System.out.println(values);
    }
}
