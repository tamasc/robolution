public class Game {
    private Delos delos;
    private Robot robot;
    private Player player;

    public Game(int map) {
        System.out.printf("" + map);
        this.delos = new Delos(map);
        this.player = new Player(this.delos.getActions());
        this.robot = new Robot();
        this.player.getActionCount();
    }

    public void gameOver() {
        robot.die();
    }
}
