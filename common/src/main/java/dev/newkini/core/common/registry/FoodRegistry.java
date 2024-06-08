package dev.newkini.core.common.registry;

import net.minecraft.world.food.FoodProperties;

public class FoodRegistry {
    public static final FoodProperties TOMATO = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.4F).build();
}
