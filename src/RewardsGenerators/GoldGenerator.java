package RewardsGenerators;

import Rewards.GameItem;
import Rewards.GoldReward;

public class GoldGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}
