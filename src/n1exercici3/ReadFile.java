package n1exercici3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ReadFile {
    private final Map<String, String> countries = new HashMap<>();

    public void feedCountries(String filePath){
        try(BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath)))) {

            String line;
            while((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(" ", 2);

                if(parts.length == 2){
                    String country = parts[0].trim().replace("_", " ");
                    String capital = parts[1].trim().replace("_", " ");
                    countries.put(country, capital);
                }
            }
        } catch (IOException e) {
            System.out.println("Error while reading file." + e.getMessage());
        }
    }

    public void printCountries(){
        for (String country : countries.keySet()) {
            System.out.println("Country: " + country + " → Capital: " + countries.get(country));
        }
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
