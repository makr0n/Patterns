package RewardsGenerators;

import Fabric.ItemGenerator;
import Fabric.GameItem;
import Rewards.GemReward;

public class GemGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
