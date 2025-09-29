package N1Exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class N1Exercici1 {
    public static void main (String[] args){
        ArrayList<Month> months = new ArrayList<Month>();
        HashSet<Month> months2 = new HashSet<Month>();


        Month m1 = new Month("January");
        Month m2 = new Month("February");
        Month m3 = new Month("March");
        Month m4 = new Month("April");
        Month m5 = new Month("May");
        Month m6 = new Month("June");
        Month m7 = new Month("July");
        Month m9 = new Month("September");
        Month m10 = new Month("October");
        Month m11 = new Month("November");
        Month m12 = new Month("December");

        months.add(m1);
        months.add(m2);
        months.add(m3);
        months.add(m4);
        months.add(m5);
        months.add(m6);
        months.add(m7);
        months.add(m9);
        months.add(m10);
        months.add(m11);
        months.add(m12);

        for (Month m : months) {
            System.out.println(m.getName());
        }

        System.out.println();

        //adding the month of August on position 7
        months.add(7, new Month("August"));

        for (Month m : months) {
            System.out.println(m.getName());
        }




        months2.add(m1);
        months2.add(m2);
        months2.add(m3);
        months2.add(m4);
        months2.add(m5);
        months2.add(m6);
        months2.add(m7);
        months2.add(m9);
        months2.add(m10);
        months2.add(m11);
        months2.add(m12);


        Month m8 = new Month("August");
        months2.add(m8);

        /*added a second object with the name "August", but the hashSet
        doesn't add it because of the overrode methods equals and hashCode.*/
        months2.add(new Month("August"));

        System.out.println();
        System.out.println("HashSet:");

        for (Month m : months2) {
            System.out.println(m.getName());
        }

        //to check if August is added.
        boolean containsAugust = months2.contains(m8);
        System.out.println(containsAugust);

        Iterator<Month> it = months2.iterator();
        while (it.hasNext()) {
            Month m = it.next();
            System.out.println(m.getName());
        }

    }


}
