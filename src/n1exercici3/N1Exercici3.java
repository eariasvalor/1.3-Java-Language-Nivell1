package n1exercici3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class N1Exercici3 {
    public static void main (String[] args){
        HashMap<String, String> countries = new HashMap<>();

        try(BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new FileInputStream("src/resources/countries.txt")))) {

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

        for (String country : countries.keySet()) {
            System.out.println("Country: " + country + " → Capital: " + countries.get(country));
        }
    }
}
