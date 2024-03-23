import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //even number
        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        //Map for converting to UpperCase
        List<String> list1 = Arrays.asList("Apple" , "banana" , "watermelon");
        list1.stream().map(String :: toUpperCase).forEach(System.out::println);


        //Sum using reduce
        int sum = list.stream().reduce(0,Integer::sum);
        System.out.println("Sum : " + sum );

        //Collecting with Starting Letter A
        List<String>startWithA = list1.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println(startWithA);

    }
}
