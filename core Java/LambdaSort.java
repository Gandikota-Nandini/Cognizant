import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Nandini",
                "Rahul",
                "Anil",
                "Priya"
        );

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println(names);
    }
}