package n1exercici3;



import java.util.HashMap;
import java.util.Scanner;

public class N1Exercici3 {
    public static void main (String[] args){
        HashMap<String, String> countries = new HashMap<>();
        ReadFile reader = new ReadFile();
        Scanner scanner = new Scanner(System.in);
        boolean result = false;
        String country = "";
        String answer = "";



        reader.feedCountries("src/resources/countries.txt");


        System.out.println("Hello! What's your name?");
        User user1 = new User(scanner.nextLine());


        for (int i  = 0; i < 10; i++){
            country = reader.showRandomCountry();
            System.out.println("What's the capital of " + country + "?");
            answer = scanner.nextLine();
            if (answer.isEmpty()){
                System.out.println("The answer cannot be empty. Please try again.");
                answer = scanner.nextLine();
            }
            result = reader.checkAnswer(country, answer);
            user1.calculateScore(result);
            if(result) {
                System.out.println("Your answer is right. You got 1 point!");
            } else {
                System.out.println("Your answer is wrong. The right answer was: " + reader.getCapital(country));
            }
            reader.removeAnswers(country);
            System.out.println("Your actual score is: " + user1.getScore());
        }
        ScoreWriter writer = new ScoreWriter("src/resources/classification.txt");
        writer.saveScore(user1);
    }
}
