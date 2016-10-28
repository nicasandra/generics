package Exercise11;

/**
 * Created by nicasandra on 10/28/2016.
 */
public class Node<T> implements Comparable<T> {
    public int compareTo(T obj) {
        return 1;
    }

    public static void main(String[] args) {
        Node<String> node = new Node<>();
        Comparable<String> comp = node;  //it's ok because node<t> implements comparable<string>
    }
}
