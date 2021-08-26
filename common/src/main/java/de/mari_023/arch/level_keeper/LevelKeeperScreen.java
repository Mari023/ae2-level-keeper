package de.mari_023.arch.level_keeper;

import appeng.client.gui.AEBaseScreen;
import appeng.client.gui.style.ScreenStyle;
import appeng.client.gui.style.StyleManager;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

import java.io.IOException;

public class LevelKeeperScreen extends AEBaseScreen<LevelKeeperContainer> {

    private static final ScreenStyle STYLE;

    static {
        ScreenStyle style;
        try {
            style = StyleManager.loadStyleDoc("/screens/level_keeper/level_keeper.json");
        } catch(IOException ignored) {
            style = null;
        }
        STYLE = style;
    }

    public LevelKeeperScreen(LevelKeeperContainer container, Inventory playerInventory, Component title) {
        super(container, playerInventory, title, STYLE);
    }
}
