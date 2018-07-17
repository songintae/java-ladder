package ladder;

public class LadderGame {
    boolean[][] ladder;

    public LadderGame(String names, String results, int height) {

    }

    public void setLadder(boolean[][] ladder) {
        this.ladder = ladder;
    }

    public int play(int start) {
        int x = start;
        int y = 0;
        boolean mustGoDownward = false;

        while (y < ladder.length) {
            int ref_x1 = x;
            int ref_x2 = x+1;
            if (mustGoDownward) {
                y++;
                mustGoDownward = false;
                continue;
            }
            else if (ladder[y][ref_x1]) {
                x--;
                mustGoDownward = true;
                continue;
            }
            else if (ladder[y][ref_x2]) {
                x++;
                mustGoDownward = true;
                continue;
            }
            y++;
        }
        return x;
    }
}
