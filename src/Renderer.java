import java.util.Arrays;

public class Renderer {
    private Delos delos;
    private Robot robot;

    public Renderer(Delos delos, Robot robot) {
        this.delos = delos;
        this.robot = robot;
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void printMap() {

        System.out.println("--------");
        for(int i = 0; i < this.delos.map.length; i++) {
            for(int j = 0; j < this.delos.map[i].length; j++) {
                if (j == 0) {
                    System.out.print("|");
                }
                int[] actualCoordinates = {i, j};
                if (this.isRobotsPosition(actualCoordinates)) {
                    System.out.print("o");
                } else if (this.isStationPosition(actualCoordinates)) {
                    System.out.print("^");
                }else if (this.delos.map[i][j] == 0) {
                    System.out.print(" ");
                } else if (this.delos.map[i][j] == 1) {
                    System.out.print("#");
                } else {
                    System.out.print("~");
                }
                if (j == this.delos.map[i].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.print("\n");
        }
        System.out.println("--------");
    }

    private boolean isRobotsPosition(int[] mapPostion) {
        return Arrays.equals(mapPostion, this.robot.position);
    }

    private boolean isStationPosition(int[] mapPostion) {
        return Arrays.equals(mapPostion, this.delos.stationPosition);
    }
}
