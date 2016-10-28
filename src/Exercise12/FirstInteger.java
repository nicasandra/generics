package Exercise12;

import java.util.Collection;

/**
 * Created by nicasandra on 10/28/2016.
 */
public class FirstInteger implements IFirstInteger<Integer> {

    private Collection<Integer> col;

    public FirstInteger(Collection<Integer> col) {
        this.col = col;
    }

    public boolean check(Integer s) {
        for (Integer i : col)
            if (Operation.greatestDivisor(s, i) != 1)
                return false;

        return col.size() > 0;
    }


}
