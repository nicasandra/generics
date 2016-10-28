package Exercise1;

/**
 * Created by nicasandra on 10/28/2016.
 */
public class Palindrom implements IPalindrom<String> {
    public boolean check(String str) {
        int length = str.length();
        String palindrom = "";

        for (int i = length - 1; i >= 0; i--)
            palindrom = palindrom + str.charAt(i);
        if (palindrom.equals(str)) {
            return true;
        } else return false;
    }
}
