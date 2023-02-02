package com.dingshibo.mc.stones_cookbook.item;

import net.minecraft.item.FoodComponent;

public class SCFoodComponents {
    public static final FoodComponent APPLE_PIE = new FoodComponent.Builder().hunger(4)
            .saturationModifier(0.3f).build();
    public static final FoodComponent SWEETBERRY_PIE = new FoodComponent.Builder().hunger(4)
            .saturationModifier(0.3f).build();
    public static final FoodComponent CHOCOLATE = new FoodComponent.Builder().hunger(6)
            .saturationModifier(0.2f).snack().build();
    public static final FoodComponent PROCESSED_PUFFERFISH = new FoodComponent.Builder().hunger(4)
            .saturationModifier(0.7f).meat().build();
    public static final FoodComponent MAGMA_PIE = new FoodComponent.Builder().hunger(3)
            .saturationModifier(0.4f).build();
    public static final FoodComponent HONEY_PIE = new FoodComponent.Builder().hunger(4)
            .saturationModifier(0.4f).build();
    public static final FoodComponent COPPER_APPLE = new FoodComponent.Builder().hunger(3)
            .saturationModifier(1.4f).build();
    public static final FoodComponent LAPIS_LAZULI_APPLE = new FoodComponent.Builder().hunger(14)
            .saturationModifier(0.1f).build();
    public static final FoodComponent SEAFOOD_SANDWICH = new FoodComponent.Builder().hunger(6)
            .saturationModifier(0.3f).build();
    public static final FoodComponent COOKED_SEA_PICKLE = new FoodComponent.Builder().hunger(6)
            .saturationModifier(0.4f).build();
    public static final FoodComponent COOKED_SEA_GRASS = new FoodComponent.Builder().hunger(2)
            .saturationModifier(0.1f).build();
    public static final FoodComponent DOUGH = new FoodComponent.Builder().hunger(4)
            .saturationModifier(0.1f).build();
    public static final FoodComponent UNCOOKED_PIZZA = new FoodComponent.Builder().hunger(4)
            .saturationModifier(0.2f).build();
    public static final FoodComponent PIZZA = new FoodComponent.Builder().hunger(6)
            .saturationModifier(0.5f).build();
    public static final FoodComponent CANDY = new FoodComponent.Builder().hunger(2)
            .saturationModifier(0.3f).snack().build();
    public static final FoodComponent RAW_MEAT_BALL = new FoodComponent.Builder().hunger(1)
            .saturationModifier(0.2f).meat().build();
    public static final FoodComponent MEAT_BALL = new FoodComponent.Builder().hunger(5)
            .saturationModifier(0.4f).meat().build();
}