package de.mari_023.arch.level_keeper;

import appeng.block.AEBaseTileBlock;
import appeng.container.ContainerLocator;
import appeng.container.ContainerOpener;
import appeng.util.InteractionUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;

public class LevelKeeperBlock extends AEBaseTileBlock<LevelKeeperBlockEntity> {

    public LevelKeeperBlock() {
        super(Properties.of(Material.METAL));
    }

    @Override
    public InteractionResult onActivated(final Level w, final BlockPos pos, final Player p, final InteractionHand hand, final ItemStack heldItem, final BlockHitResult hit) {
        if(InteractionUtil.isInAlternateUseMode(p)) return InteractionResult.PASS;

        final LevelKeeperBlockEntity tg = getTileEntity(w, pos);
        if(tg != null) {
            if(!w.isClientSide()) ContainerOpener.openContainer(LevelKeeperContainer.TYPE, p, ContainerLocator.forTileEntity(tg));
            return InteractionResult.sidedSuccess(w.isClientSide());
        }
        return InteractionResult.PASS;
    }
}
