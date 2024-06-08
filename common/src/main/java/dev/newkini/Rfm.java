package dev.newkini;

import dev.newkini.core.common.registry.BlockRegistry;
import dev.newkini.core.common.registry.ItemRegistry;
import dev.newkini.core.common.registry.TabRegistry;

public final class Rfm {
    public static final String MOD_ID = "rfm";

    public static void init() {
        BlockRegistry.register();
        ItemRegistry.register();
        TabRegistry.register();
    }
}
