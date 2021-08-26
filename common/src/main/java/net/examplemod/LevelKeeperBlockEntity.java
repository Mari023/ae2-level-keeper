package net.examplemod;

import appeng.api.networking.IGridNode;
import appeng.api.networking.security.IActionHost;
import appeng.api.networking.security.IActionSource;
import appeng.api.util.AECableType;
import appeng.api.util.AEPartLocation;
import appeng.api.util.DimensionalCoord;
import appeng.me.helpers.AENetworkProxy;
import appeng.me.helpers.IGridProxyable;
import appeng.me.helpers.MachineSource;
import appeng.tile.AEBaseTileEntity;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.EnumSet;

public class LevelKeeperBlockEntity extends AEBaseTileEntity implements IActionHost, IGridProxyable {
    private final IActionSource mySrc;
    private final AENetworkProxy proxy;

    public LevelKeeperBlockEntity(BlockEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
        mySrc = new MachineSource(this);
        proxy = new AENetworkProxy(this, "level_keeper", new ItemStack(ExampleMod.LEVEL_KEEPER_DEFINITION.blockItem()), true);
        proxy.setValidSides(EnumSet.allOf(Direction.class));
    }

    @Override
    public AENetworkProxy getProxy() {
        return proxy;
    }

    @Override
    public DimensionalCoord getLocation() {
        return new DimensionalCoord(this);
    }

    @Override
    public void gridChanged() {

    }

    @Override
    public IGridNode getGridNode(AEPartLocation aePartLocation) {
        return proxy.getNode();
    }

    @Override
    public AECableType getCableConnectionType(AEPartLocation aePartLocation) {
        return AECableType.SMART;
    }


    @Override
    public IGridNode getActionableNode() {
        return proxy.getNode();
    }
}
