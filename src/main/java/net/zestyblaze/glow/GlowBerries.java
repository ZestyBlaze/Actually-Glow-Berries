package net.zestyblaze.glow;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GlowBerries implements ModInitializer {
	public static final String MODNAME = "ActuallyGlowBerries";

	public static final Logger LOGGER = LogManager.getLogger(MODNAME);

	@Override
	public void onInitialize() {
		LOGGER.info(MODNAME + " is installed correctly, loading now! Thanks for installing! <3");
	}
}
