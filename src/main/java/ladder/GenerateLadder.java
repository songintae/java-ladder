package ladder;

import java.util.Random;

public class GenerateLadder {


    public boolean[] generateRow(int width) {
        boolean[] row = new boolean[width+1];
        boolean prev = false;
        for(int i = 1; i < width ; i++){
            if(prevhasLadder(row,i))
                continue;;
            row[i] = randomLadder();
        }

        return row;
    }

    private boolean randomLadder() {
        Random random = new Random();
        return random.nextBoolean();
    }

    boolean prevhasLadder(boolean[] row, int idx){
        return row[idx - 1];
    }


    public boolean[][] generateLadder(int height, int width) {
        boolean[][] ladder = new boolean[height][];
        for (int i = 0; i < height; i++) {
            ladder[i] = generateRow(width);
        }
        return ladder;
    }
}
