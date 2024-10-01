package Java_collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class iterator {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        System.out.println(number);

        //Method 1
        for(int i = 0; i<number.size(); i++) {
            System.out.println("The element is: " + number.get(i));
        }


            //Method 2 (by using for each loop)
            for(Integer element : number ) {
                System.out.println("for each element : " + element);
            }



            // Method 3  (by creating framework -> Iterator)
        Iterator <Integer> it = number.iterator();
            while (it.hasNext()) {
                System.out.println("Iterator " + it.next());
            }

    }
}
   // Method 2 is the easiest one but method 3 is the most important.