import java.util.*;

public class Player {
    public Map<String, Integer> actionStore;
    public List<Character> actions;

    public List <Character> getActions() {
        return actions;
    }

    public void setActions(List <Character> actions) {
        this.actions = actions;
    }

    public Player(Map<String, Integer> actionStore) {
        this.actionStore = actionStore;
    }

    public Map <String, Integer> getActionStore() {
        return actionStore;
    }

    public void setActionStore(Map <String, Integer> actions) {
        this.actionStore = actions;
    }

    public int getActionCount() {
        return this.actionStore.entrySet().stream().mapToInt(Map.Entry::getValue).sum();
    }
}
