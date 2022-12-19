package Rewards;
/*
Класс Дополнительный опыт
 */
public class ExpBonus implements GameItem {
    @Override
    public void open() {
        System.out.println("Bonus XP gained!");
    }
}
