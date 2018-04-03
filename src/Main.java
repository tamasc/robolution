import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Welcome to the Industrial Robolution");
        int map = 0;
        while (map == 0) {
            Renderer.clearConsole();
            System.out.println("Please, choose a map by entering a number between 1 and 6");
            // TODO: handle not int values
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input > 0 && input < 7) {
                map = input;
                break;
            }
            System.out.println("Wrong number");
        }

        Game game = new Game(map);
    }
}