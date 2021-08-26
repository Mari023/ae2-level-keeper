package net.examplemod.forge;

import appeng.core.Api;
import me.shedaniel.architectury.platform.forge.EventBuses;
import net.examplemod.ExampleMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleMod.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ExampleMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        ExampleMod.init();
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        Api.instance().registries().charger().addChargeRate(ExampleMod.AE2TESTITEM.get(), 8000);
    }
}
