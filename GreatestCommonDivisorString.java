public class GreatestCommonDivisorString {
        public String gcdOfStrings(String str1, String str2) {
            if (str1.equals(str2)) {
                return str1; // If both strings are equal, the GCD is the string itself
            }

            if (str1.startsWith(str2)) {
                return gcdOfStrings(str1.substring(str2.length()), str2);
            }

            if (str2.startsWith(str1)) {
                return gcdOfStrings(str1, str2.substring(str1.length()));
            }

            return "";
        }
    public static void main(String[] args) {
        String s1 = "ABABAB";
        String s2 = "ABAB";
        GreatestCommonDivisorString greatestCommonDivisorString  = new GreatestCommonDivisorString();
        String ans  = greatestCommonDivisorString.gcdOfStrings(s1,s2);
        System.out.println(ans);
    }
}
