package n1exercici3;

import java.util.*;

public class Game {
    private final Map<String, String> countries;

    public Game(Map<String, String> countries){
        this.countries = new HashMap<>(countries);
    }

    public String showRandomCountry(){
        List<String> keys = new ArrayList<>(countries.keySet());
        Random random = new Random();
        int randomIndex = random.nextInt(keys.size());
        return keys.get(randomIndex);

    }

    public boolean checkAnswer(String country, String answer){
        boolean result = false;
        if(countries.get(country).equals(answer)){
            result = true;
        }

        return result;
    }

    public String getCapital(String country){
        return countries.get(country);
    }

    public void removeAnswers(String country) {
        countries.remove(country);
    }
}
