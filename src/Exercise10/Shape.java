package Exercise10;

/**
 * Created by nicasandra on 10/28/2016.
 */

class Shape { /* ... */
}

class Circle extends Shape { /* ... */
}

class Rectangle extends Shape { /* ... */
}

class Node<T> { /* ... */
    public static void main(String[] args) {
        Node<Circle> nc = new Node<>();  // it works
        //  Node<Shape> ns = nc;  //not ok because just Circle extends Shape, not Node<Circle>
    }
}



