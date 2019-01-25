package designpatterns.examples.factory;

public class PlayerFactory {

    private static int numberOfPlayers = 0;
    private static int maxNumberOfPlayers = 2;


    public static Player createPlayer(String name, boolean isAi) {
        if(numberOfPlayers < maxNumberOfPlayers){
            numberOfPlayers++;
            return new Player(name, isAi);
        } else {
            throw new RuntimeException("Maximum number of players reached.");
        }
    }
}
