package RewardsGenerators;

import Rewards.GameItem;
import Rewards.SwordReward;

public class SwordGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new SwordReward();
    }
}
