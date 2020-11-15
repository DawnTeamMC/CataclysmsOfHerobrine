package com.hugman.cataclysms_of_herobrine;

import com.hugman.cataclysms_of_herobrine.util.MathHelper;
import com.hugman.cataclysms_of_herobrine.util.Constants;
import com.hugman.dawn.api.util.ModData;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CataclysmsOfHerobrine implements ModInitializer {
	public static final ModData MOD_DATA = new ModData("cataclysms_of_herobrine");
	public static final Logger LOGGER = LogManager.getLogger();

	@Override
	public void onInitialize() {
		Constants.randomizeModels = MathHelper.chance(100);
		MOD_DATA.registerCreators();
	}
}
