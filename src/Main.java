import RewardsGenerators.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GemGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new SwordGenerator());
        generatorList.add(new CostumeGenerator());
        generatorList.add(new ExpBonusGenerator());
        generatorList.add(new MimicChestGeneator());
        generatorList.add(new EmptyChestGenerator());

        for (int i = 0; i < 10; i++) { //Сымитируем открытие 10 случайных наград
            Random r = new Random();
            int index = r.nextInt((generatorList.size() ));
            ItemGenerator itemGenerator = generatorList.get(index);
            itemGenerator.openReward();
        }
    }
}
