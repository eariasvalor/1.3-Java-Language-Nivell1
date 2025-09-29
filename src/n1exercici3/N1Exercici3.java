package n1exercici3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class N1Exercici3 {
    public static void main (String[] args){
        HashMap<String, String> countries = new HashMap<>();
        ReadFile reader = new ReadFile();
        reader.feedCountries("src/resources/countries.txt");



    }
}
