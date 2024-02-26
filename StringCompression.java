public class StringCompression {

    public int compress(char[] chars) {
        StringBuilder compressedString = new StringBuilder();

        int len = chars.length;
        int ctr = 1;

        if (len == 1) {
            compressedString.append(chars[0]);
        }

        for (int i = 0; i < len - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                ctr++;
                if (i == len - 2) {
                    appendCompressed(compressedString, chars[i], ctr);
                }
            } else if (chars[i] != chars[i + 1]) {
                appendCompressed(compressedString, chars[i], ctr);
                ctr = 1;
                if (i == len - 2) {
                    compressedString.append(chars[i + 1]);
                }
            }
        }

        char[] compressedChars = compressedString.toString().toCharArray();
        System.arraycopy(compressedChars, 0, chars, 0, Math.min(compressedChars.length, chars.length));

        return compressedChars.length;
    }

    private void appendCompressed(StringBuilder compressedString, char ch, int count) {
        compressedString.append(ch);
        if (count > 1) {
            compressedString.append(count);
        }
    }


    public static void main(String[] args) {
        char[] c = {'a','a','b','b','c','c','c'};
        StringCompression stringCompression = new StringCompression();
        System.out.println(stringCompression.compress(c));
    }

}
