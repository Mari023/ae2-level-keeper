package net.examplemod.fabric;

import appeng.core.Api;
import net.examplemod.ExampleMod;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleMod.init();
        Api.instance().registries().charger().addChargeRate(ExampleMod.AE2TESTITEM.get(), 8000);
    }
}
