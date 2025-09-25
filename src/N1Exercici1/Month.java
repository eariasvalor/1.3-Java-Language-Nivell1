package N1Exercici1;

import java.util.Objects;

public class Month {
    private String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    //I override the method equals to tell hashset that both are the same object.
    /*@Override
    public boolean equals(Object o) {
        boolean answer = false;

        if (o instanceof  Month) {
            Month month = (Month) o;

            if (this.name == month.name) {
                answer = true;
            } else {
                answer = false;
            }
        } else {
            answer = false;
        }

        return answer;
    }



    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


     */

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return Objects.equals(name, month.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
