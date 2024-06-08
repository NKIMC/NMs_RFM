package dev.newkini.core.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.newkini.Rfm;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Rfm.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> FIRE_PIT = BLOCKS.register("fire_pit",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(3f, 2.5f).requiresCorrectToolForDrops()));

    public static void register() {
        BLOCKS.register();
    }
}
