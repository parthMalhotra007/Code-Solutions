public class IsomorphicStrings {

    public boolean checkIsomorphic(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            char iso = s2.charAt(i);
            for (int j = i + 1; j < s1.length(); j++) {
                if (s1.charAt(j) == s1.charAt(i)) {
                    if (s2.charAt(j) != iso) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        boolean ans = isomorphicStrings.checkIsomorphic("aaba", "xxyp");
        System.out.println(ans);

    }
}


