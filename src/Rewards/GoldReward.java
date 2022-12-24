package Rewards;

import Fabric.GameItem;

public class GoldReward implements GameItem {

    @Override
    public void open()
    {
        System.out.println("Gold");
    }
}
