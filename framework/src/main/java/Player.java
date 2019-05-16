import java.util.Random;

public class Player {
    private int coinsWin;
    private int coinsSpent;
    private int timesPlayed;
    private int timesWin;
    private int timesFreeBetWin;

    public int getCoinsWin() {
        return coinsWin;
    }

    public void addCoinsWin(int coinsWin) {
        this.coinsWin = this.coinsWin + coinsWin;
    }

    public int getCoinsSpent() {
        return coinsSpent;
    }

    public void addCoinsSpent(int coinsSpent) {
        this.coinsSpent = this.coinsSpent + coinsSpent;
    }

    public int getTimesPlayed() {
        return timesPlayed;
    }

    public void addTimesPlayed() {
        this.timesPlayed++;
    }

    public int getTimesWin() {
        return timesWin;
    }

    public void addTimesWin() {
        this.timesWin++;
    }

    public int getTimesFreeBetWin() {
        return timesFreeBetWin;
    }

    public void addTimesFreeBetWin() {
        this.timesFreeBetWin++;
    }

    public int getWinNumber() {
        int winNumber;
        Random random = new Random();
        winNumber = random.nextInt(99);
        return winNumber;
    }

    public void getStatistic(String gameName){
        System.out.println("***" + gameName + "***");
        double RPT = ((double)getCoinsWin())/((double)(getCoinsSpent()));
        System.out.println(getCoinsWin() + "  - coins win!");
        System.out.println(getCoinsSpent() + " - coins spent.");
        System.out.println(getTimesPlayed() + "  - times your bet played.");
        System.out.println(String.format("%.5f", RPT) + "  - RPT");
    }
}

