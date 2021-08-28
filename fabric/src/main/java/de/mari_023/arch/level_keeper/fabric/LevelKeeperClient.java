package de.mari_023.arch.level_keeper.fabric;

import net.fabricmc.api.ClientModInitializer;

public class LevelKeeperClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        de.mari_023.arch.level_keeper.LevelKeeperClient.init();
    }
}
