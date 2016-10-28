package Exercise1;

import java.util.List;

/**
 * Created by nicasandra on 10/28/2016.
 */
public class Operation {
    public <T> int count(List<T> list, IPalindrom<T> p) {
        int c = 0;
        for (T i : list) {
            if (p.check(i))
                c++;
        }
        return c;
    }
}
