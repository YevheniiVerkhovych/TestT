import java.util.Random;

public class BonusPlayLogic {
    private Player player;
    private int coinsWinAmount ;
    private int boxesAmount;
    private int bonusLevelEnteringChance;
    private int betCoinsSum;

    public BonusPlayLogic(Player player) {
        this.player = player;
    }

    public void PlayRound() {
        int winNumber;
        winNumber = player.getWinNumber();
        player.addTimesPlayed();
        player.addCoinsSpent(betCoinsSum);

        if ((0 <= winNumber && winNumber < bonusLevelEnteringChance)) {
            bonusPlay();
        }
    }

    public void bonusPlay(){
        int loseBoxNumber = getLoseBoxNumber();

        for (int i=0; i<boxesAmount; i++) {
            if (getLoseBoxNumber() != loseBoxNumber) {
                player.addCoinsWin(coinsWinAmount);
            } else return;
        }
    }

    public int getLoseBoxNumber() {
        int loseBoxNumber;
        Random random = new Random();
        loseBoxNumber = random.nextInt(boxesAmount);
        return loseBoxNumber;
    }

    public void setCoinsWinAmount(int coinsWinAmount) {
        this.coinsWinAmount = coinsWinAmount;
    }

    public void setBoxesAmount(int boxesAmount) {
        this.boxesAmount = boxesAmount;
    }

    public void setBonusLevelEnteringChance(int bonusLevelEnteringChance) {
        this.bonusLevelEnteringChance = bonusLevelEnteringChance;
    }

    public void setBetCoinsValue(int betCoinsSum) {
        this.betCoinsSum = betCoinsSum;
    }


}


