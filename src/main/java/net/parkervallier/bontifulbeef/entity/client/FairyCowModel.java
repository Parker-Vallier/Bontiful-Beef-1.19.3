package net.parkervallier.bontifulbeef.entity.client;

import net.minecraft.util.Identifier;
import net.parkervallier.bontifulbeef.BontifulBeef;
import net.parkervallier.bontifulbeef.entity.custom.FairyCowEntity;
import software.bernie.geckolib.model.GeoModel;

public class FairyCowModel extends GeoModel<FairyCowEntity> {
    @Override
    public Identifier getModelResource(FairyCowEntity animatable) {
        return new Identifier(BontifulBeef.MOD_ID, "geo/fairycow.geo.json");
    }

    @Override
    public Identifier getTextureResource(FairyCowEntity animatable) {
        return new Identifier(BontifulBeef.MOD_ID, "textures/entities/fairycow_texture.png");
    }

    @Override
    public Identifier getAnimationResource(FairyCowEntity animatable) {
        return new Identifier(BontifulBeef.MOD_ID, "animations/fairycow.animations.json");
    }
}