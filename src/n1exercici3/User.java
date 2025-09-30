package n1exercici3;

public class User {
    private  String name;
    private int score;

    public User(String name){
        this.name = name;
        this.score = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }

    public void setName(String name){
        this.name = name;
    }

    public void calculateScore(boolean result){
        if(result) {
            this.score++;
    }

    }
}
