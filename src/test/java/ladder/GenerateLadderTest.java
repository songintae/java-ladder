package ladder;

import ladder.GenerateLadder;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;


public class GenerateLadderTest {

    GenerateLadder generateLadder;

    @Before
    public void setUp(){
        generateLadder = new GenerateLadder();
    }


    @Test
    public void generateRow(){
        boolean[] row = generateLadder.generateRow(5);
        assertThat(row).isNotNull();
        assertThat(row.length).isEqualTo(6);
        checkGenerateRow(row);
    }

    private void checkGenerateRow(boolean[] row){
        boolean prev = false;
        for(int i = 1; i < row.length; i++){
            if(prev && row[i])
                fail();
            prev = row[i];
        }
    }

    @Test
    public void generateLadder() {
        boolean[][] ladder = generateLadder.generateLadder(4, 5);
        assertThat(ladder).isNotNull();
        assertThat(ladder.length).isEqualTo(4);
        assertThat(ladder[0].length).isEqualTo(6);
        for (boolean[] row : ladder) {
            checkGenerateRow(row);
        }
    }
}