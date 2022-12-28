package com.dingshibo.mc.stones_cookbook.item;

import net.minecraft.item.FoodComponent;

public class SCFoodComponents {
    public static final FoodComponent APPLE_PIE = new FoodComponent.Builder().hunger(4)
            .saturationModifier(0.3f).build();
    public static final FoodComponent SWEETBERRY_PIE = new FoodComponent.Builder().hunger(4)
            .saturationModifier(0.3f).build();

    public static final FoodComponent CHOCOLATE = new FoodComponent.Builder().hunger(6)
            .saturationModifier(0.2f).build();
    public static final FoodComponent PROCESSED_PUFFERFISH = new FoodComponent.Builder().hunger(4)
            .saturationModifier(0.7f).build();

    public static final FoodComponent MAGMA_PIE = new FoodComponent.Builder().hunger(3)
            .saturationModifier(0.4f).build();

    public static final FoodComponent HONEY_PIE = new FoodComponent.Builder().hunger(4)
            .saturationModifier(0.4f).build();

    public static final FoodComponent COPPER_APPLE = new FoodComponent.Builder().hunger(3)
            .saturationModifier(0.9f).build();

    public static final FoodComponent LAPIS_LAZULI_APPLE = new FoodComponent.Builder().hunger(3)
            .saturationModifier(0.9f).build();
}