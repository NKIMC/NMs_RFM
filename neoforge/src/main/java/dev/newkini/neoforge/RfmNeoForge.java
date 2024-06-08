package dev.newkini.neoforge;

import net.neoforged.fml.common.Mod;

import dev.newkini.Rfm;

@Mod(Rfm.MOD_ID)
public final class RfmNeoForge {
    public RfmNeoForge() {
        // Run our common setup.
        Rfm.init();
    }
}
