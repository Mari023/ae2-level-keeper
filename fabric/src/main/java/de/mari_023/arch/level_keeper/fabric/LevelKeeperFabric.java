package de.mari_023.arch.level_keeper.fabric;

import de.mari_023.arch.level_keeper.LevelKeeper;
import net.fabricmc.api.ModInitializer;

public class LevelKeeperFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        LevelKeeper.init();
    }
}
