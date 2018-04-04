public class Robot {

    public int[] position = {0, 5};

    private String soul = "These violent delights have violent ends";

    public void move(Character direction) {
        switch (direction) {
            case 'u':
                if (position[0] > 0) {
                    position[0]--;
                }
                break;
            case 'd':
                if (position[0] < 5) {
                    position[0]++;
                }
                break;
            case 'l':
                if (position[1] > 0) {
                    position[1]--;
                }
                break;
            case 'r':
                if (position[1] < 5) {
                    position[1]++;
                }
                break;
        }
    }

    public void die(){
        System.out.println(this.soul);
    }
}
