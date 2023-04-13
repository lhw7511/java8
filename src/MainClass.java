import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MainClass {

    public static void main(String[] args) {
        /*
        Plus10 plus10 = new Plus10();
        plus10.apply(10);

        Function<Integer,Integer> plus = (i) -> i + 10;
        Function<Integer,Integer> multi = (i) -> i * 2;
        Function<Integer, Integer> compose = plus.compose(multi);
        System.out.println(compose.apply(2));
        */


        UnaryOperator<String> test = (s) -> "hi" + s;
        UnaryOperator<String> hi = Greeting::hi ;
        System.out.println(test.apply("test"));
        System.out.println(hi.apply("test"));

        }
    }

