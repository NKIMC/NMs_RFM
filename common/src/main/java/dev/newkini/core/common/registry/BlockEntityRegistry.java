package dev.newkini.core.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.newkini.Rfm;
import dev.newkini.core.common.block.entity.machine.FirePitEntity;
import dev.newkini.core.common.block.machine.FirePitBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.SupportType;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public class BlockEntityRegistry {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPE = DeferredRegister.create(Rfm.MOD_ID, Registries.BLOCK_ENTITY_TYPE);



}
