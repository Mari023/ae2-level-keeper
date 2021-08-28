package de.mari_023.arch.level_keeper.forge;

import de.mari_023.arch.level_keeper.LevelKeeper;
import de.mari_023.arch.level_keeper.LevelKeeperClient;
import me.shedaniel.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LevelKeeper.MOD_ID)
public class LevelKeeperForge {
    public LevelKeeperForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(LevelKeeper.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        LevelKeeper.init();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    private void clientSetup(FMLClientSetupEvent event) {
        LevelKeeperClient.init();
        //MenuScreens.register(LevelKeeperContainer.TYPE, LevelKeeperScreen::new);
    }
}
