import java.util.function.Function;

public class MainClass {

    public static void main(String[] args) {
        Plus10 plus10 = new Plus10();
        plus10.apply(10);

        Function<Integer,Integer> plus = (i) -> i + 10;
        Function<Integer,Integer> multi = (i) -> i * 2;
        Function<Integer, Integer> compose = plus.compose(multi);
        System.out.println(compose.apply(2));

    }
    }

