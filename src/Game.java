import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Game {
    private Delos delos;
    private Robot robot;
    private Player player;
    private Renderer renderer;

    public Game(int map) {
        this.delos = new Delos(map);
        this.player = new Player(this.delos.getActionStore());
        this.robot = new Robot();
        this.renderer = new Renderer(this.delos, this.robot);
        Renderer.clearConsole();
        this.renderer.printMap();
        this.printRemainingPlayerActions();
        System.out.println("Please choose your next action by typing its corresponding character!");
        this.player.setActions(this.getPlayerActions());
        this.launchRailBuilding();
    }

    public void gameOver() {
        robot.die();
    }

    private  List<Character> getPlayerActions() {
        char lastChar = 'x';
        List<Character> actions = new ArrayList<>();
        while (lastChar != 'e' && this.player.getActionCount() > 0) {
            Renderer.clearConsole();
            this.printRemainingPlayerActions();
            System.out.println("Type the first character of an action to choose one.");
            Scanner sc = new Scanner(System.in);
            lastChar = sc.next().charAt(0);
            if (this.isValidPlayerAction(lastChar)) {
                actions.add(lastChar);
            } else {
                System.out.println("You either typed a wrong character or you have no more action of the given type!");
            }
            System.out.println(actions);
        }
        return actions;
    }

    private boolean isValidPlayerAction(char lastChar) {
        switch (lastChar) {
            case 'u':
                return this.reducePlayerActionStore("up");
            case 'd':
                return this.reducePlayerActionStore("down");
            case 'l':
                return this.reducePlayerActionStore("left");
            case 'r':
                return this.reducePlayerActionStore("right");
            case 'm':
                return this.reducePlayerActionStore("multiply");
            case 'b':
                return this.reducePlayerActionStore("blowUp");
        }
        return false;
    }

    private boolean reducePlayerActionStore(String key) {
        Map<String, Integer> playerActionStore = this.player.getActionStore();
        if (playerActionStore.get(key) > 0) {
            playerActionStore.put(key, playerActionStore.get(key) - 1);
            return true;
        } else {
            return false;
        }
    }

    private void printRemainingPlayerActions() {
        System.out.println("Your available actions:");
        System.out.println(this.player.getActionStore());
    }

    private void launchRailBuilding() {
        for (Character action : this.player.getActions()) {
            this.robot.move(action);
            this.renderer.printMap();
            if (this.hasPlayerWon()) {
                System.out.println("Yeahh");
                return;
            }
        }
    }

    private boolean hasPlayerWon() {
        return  Arrays.equals(this.robot.position, this.delos.stationPosition);
    }

}
