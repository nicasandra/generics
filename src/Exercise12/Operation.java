package Exercise12;

import java.util.List;

/**
 * Created by nicasandra on 10/28/2016.
 */
public class Operation {
    public static <T> int findFirst(List<T> list, int begin, int end, IFirstInteger<T> p) {
        for (int i = begin; i < end; i++)
            if (p.check(list.get(i)))
                return i;
        return -1;
    }

    public static int greatestDivisor(int x, int y) {
        for (int r; (r = x % y) != 0; x = y, y = r) {
        }
        return y;
    }
}
