package N1Exercici1;

import java.util.ArrayList;

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

        System.out.println();

        months.add(7, new Month("Agost"));

        for (Month m : months) {
            System.out.println(m.getName());
        }
    }
}
