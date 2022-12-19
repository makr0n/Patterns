package RewardsGenerators;

import Rewards.EmptyChest;
import Rewards.GameItem;

public class EmptyChestGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new EmptyChest();
    }
}
