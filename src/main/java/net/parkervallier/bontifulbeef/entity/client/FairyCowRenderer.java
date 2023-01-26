package net.parkervallier.bontifulbeef.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.parkervallier.bontifulbeef.BontifulBeef;
import net.parkervallier.bontifulbeef.entity.custom.FairyCowEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import javax.annotation.Nullable;

public class FairyCowRenderer extends GeoEntityRenderer<FairyCowEntity> {
    public FairyCowRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new FairyCowModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureLocation(FairyCowEntity instance){
        return new Identifier(BontifulBeef.MOD_ID, "textures/entity/fairycow_texture.png");
    }

    @Override
    public RenderLayer getRenderType(FairyCowEntity animatable, Identifier texture, @Nullable VertexConsumerProvider bufferSource, float partialTick){
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }

}
