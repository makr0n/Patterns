package RewardsGenerators;

import Rewards.ExpBonus;
import Rewards.GameItem;

public class ExpBonusGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new ExpBonus();
    }
}
