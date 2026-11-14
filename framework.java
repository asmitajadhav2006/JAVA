
import java.util.ArrayList;
import java.util.List;

public class framework {
    public static void main(String[] args) {

        // ArrayList - Concrete class
        // List - Interface

        ArrayList<Integer> list = new ArrayList<>();

        // add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List: " + list);

        // remove()
        list.remove(0);
        System.out.println("After remove: " + list);

        // Creating another ArrayList
        List<Integer> list2 = new ArrayList<>();

        list2.add(101);
        list2.add(102);
        list2.add(20);

        // addAll()
        list.addAll(list2);
        System.out.println("After addAll: " + list);

        // removeAll()
        list.removeAll(list2);
        System.out.println("After removeAll: " + list);

        // clear()
        // list2.clear();

        // size()
        System.out.println("Size of list2: " + list2.size());
    }
}
