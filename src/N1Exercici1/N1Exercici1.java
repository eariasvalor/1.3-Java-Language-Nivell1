package N1Exercici1;

import java.util.ArrayList;
import java.util.HashSet;

public class N1Exercici1 {
    public static void main (String[] args){
        ArrayList<Month> months = new ArrayList<Month>();
        HashSet<Month> months2 = new HashSet<Month>();

        Month m1 = new Month("Gener");
        Month m2 = new Month("Febrer");
        Month m3 = new Month("Març");
        Month m4 = new Month("Abril");
        Month m5 = new Month("Maig");
        Month m6 = new Month("Juny");
        Month m7 = new Month("Juliol");
        Month m9 = new Month("Setembre");
        Month m10 = new Month("Octubre");
        Month m11 = new Month("Novembre");
        Month m12 = new Month("Desembre");

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
        months.add(7, new Month("Agost"));

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


        Month m8 = new Month("Agost");
        months2.add(m8);

        /*added a second object with the name "Agost", but the hashSet
        doesn't add it because of the overrode methods equals and hashCode.*/
        months2.add(new Month("Agost"));

        System.out.println();
        System.out.println("HashSet:");

        for (Month m : months2) {
            System.out.println(m.getName());
        }

        boolean containsAgost = months2.contains(m8);
        System.out.println(containsAgost);
    }


}
