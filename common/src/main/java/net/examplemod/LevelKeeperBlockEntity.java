package net.examplemod;

import alexiil.mc.lib.attributes.item.FixedItemInv;
import appeng.api.networking.security.IActionSource;
import appeng.api.util.AECableType;
import appeng.api.util.AEPartLocation;
import appeng.api.util.DimensionalCoord;
import appeng.me.helpers.MachineSource;
import appeng.tile.grid.AENetworkInvTileEntity;
import appeng.util.inv.InvOperation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class LevelKeeperBlockEntity extends AENetworkInvTileEntity {
    private final IActionSource mySrc;

    public LevelKeeperBlockEntity(BlockEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
        mySrc = new MachineSource(this);
    }

    @Override
    public DimensionalCoord getLocation() {
        return new DimensionalCoord(this);
    }

    @Override
    public AECableType getCableConnectionType(AEPartLocation aePartLocation) {
        return AECableType.SMART;
    }

    @Override
    public FixedItemInv getInternalInventory() {
        return null;
    }

    @Override
    public void onChangeInventory(FixedItemInv fixedItemInv, int i, InvOperation invOperation, ItemStack itemStack, ItemStack itemStack1) {

    }
}
