package RewardsGenerators;

import Fabric.ItemGenerator;
import Rewards.EmptyChest;
import Fabric.GameItem;

public class EmptyChestGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new EmptyChest();
    }
}
