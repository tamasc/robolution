
import java.util.HashMap;
import java.util.Map;

public class Delos {
    int[][] map;
    Robot robot;

    int[][] map1 = {
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
    };
    int[][] map2 = {
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
    };
    int[][] map3 = {
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
    };
    int[][] map4 = {
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
    };
    int[][] map5 = {
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
    };
    int[][] map6 = {
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
    };

    Map<String, Integer> actions = new HashMap<String, Integer>();

    public Map<String, Integer> getActions() {
        return actions;
    }

    public void setActions(Map<String, Integer> actions) {
        this.actions = actions;
    }

    public Delos(int map) {
        actions.put("left", 3);
        actions.put("right", 3);
        actions.put("up", 3);
        actions.put("down", 3);
        actions.put("repeat", 3);
        actions.put("blowUp", 3);
        switch (map) {
            case 1:
                this.map = this.map1;
                break;
            case 2:
                this.map = this.map2;
                break;
            case 3:
                this.map = this.map3;
                break;
            case 4:
                this.map = this.map4;
                break;
            case 5:
                this.map = this.map5;
                break;
            case 6:
                this.map = this.map6;
                break;
        }
    }

    public boolean checkPostionValidy(int[] position) {
        return this.map[position[0]][position[1]] == 0;
    }
}
