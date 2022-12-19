package RewardsGenerators;

import Rewards.GameItem;
import Rewards.GemReward;

public class GemGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
