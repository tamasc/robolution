import java.util.Map;

public class Player {
    public Map<String, Integer> actions;

    public Player(Map<String, Integer> actions) {
        this.actions = actions;
    }

    public Map <String, Integer> getActions() {
        return actions;
    }

    public void setActions(Map <String, Integer> actions) {
        this.actions = actions;
    }

    public int getActionCount() {
//        return this.actions.entrySet().stream().mapToInt(Map.Entry::getValue).sum();
        return 3;
    }
}
