package RewardsGenerators;

import Rewards.Costume;
import Rewards.GameItem;

public class CostumeGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new Costume();
    }
}
