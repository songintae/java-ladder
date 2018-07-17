package ladder;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LadderGameTest {

    private LadderGame ladderGame;

    @Before
    public void setUp() throws Exception {
        ladderGame = new LadderGame("", ",", 3);
    }

    @Test
    public void resultTest() {
        // 0 index  is not used
        ladderGame.setLadder(new boolean[][]{{false, true, false, true}, {false, false, true, false}});
        assertThat(ladderGame.play(0)).isEqualTo(2);
    }
}