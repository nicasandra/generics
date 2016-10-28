package Exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicasandra on 10/28/2016.
 */
public class Operation {
    public <T> List exchange(List<T> list, int a, int b) {
        T aux = list.get(a);
        list.set(a, list.get(b));
        list.set(b, aux);
        return list;
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        List<String> newList = new Operation().exchange(list, 0, 2);
        for (String t : newList) {
            System.out.println(t);
        }
    }
}
