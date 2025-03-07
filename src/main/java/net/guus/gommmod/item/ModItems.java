package net.guus.gommmod.item;

import net.guus.gommmod.GommMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BAT = registerItem("bat", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GommMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GommMod.LOGGER.info("Registering Mod Items for " + GommMod.MOD_ID);
    }
}