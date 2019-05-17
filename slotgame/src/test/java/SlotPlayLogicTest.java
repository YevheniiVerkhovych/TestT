import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SlotPlayLogicTest {
public static Player player;
public static SlotPlayLogic slotPlayLogic;


    @Before
    public void setUp() throws Exception {
        player = new Player();
        slotPlayLogic = new SlotPlayLogic(player);

    }

    @Test
    public void playRound() {
        slotPlayLogic.setChanceFreeBetWin(10);
        slotPlayLogic.setChanceCoinsWin(30);
        slotPlayLogic.setBetCoinsValue(10);
        slotPlayLogic.setCoinsWinAmount(20);
        for (int i=0; i< 100; i++) {
            slotPlayLogic.playRound(10);
        }
        Assume.assumeTrue(player.getTimesPlayed()>=100);
        Assume.assumeTrue(player.getCoinsWin()>0);
        Assume.assumeTrue(((double)(player.getCoinsWin()))/((double)(player.getCoinsSpent()))<0.69);

    }

    @Test
    public void setBetCoinsValue() {
        slotPlayLogic.setBetCoinsValue(10);
        Assume.assumeTrue(slotPlayLogic.getBetCoinsValue()==10);
    }

}