package n1exercici3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ReadFile {

    public Map<String, String> feedCountries(String filePath){
        Map<String, String> countries = new HashMap<>();
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


        return countries;
    }


    }




