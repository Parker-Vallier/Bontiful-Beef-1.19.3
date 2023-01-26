package net.parkervallier.bontifulbeef;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.parkervallier.bontifulbeef.entity.ModEntities;
import net.parkervallier.bontifulbeef.entity.custom.FairyCowEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class BontifulBeef implements ModInitializer {
	public static final String MOD_ID = "bontifulbeef";
	public static final Logger LOGGER = LoggerFactory.getLogger("bontifulbeef");

	@Override
	public void onInitialize() {


		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(ModEntities.FAIRYCOW, FairyCowEntity.setAttributes());

	}
}