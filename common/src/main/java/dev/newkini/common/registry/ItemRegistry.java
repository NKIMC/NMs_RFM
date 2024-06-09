package dev.newkini.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.newkini.Rfm;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Rfm.MOD_ID, Registries.ITEM);

    /** FOOD */
    public static final RegistrySupplier<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().arch$tab(TabRegistry.RFM_ITEMS).food(FoodRegistry.TOMATO)));

    /** BLOCK */
    public static final RegistrySupplier<Item> FARMLAND = ITEMS.register("farmland", () -> new BlockItem(BlockRegistry.RFM_FARMLAND.get(), new Item.Properties().arch$tab(TabRegistry.RFM_ITEMS)));
}
