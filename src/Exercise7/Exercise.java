package Exercise7;

import java.util.List;

/**
 * Created by nicasandra on 10/28/2016.
 */
public class Exercise {

    /* Method ok */
    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }
}
