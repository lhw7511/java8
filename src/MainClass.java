import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

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

        /*
        UnaryOperator<String> test = (s) -> "hi" + s;
        UnaryOperator<String> hi = Greeting::hi ;
        System.out.println(test.apply("test"));
        System.out.println(hi.apply("test"));



        Function<String,Greeting> newGreeting2 = Greeting::new;
        Greeting test1 = newGreeting2.apply("test");
        System.out.println(test1.getName());
        */

        List<OnlineClass> springClass = new ArrayList<>();
        springClass.add(new OnlineClass(1,"spring boot",true));
        springClass.add(new OnlineClass(2,"spring data jpa",true));
        springClass.add(new OnlineClass(3,"spring mvc",false));
        springClass.add(new OnlineClass(4,"spring core",false));
        springClass.add(new OnlineClass(5,"rest api development",false));

        System.out.println("spring으로 시작하는 수업");
        springClass.stream().filter(c -> c.getTitle().startsWith("spring")).forEach(oc -> System.out.println(oc.getId()));



        System.out.println("close 되지 않은 수업");
        springClass.stream().filter(Predicate.not(OnlineClass::isClosed)).forEach(oc -> System.out.println(oc.getId()));

        System.out.println("수업이름만 모으기");

        springClass.stream().map(OnlineClass::getTitle).forEach(System.out::println);

        System.out.println("스프링수업중에 제목에 spring이 들어간것만 리스트로 만들기");
        springClass.stream().
                filter(oc->oc.getTitle().contains("spring")).
                map(OnlineClass::getTitle).
                collect(Collectors.toList());

    }
    }

