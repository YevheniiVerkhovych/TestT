public class SlotPlay {
    public static void main(String[] args) {
        Player player = new Player();
        int timesToPlay = 1000000;
        SlotPlayLogic slotPlayLogic = new SlotPlayLogic(player);
        slotPlayLogic.setChanceCoinsWin(30);
        slotPlayLogic.setChanceFreeBetWin(10);
        slotPlayLogic.setBetCoinsValue(10);
        slotPlayLogic.setCoinsWinAmount(20);

        for(int i=0; i<timesToPlay; i++) {
            slotPlayLogic.PlayRound(slotPlayLogic.getBetCoinsValue());
        }

        player.getStatistic("SlotPlay");
    }
}
//RPT usually around 0.67 because:
//- for N rounds we spent N*10 coins
//- for this coins we receive N + N/10 + N/100 + N/1000...  N*1.111 rounds
//- we can win 30% of rounds, by 20 coins for each round
//- so, the total amount of prize we can calculate as: 20*0.3*N,NNN
//- RPT is winAmount/spentAmount, so: (20*0.3*N*1.111)/N*10
//-  if N = 1000000, RPT is around = 0,67