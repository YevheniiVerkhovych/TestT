public class BonusPlay {
    public static void main(String[] args){
        Player player = new Player();
        int timesToPlay = 1000000;
        BonusPlayLogic bonusPlayLogic = new BonusPlayLogic(player);
        bonusPlayLogic.setBonusLevelEnteringChance(10);
        bonusPlayLogic.setBoxesAmount(5);
        bonusPlayLogic.setCoinsWinAmount(5);
        bonusPlayLogic.setBetCoinsValue(10);

        for(int i=0; i<timesToPlay; i++) {
            bonusPlayLogic.PlayRound();
        }

        player.getStatistic("BonusPlay");
    }
}
