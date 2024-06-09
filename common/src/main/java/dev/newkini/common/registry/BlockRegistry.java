package dev.newkini.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.newkini.Rfm;
import dev.newkini.common.block.custom.FarmLandBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Supplier;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Rfm.MOD_ID, Registries.BLOCK);

    /** FARM LAND */
    public static final RegistrySupplier<Block> RFM_FARMLAND = BLOCKS.register("farmland",
            () -> new FarmLandBlock(Block.Properties.ofFullCopy(Blocks.FARMLAND)));

    public static void register() {
        BLOCKS.register();
    }
}
