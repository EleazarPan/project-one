import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestJava8Lamada {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        filter(list,(str) -> true);
    }

    public static void filter(List<Integer> names, Predicate condition) {
        for (Integer name : names) {
            if (condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }


            }
