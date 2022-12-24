package Rewards;

import Fabric.GameItem;

public class SwordReward implements GameItem {
    @Override
    public void open() {
        System.out.println("New Sword");
    }
}
