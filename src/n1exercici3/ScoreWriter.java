package n1exercici3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ScoreWriter {
    private final String filePath;

    public ScoreWriter(String filePath) {
        this.filePath = filePath;
    }

    public void saveScore(User user) {
        try(PrintWriter writer = new PrintWriter(new FileWriter(filePath,true))) {
            writer.println(user.getName() + " got a total of " + user.getScore() + " points.");
            System.out.println("Total score successfully saved.");
        } catch (IOException e) {
            System.out.println("Error while writing file: " + e.getMessage());
        }
    }
}
