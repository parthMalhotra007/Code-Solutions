public class RemoveOneLetter {

    public String removeLetter(String s, int x)
    {
        if(s == null && s.isEmpty())
        {
            return " ";
        }

        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.deleteCharAt(x);

        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        String input = "example";
        RemoveOneLetter removeOneLetter = new RemoveOneLetter();
        String output = removeOneLetter.removeLetter(input,3);

        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

}
