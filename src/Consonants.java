import java.util.Arrays;
import java.util.List;

public class Consonants {
    static boolean isAlphabet(char ch)
    {
        if (ch >= 'a' && ch <= 'z')
            return true;
        if (ch >= 'A' && ch <= 'Z')
            return true;
        return false;
    }


    static String remConsonants(String str)
    {
        Character vowels[]
                = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

        List<Character> al = Arrays.asList(vowels);

        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < sb.length(); i++) {

            if (isAlphabet(sb.charAt(i))
                    && !al.contains(sb.charAt(i))) {
                sb.replace(i, i + 1, "");
                i--;
            }
        }

        return sb.toString();
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
        String str
                = "Given a list of strings. Find the element with the maximum number of consonants.";

        System.out.println(remConsonants(str));
    }
}
