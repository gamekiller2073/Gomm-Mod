package net.guus.gommmod;

import net.fabricmc.api.ModInitializer;

import net.guus.gommmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GommMod implements ModInitializer {
	public static final String MOD_ID = "gommmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}