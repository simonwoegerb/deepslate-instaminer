package io.github.codedauster;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeepslateInstamine implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("deepslate-instamine");

	@Override
	public void onInitialize() {
		LOGGER.info("Loaded!");

	}
}