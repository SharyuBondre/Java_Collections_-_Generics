package Generics;

/*

Generics in Java allow classes, interfaces, and methods to operate on different types
while providing compile-time type safety and eliminating the need for type casting.

*/




class Box<T> {

    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class GenericExample {
    public static void main(String[] args) {

        // Integer type
        Box<Integer> b1 = new Box<>();
        b1.setValue(100);
        System.out.println("Integer value: " + b1.getValue());

        // String type
        Box<String> b2 = new Box<>();
        b2.setValue("Java");
        System.out.println("String value: " + b2.getValue());
    }
}
