package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N1Exercici2 {
    public static void main (String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            list1.add(i);
        }

        ListIterator<Integer> it = list1.listIterator(list1.size());
        while(it.hasPrevious()) {
            list2.add(it.previous());
        }


        System.out.println("Ascendant order: " + list1);
        System.out.println("Descendant order: " + list2);





    }
}
