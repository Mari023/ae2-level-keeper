package net.examplemod;

import me.shedaniel.architectury.registry.CreativeTabs;
import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public class ExampleMod {
    public static final String MOD_ID = "examplemod";
    // Registering a new creative tab
    public static final CreativeModeTab EXAMPLE_TAB = CreativeTabs.create(new ResourceLocation(MOD_ID, "example_tab"), new Supplier<ItemStack>() {
        @Override
        public ItemStack get() {
            return new ItemStack(LEVEL_KEEPER.get());
        }
    });

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registry.BLOCK_REGISTRY);
    public static final RegistrySupplier<Block> LEVEL_KEEPER = BLOCKS.register("level_keeper", LevelKeeperBlock::new);

    public static BlockEntityType<LevelKeeperBlockEntity> LEVEL_KEEPER_BLOCK_ENTITY_TYPE;

    public static void init() {
        BLOCKS.register();
    }
}
