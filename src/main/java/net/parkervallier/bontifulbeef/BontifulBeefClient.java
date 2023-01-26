package net.parkervallier.bontifulbeef;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.parkervallier.bontifulbeef.entity.ModEntities;
import net.parkervallier.bontifulbeef.entity.client.FairyCowRenderer;

public class BontifulBeefClient implements ClientModInitializer {
    @Override
    public void onInitializeClient(){
        EntityRendererRegistry.register(ModEntities.FAIRYCOW, FairyCowRenderer::new);
    }
}
