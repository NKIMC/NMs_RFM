package dev.newkini.neoforge;

import net.neoforged.fml.common.Mod;

import dev.newkini.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
