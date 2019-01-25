package designpatterns.examples;

import designpatterns.examples.factory.Player;
import designpatterns.examples.factory.PlayerFactory;

public class TicTacToe {
    public static void main(String[] args) {
        Player player1 = PlayerFactory.createPlayer("Robin", false);
        System.out.println(player1.toString());

        Player player2 = PlayerFactory.createPlayer("BOT1", true);
        System.out.println(player2.toString());

        Player player3 = PlayerFactory.createPlayer("BOT2", true);
        System.out.println(player3.toString()); //Exception!
    }

}
