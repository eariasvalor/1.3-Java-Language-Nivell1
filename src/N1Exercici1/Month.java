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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Month)) {
            return false;
        }
        Month month = (Month) o;
        return Objects.equals(name, month.name);
    }

@Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
