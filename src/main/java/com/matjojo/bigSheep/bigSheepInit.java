package com.matjojo.bigSheep;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class bigSheepInit implements ModInitializer, ClientModInitializer {
	@Override
	public void onInitialize() {
		// shared init, so client and server
	}

	@Override
	public void onInitializeClient() {
		// client only init, so most graphics stuff
	}
}
