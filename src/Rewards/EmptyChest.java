package Rewards;
/*
Класс Сундук без награды
 */
public class EmptyChest implements GameItem {
    @Override
    public void open() {
        System.out.println("Chest is empty");
    }
}
