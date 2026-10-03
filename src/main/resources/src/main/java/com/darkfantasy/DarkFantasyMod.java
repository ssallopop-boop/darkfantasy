package com.darkfantasy;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DarkFantasyMod implements ModInitializer {
	public static final String MOD_ID = "darkfantasy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Dark Fantasy loaded.");
	}
}
