package RewardsGenerators;

import Fabric.ItemGenerator;
import Fabric.GameItem;
import Rewards.SwordReward;

public class SwordGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new SwordReward();
    }
}
