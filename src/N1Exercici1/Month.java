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

    //I override the methods equals and hashCode to prevent hashset to admit two Objects with the same name.
    @Override
    public boolean equals(Object o) {
        boolean answer = false;
        if (this == o) {
            answer = true;
        }
        if (!(o instanceof Month)) {
            answer = false;
        }
        Month month = (Month) o;
        answer = Objects.equals(name, month.name);

        return answer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
