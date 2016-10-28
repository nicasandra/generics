package Exercise8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicasandra on 10/28/2016.
 */
public class Operation {
    public <T extends Comparable> T max(List<T> list, int begin, int end) {
        T max = list.get(begin);
        for (int i = begin; i <= end; i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        T elem = null;
        return max;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Integer a = new Operation().max(list, 1, 2);
        System.out.println("Max: " + a);
    }
}
