import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class ReverseAString {


    public String reverse(String input)
    {
        String[] substrings = input.split(" ");
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(substrings));
        StringBuilder stringBuilder = new StringBuilder();
        while(!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
            stringBuilder.append(" ");
        }

        return stringBuilder.toString();

    }

    public  String reverseEff(String input) // Constant time and efficient
    {
        String[] substrings = input.trim().split("\\s+"); // regex for spaces in between words
        Collections.reverse(Arrays.asList(substrings));
        return String.join(" " , substrings);

    }

    public static void main(String[] args) {
        String s = "i love programming very much";
        ReverseAString reverseAString = new ReverseAString();
        String res = reverseAString.reverseEff(s);
        System.out.println(res);

    }
}
