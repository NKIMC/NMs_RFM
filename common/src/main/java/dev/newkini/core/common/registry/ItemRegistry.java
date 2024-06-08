package dev.newkini.core.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.newkini.Rfm;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Rfm.MOD_ID, Registries.ITEM);

    /* Crops */
    public static final RegistrySupplier<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().arch$tab(TabRegistry.RFM_ITEM_TAB).food(FoodRegistry.TOMATO)));

    /* Blocks */
    public static final RegistrySupplier<Item> FIRE_PIT = ITEMS.register("fire_pit", () -> new BlockItem(BlockRegistry.FIRE_PIT.get(), new Item.Properties().arch$tab(TabRegistry.RFM_BLOCK_TAB)));

    public static void register() {
        ITEMS.register();
    }
}
