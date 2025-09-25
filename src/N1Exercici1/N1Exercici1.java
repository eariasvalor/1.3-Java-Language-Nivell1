package N1Exercici1;

import java.util.ArrayList;
import java.util.HashSet;

public class N1Exercici1 {
    public static void main (String[] args){
        ArrayList<Month> months = new ArrayList<Month>();

        months.add(new Month("Gener"));
        months.add(new Month ("Febrer"));
        months.add(new Month ("Març"));
        months.add(new Month ("Abril"));
        months.add(new Month ("Maig"));
        months.add(new Month ("Juny"));
        months.add(new Month ("Juliol"));
        months.add(new Month ("Setembre"));
        months.add(new Month ("Octubre"));
        months.add(new Month ("Novembre"));
        months.add(new Month ("Desembre"));

        for (Month m : months) {
            System.out.println(m.getName());
        }

        System.out.println("");

        months.add(7, new Month("Agost"));

        for (Month m : months) {
            System.out.println(m.getName());
        }

        HashSet<Month> months2 = new HashSet<Month>();

        months2.add(new Month("Gener"));
        months2.add(new Month ("Febrer"));
        months2.add(new Month ("Març"));
        months2.add(new Month ("Abril"));
        months2.add(new Month ("Maig"));
        months2.add(new Month ("Juny"));
        months2.add(new Month ("Juliol"));
        months2.add(new Month ("Setembre"));
        months2.add(new Month ("Octubre"));
        months2.add(new Month ("Novembre"));
        months2.add(new Month ("Desembre"));

        //HashSet doesn't allow 2 arguments because it is a non-ordered set.
     //   months2.add(7, new Month ("Agost"));

        months2.add(new Month ("Agost"));
        months2.add(new Month ("Agost"));

        System.out.println("HashSet:");

        for (Month m : months2) {
            System.out.println(m.getName());
        }

    }


}
