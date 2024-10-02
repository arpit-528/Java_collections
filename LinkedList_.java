package Java_collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_ {
    public static void main(String[] args) {
        List<Integer> List = new LinkedList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        System.out.println(List);
        List.remove(2);
        System.out.println(List);

    }
}
//It is very similar to arraylist. just replace the arraylist with linkedlist. And all set.