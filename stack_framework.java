package Java_collections;
import java.util.Stack;

public class stack_framework {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Cat");
        animals.push("Horse");
        animals.push("Dog");

        System.out.println("Stack: " +animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println("Stack: " +animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println("Stack: " +animals);
        System.out.println(animals.peek());
    }
}


