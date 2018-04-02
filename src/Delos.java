
import java.util.HashMap;
import java.util.Map;

public class Delos {
    int[][] map;
    int[] stationPosition = {0, 4};
    Map<String, Integer> actionStore = new HashMap<String, Integer>();

    int[][] map1 = {
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 0, 0, 0, 0 },
            {0, 0, 1, 1, 1, 0 },
            {0, 0, 1, 1, 1, 0 },
            {0, 0, 1, 1, 1, 0 },
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

    public Map<String, Integer> getActionStore() {
        // we dont want to mutate the actionStore of a map
        return new HashMap<String, Integer>(this.actionStore);
    }

    public Delos(int map) {
        // TODO: outsource maps, their stores and station position
        this.actionStore.put("left", 2);
        this.actionStore.put("right", 4);
        this.actionStore.put("up", 4);
        this.actionStore.put("down", 3);
        this.actionStore.put("multiply", 0);
        this.actionStore.put("blowUp", 0);
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
