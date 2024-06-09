package dev.newkini;

import dev.newkini.common.registry.BlockRegistry;
import dev.newkini.common.registry.ItemRegistry;
import dev.newkini.common.registry.TabRegistry;

public final class Rfm {
    public static final String MOD_ID = "rfm";

    public static void init() {
        /** Registry register */
        ItemRegistry.ITEMS.register();
        TabRegistry.TABS.register();
        BlockRegistry.register();

    }
}
