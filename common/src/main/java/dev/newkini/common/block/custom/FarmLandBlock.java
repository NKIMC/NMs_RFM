package dev.newkini.common.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.FarmBlock;

public class FarmLandBlock extends FarmBlock {
    public FarmLandBlock(Properties properties) {
        super(properties);
    }

    private static boolean hasWater(LevelReader level, BlockPos pos) {
        for (BlockPos nearbyPos : BlockPos.betweenClosed(pos.offset(-4, 0, -4), pos.offset(4, 1, 4))) {
            if (level.getFluidState(nearbyPos).is(FluidTags.WATER)) {
                return true;
            }
        }
        return false;
    }
}
