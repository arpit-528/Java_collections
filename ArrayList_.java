package Java_collections;
import java.util.List;
import java.util.ArrayList;

public class ArrayList_ {
    public static void main(String[] args) {
        ArrayList<String> studentname = new ArrayList<>();
        studentname.add("Rakesh");
        studentname.add("Nihal");
        System.out.println(studentname);

//Another example:-
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        System.out.println(number);
        number.add(4);
        System.out.println(number);

        //we can also add element at a particular index
        number.add(1, 50);
        System.out.println(number);

        //we can also add another list in an existing list
        List<Integer> newlist = new ArrayList<> ();
        newlist.add(30);
        newlist.add(10);
        number.addAll(newlist);
        System.out.println(number);

        //get function
        System.out.println(number.get(5));
        System.out.println(studentname.get(1));

        //remove function
        number.remove(6);
        System.out.println(number);
        // we can also remove the particular data from the list
        number.remove(Integer.valueOf(30));  //this line removes the 30 from the list without mentioning its index
        System.out.println(number);


        // set function
        number.set(1, 7);   // 1 is index and 7 is the value that I wanted to print in index 1.
        System.out.println(number);

    }
}


