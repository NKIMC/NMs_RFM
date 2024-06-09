package dev.newkini.core.common.registry;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.newkini.Rfm;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

public class TabRegistry {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Rfm.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> RFM_ITEM_TAB = TABS.register(
            "rfm",
            () -> CreativeTabRegistry.create(
                    Component.translatable("tab.rfm.item"),
                    () -> new ItemStack(ItemRegistry.TOMATO)
            )
    );

    public static final RegistrySupplier<CreativeModeTab> RFM_BLOCK_TAB = TABS.register(
            "rfm_block",
            () -> CreativeTabRegistry.create(
                    Component.translatable("tab.rfm.block"),
                    () -> new ItemStack((ItemLike) BlockRegistry.FIRE_PIT)
            )
    );

    public static void register() {
        TABS.register();
    }
}
