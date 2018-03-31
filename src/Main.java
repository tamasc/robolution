import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.printf("Welcome to the Industrial Robolution\n" +
                "Please, choose a map by entering a number between 1 and 6\n");
        Scanner sc = new Scanner(System.in);
        int map = sc.nextInt();

        Game game = new Game(map);
    }
}