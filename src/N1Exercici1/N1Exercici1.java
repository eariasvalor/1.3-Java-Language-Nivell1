package N1Exercici1;

import java.util.ArrayList;
import java.util.HashSet;

public class N1Exercici1 {
    public static void main (String[] args){
        ArrayList<Month> months = new ArrayList<Month>();

        months.add(new Month("Gener"));
        months.add(new Month("Febrer"));
        months.add(new Month("Març"));
        months.add(new Month("Abril"));
        months.add(new Month("Maig"));
        months.add(new Month("Juny"));
        months.add(new Month("Juliol"));
        months.add(new Month("Setembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Novembre"));
        months.add(new Month("Desembre"));

        for (Month m : months) {
            System.out.println(m.getName());
        }

        System.out.println("");

        months.add(7, new Month("Agost"));

        for (Month m : months) {
            System.out.println(m.getName());
        }

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
