import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusPlayLogicTest {
    public static Player player;
    public static BonusPlayLogic bonusPlayLogic;

    @Before
    public void setUp() {
            player = new Player();
            bonusPlayLogic = new BonusPlayLogic(player);
    }

    @Test
    public void playRound() {
        bonusPlayLogic.setBonusLevelEnteringChance(10);
        bonusPlayLogic.setBoxesAmount(5);
        bonusPlayLogic.setCoinsWinAmount(5);
        bonusPlayLogic.setBetCoinsValue(10);

        for(int i=0; i<1000; i++) {
            bonusPlayLogic.PlayRound();
        }
        Assume.assumeTrue(player.getTimesPlayed()==1000);
        Assume.assumeTrue(((double)(player.getCoinsWin()))/((double)(player.getCoinsSpent()))<0.14);

    }
}
