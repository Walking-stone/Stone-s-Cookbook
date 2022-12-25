package com.dingshibo.mc.stones_cookbook;


import com.dingshibo.mc.stones_cookbook.item.SCFoodComponents;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

    public class Stones_cookbook implements ModInitializer {
        public static final String MOD_ID = "stones_cookbook";
        public static final Logger LOGGER = LoggerFactory.getLogger("stones_cookbook");

        public static final Item APPLE_PIE = new Item(new Item.Settings()
                .group(ItemGroup.FOOD).food(SCFoodComponents.APPLE_PIE));
        public static final Item SWEETBERRY_PIE = new Item(new Item.Settings()
                .group(ItemGroup.FOOD).food(SCFoodComponents.SWEETBERRY_PIE));

        @Override
        public void onInitialize() {
            Registry.register(Registry.ITEM, new Identifier("stones_cookbook", "apple_pie"), APPLE_PIE);
            Registry.register(Registry.ITEM, new Identifier("stones_cookbook", "sweetberry_pie"), SWEETBERRY_PIE);
        }
    }