package dev.newkini.core.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.newkini.Rfm;
import dev.newkini.core.common.block.machine.FirePitBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Supplier;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Rfm.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> FAVORITE_ORE = registerBlock("favorite_ore", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).strength(3f, 2.5f)));

    /* machine */
    public static final RegistrySupplier<Block> FIRE_PIT = registerBlock("fire_pit",
            () -> new FirePitBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).noOcclusion()));


    private static <T extends Block> RegistrySupplier<T> registerBlock(String name, Supplier<T> block) {
        RegistrySupplier<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistrySupplier<Item> registerBlockItem(String name, RegistrySupplier<T> block) {
        return ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register() {
        BLOCKS.register();
    }
}
