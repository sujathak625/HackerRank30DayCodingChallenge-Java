import java.util.function.Predicate;

public class Lambda {

    public static void main(String args[]){
        Predicate<Integer> predicate = i-> i > 0;
        System.out.println(predicate.test(-1));
        System.out.println(predicate.test(2));
    }
}
