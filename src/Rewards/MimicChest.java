package Rewards;
/*
Класс сундук-мимик
 */
public class MimicChest implements GameItem {

    @Override
    public void open() {
        System.out.println("YOU DIED!");
    }
}
