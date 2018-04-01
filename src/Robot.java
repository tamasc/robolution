public class Robot {
    private int[] position = {0, 5};

    private String soul = "These violent delights have violent ends";

    public void move(String direction) {
        switch (direction) {
            case "up":
                position[1]--;
                break;
            case "down":
                position[1]++;
                break;
            case "left":
                position[0]--;
                break;
            case "right":
                position[0]++;
                break;
        }
    }

    public void die(){
        System.out.println(this.soul);
    }
}
