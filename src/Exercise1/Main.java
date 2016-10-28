package Exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicasandra on 10/28/2016.
 */
public class Main {
    public static void main(String[] args) {
        Palindrom p = new Palindrom();
        List<String> list = new ArrayList<>();
        list.add("ana");
        list.add("ana");
        list.add("andrei");
        list.add("889988");
        int nr = new Operation().count(list, new Palindrom());
        System.out.println("Number of palindroms: " + nr);
    }
}
