package n1exercici3;




import java.util.Map;
import java.util.Scanner;

public class N1Exercici3 {
    public static void main (String[] args){
        ReadFile reader = new ReadFile();
        Scanner scanner = new Scanner(System.in);
        boolean result = false;
        String country = "";
        String answer = "";
        int roundNum = 10;


        Map<String, String> countries = reader.feedCountries("src/resources/countries.txt");


        System.out.println("Hello! What's your name?");
        User user1 = new User(scanner.nextLine());


        for (int i  = 0; i < roundNum; i++){
            Game game1 = new Game(countries);
            country = game1.showRandomCountry();
            System.out.println("What's the capital of " + country + "?");
            answer = scanner.nextLine();
            if (answer.isEmpty()){
                System.out.println("The answer cannot be empty. Please try again.");
                answer = scanner.nextLine();
            }
            result = game1.checkAnswer(country, answer);
            user1.calculateScore(result);
            if(result) {
                System.out.println("Your answer is right. You got 1 point!");
            } else {
                System.out.println("Your answer is wrong. The right answer was: " + game1.getCapital(country));
            }
            game1.removeAnswers(country);
            System.out.println("Your actual score is: " + user1.getScore());
        }
        ScoreWriter writer = new ScoreWriter("src/resources/classification.txt");
        writer.saveScore(user1);
    }
}
