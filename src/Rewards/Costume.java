package Rewards;

import Fabric.GameItem;

/*
 Класс Нового облика перонажа
 */
public class Costume implements GameItem {

    @Override
    public void open() {
        System.out.println("Costume unlocked");
    }
}
