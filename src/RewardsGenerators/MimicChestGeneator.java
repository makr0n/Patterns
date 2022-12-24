package RewardsGenerators;

import Fabric.ItemGenerator;
import Fabric.GameItem;
import Rewards.MimicChest;

public class MimicChestGeneator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new MimicChest();
    }
}
