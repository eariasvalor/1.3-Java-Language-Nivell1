package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N1Exercici2 {
    public static void main (String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        ListIterator<Integer> it = list1.listIterator(list1.size());
        while(it.hasPrevious()) {
            list2.add(it.previous());
        }

        System.out.println("Ascendant order: " + list1);
        System.out.println("Descendant order: " + list2);





    }
}
