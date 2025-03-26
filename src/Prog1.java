import java.util.*;

public class Prog1 {

    // Find the second highest number from a list using Stream API.

    public static void main(String[] arg){
        List<Integer> arrList = Arrays.asList(10, 20, 30, 40, 50, 60);
        Optional<Integer> opt = arrList.stream().sorted((a,b)->b-a).skip(1).findFirst();
        System.out.println(opt);

    }
}
