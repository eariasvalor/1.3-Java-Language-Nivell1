package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class N1Exercici1 {
    public static void main (String[] args){

        ArrayList<Month> list1 = createArrayList();
        System.out.println("ArrayList missing the month of August:\n" + printArrayList(list1));


        //adding the month of August on position 7
        addMonth(7, "August", list1);
        System.out.println("ArrayList after adding the month of August:\n" + printArrayList(list1));

        HashSet<Month> list2 = convertIntoHashSet(list1);
        System.out.println("Arraylist converted into a HashSet:\n" + printHashSet(list2));
        newMonthToHashSet("August", list2);
        System.out.println("Added a second August to the HashSet:\n" + printHashSet(list2));

        for (Month m : list2) {
            System.out.println(m.getName());
        }

        Iterator<Month> it = list2.iterator();
        while (it.hasNext()) {
            Month m = it.next();
            System.out.println(m.getName());
        }



    }

    public static ArrayList createArrayList(){
        ArrayList<Month> months = new ArrayList<Month>();
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

    public static String printArrayList(ArrayList<Month> arrayList){
        String answer = "";

        for (Month m : arrayList) {
           answer += m.getName() + "\n";
        }

        return answer;
    }

    public static void addMonth(int index, String name, ArrayList<Month> list){
        list.add(index, new Month(name));
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

    public static String printHashSet(HashSet<Month> hashSet){
        String answer = "";
        for (Month m : hashSet) {
            answer += m.getName() + "\n";
        }

        return answer;
    }

    public static void newMonthToHashSet(String name, HashSet<Month> list){

        list.add(new Month(name));
    }

}
