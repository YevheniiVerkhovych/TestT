public class SlotPlayLogic {
    private Player player;
    private int coinsWinAmount ;
    private int chanceCoinsWin;
    private int chanceFreeBetWin;
    private int betCoinsValue;

    public SlotPlayLogic(Player player) {
        this.player = player;
    }

    public void playRound(int betCoinsValue) {
        int winNumber;
        winNumber =player.getWinNumber();
        player.addTimesPlayed();
        player.addCoinsSpent(betCoinsValue);

        if ((0 <= winNumber && winNumber < chanceCoinsWin)) {
            player.addCoinsWin(coinsWinAmount);
            player.addTimesWin();
        }

        if ((0 <= player.getWinNumber() && player.getWinNumber() < chanceFreeBetWin)) {
            playRound(0);
            player.addTimesFreeBetWin();
        }
    }

    public void setCoinsWinAmount(int coinsWinAmount) {
        this.coinsWinAmount = coinsWinAmount;
    }

    public void setChanceCoinsWin(int chanceCoinsWin) {
        this.chanceCoinsWin = chanceCoinsWin;
    }

    public void setChanceFreeBetWin(int chanceFreeBetWin) {
        this.chanceFreeBetWin = chanceFreeBetWin;
    }

    public void setBetCoinsValue(int betCoinsSum) {
        this.betCoinsValue = betCoinsSum;
    }
    public int getBetCoinsValue() {
        return betCoinsValue;
    }
}
