package net.vicky.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.vicky.tutorialmod.blocks.ModBlocks;
import net.vicky.tutorialmod.item.ModItems;
import net.vicky.tutorialmod.item.ModItemsGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {

	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemsGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}