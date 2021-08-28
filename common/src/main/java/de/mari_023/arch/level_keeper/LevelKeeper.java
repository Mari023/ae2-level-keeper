package de.mari_023.arch.level_keeper;

import appeng.api.definitions.IBlockDefinition;
import appeng.bootstrap.FeatureFactory;
import appeng.core.Api;
import appeng.core.ApiDefinitions;
import me.shedaniel.architectury.registry.CreativeTabs;
import me.shedaniel.architectury.registry.DeferredRegister;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class LevelKeeper {
    public static final String MOD_ID = "level_keeper";
    // Registering a new creative tab
    public static final CreativeModeTab EXAMPLE_TAB = CreativeTabs.create(new ResourceLocation(MOD_ID, "example_tab"), new Supplier<ItemStack>() {
        @Override
        public ItemStack get() {
            return new ItemStack(LEVEL_KEEPER_DEFINITION.blockItem());
        }
    });

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registry.BLOCK_REGISTRY);
    public static IBlockDefinition LEVEL_KEEPER_DEFINITION;
    public static void init() {
        BLOCKS.register();
        FeatureFactory registry = ((ApiDefinitions) Api.instance().definitions()).getRegistry();
        LEVEL_KEEPER_DEFINITION = registry.block("level_keeper", LevelKeeperBlock::new).tileEntity(registry.tileEntity("level_keeper", LevelKeeperBlockEntity.class, LevelKeeperBlockEntity::new).build()).build();
    }
}
