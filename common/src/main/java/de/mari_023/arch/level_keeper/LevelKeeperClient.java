package de.mari_023.arch.level_keeper;

import me.shedaniel.architectury.registry.MenuRegistry;

public class LevelKeeperClient {
    public static void init() {
        MenuRegistry.registerScreenFactory(LevelKeeperContainer.TYPE, LevelKeeperScreen::new);
    }
}
