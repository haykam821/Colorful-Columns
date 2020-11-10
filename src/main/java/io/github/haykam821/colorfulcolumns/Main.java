package io.github.haykam821.colorfulcolumns;

import io.github.haykam821.colorfulcolumns.block.ColorfulColumnTypes;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
	public static final String MOD_ID = "colorfulcolumns";

	@Override
	public void onInitialize() {
		ColorfulColumnTypes.register();
	}
}