package designpatterns.examples.factory;

public class Player {
    String name;
    boolean isAI;

    Player(String name, boolean isAI) {
        this.name = name;
        this.isAI = isAI;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", isAI=" + isAI +
                '}';
    }
}
