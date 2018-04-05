import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Renderer.clearConsole();
        System.out.println("Welcome to the Industrial Robolution");
        int map = 0;
        Scanner sc = new Scanner(System.in);
        while (map == 0) {
            System.out.println("Please, choose a map by entering a number between 1 and 6");
            // TODO: handle not int values
            if (sc.hasNextInt()) {
                int input = sc.nextInt();
                if (input > 0 && input < 7) {
                    map = input;
                    break;
                }
                System.out.println("Wrong number");
            } else {
                System.out.println("Only numbers are allowed between 1 and 6");
                sc.nextLine();
            }
        }

        Game game = new Game(map);
    }
}