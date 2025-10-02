package n1exercici1;

import java.util.*;

public class N1Exercici1 {
    public static void main (String[] args){

        ArrayList<Month> list1 = createListOfMonths();
        System.out.println("ArrayList missing the month of August:\n" + getListOfMonths(list1));


        list1.add(7, new Month("August"));
        System.out.println("ArrayList after adding the month of August:\n" + getListOfMonths(list1));

        HashSet<Month> list2 = convertIntoHashSet(list1);
        System.out.println("Arraylist converted into a HashSet:\n" + getListOfMonths(list2));
        list2.add(new Month("August"));
        System.out.println("Added a second August to the HashSet with no effect:\n" + getListOfMonths(list2));

        System.out.println("Here is the list obtained by means of a 'for':\n" + printListWithFor(list2) + "\n");


        System.out.println("Here is the list obtained by means of an Iterator:\n" + printListWithIterator(list2));




    }

    public static List<Month> createListOfMonths(){
        ArrayList<Month> months = new ArrayList<>();
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        return months;
    }

    public static String getListOfMonths(Collection<Month> list) {
        StringBuilder sb = new StringBuilder();

        for (Month m : list) {
            sb.append(m.getName()).append("\n");
        }

        return sb.toString();
    }



    public static HashSet<Month> convertIntoHashSet(ArrayList<Month> list){
        HashSet<Month> months2 = new HashSet<>();
        months2.add(new Month(list.get(0).getName()));
        months2.add(new Month(list.get(1).getName()));
        months2.add(new Month(list.get(2).getName()));
        months2.add(new Month(list.get(3).getName()));
        months2.add(new Month(list.get(4).getName()));
        months2.add(new Month(list.get(5).getName()));
        months2.add(new Month(list.get(6).getName()));
        months2.add(new Month(list.get(7).getName()));
        months2.add(new Month(list.get(8).getName()));
        months2.add(new Month(list.get(9).getName()));
        months2.add(new Month(list.get(10).getName()));
        months2.add(new Month(list.get(11).getName()));

        return months2;

    }



    public static String printListWithFor(HashSet<Month> list) {
        String answer = "";

        for (Month m : list) {
            answer += m.getName() + "\n";
        }

        return answer;
    }

    public static String printListWithIterator(HashSet<Month> list) {
        String answer = "";

        Iterator<Month> it = list.iterator();
        while (it.hasNext()) {
            Month m = it.next();
            answer += m.getName() + "\n";
        }
        return answer;
    }

}
