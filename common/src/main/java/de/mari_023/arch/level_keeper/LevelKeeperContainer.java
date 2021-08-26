package de.mari_023.arch.level_keeper;

import appeng.api.config.SecurityPermissions;
import appeng.container.AEBaseContainer;
import appeng.container.implementations.ContainerTypeBuilder;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;

public class LevelKeeperContainer extends AEBaseContainer {
    public static MenuType<LevelKeeperContainer> TYPE = ContainerTypeBuilder.create(LevelKeeperContainer::new, LevelKeeperBlockEntity.class).requirePermission(SecurityPermissions.CRAFT).build("level_keeper");

    private final LevelKeeperBlockEntity host;

    public LevelKeeperContainer(MenuType<?> containerType, int id, Inventory playerInventory, LevelKeeperBlockEntity host) {
        super(containerType, id, playerInventory, host);
        this.host = host;
        createPlayerInventorySlots(playerInventory);
    }
}
