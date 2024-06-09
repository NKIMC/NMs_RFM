package dev.newkini.neoforge.common.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class NeoForgeDataGenerators {

    public static void register() {
        NeoForge.EVENT_BUS.addListener(NeoForgeDataGenerators::gatherData);
    }

    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

//        generator.addProvider(event.includeServer(), ModLootTableProvider.create(packOutput, lookupProvider));
    }
}
