package n1exercici1;

import java.util.Objects;

public class Month {
    private String name;

    public Month(String name) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("The name cannot be null or blank");
        }
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

