package RewardsGenerators;

import Fabric.ItemGenerator;
import Rewards.ExpBonus;
import Fabric.GameItem;

public class ExpBonusGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new ExpBonus();
    }
}
