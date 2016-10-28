package Exercise12;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by nicasandra on 10/28/2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(17, 8, 10, 12, 4, 21);
        Collection<Integer> col = Arrays.asList(5, 6, 9, 11);
        IFirstInteger<Integer> f = new FirstInteger(col);

        int i = Operation.findFirst(list, 0, list.size(), f);

        if (i >= 0) {
            System.out.print("First integer: " + list.get(i));
        }
    }
}
