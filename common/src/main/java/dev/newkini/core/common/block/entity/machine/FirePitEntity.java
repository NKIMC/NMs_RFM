package dev.newkini.core.common.block.entity.machine;

import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class FirePitEntity extends BlockEntity implements MenuProvider {
    private final NonNullList<ItemStack> items;

    private static final int FOOD_INPUT_SLOT = 0;
    private static final int FOOD_OUTPUT_SLOT = 1;
    private static final int FUEL_SLOT = 2;

    public FirePitEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState, NonNullList<ItemStack> items) {
        super(blockEntityType, blockPos, blockState);
        this.items = items;
    }

    @Override
    public Component getDisplayName() {
        return null;
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int i, Inventory inventory, Player player) {
        return null;
    }
}
