package de.mari_023.arch.level_keeper.fabric;

import de.mari_023.arch.level_keeper.LevelKeeperContainer;
import de.mari_023.arch.level_keeper.LevelKeeperScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

public class LevelKeeperClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(LevelKeeperContainer.TYPE, LevelKeeperScreen::new);
    }
}
