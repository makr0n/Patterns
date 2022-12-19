package RewardsGenerators;

import Rewards.GameItem;
import Rewards.MimicChest;

public class MimicChestGeneator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new MimicChest();
    }
}
