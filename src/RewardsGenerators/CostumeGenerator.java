package RewardsGenerators;

import Fabric.ItemGenerator;
import Rewards.Costume;
import Fabric.GameItem;

public class CostumeGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new Costume();
    }
}
