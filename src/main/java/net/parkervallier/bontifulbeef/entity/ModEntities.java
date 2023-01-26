package net.parkervallier.bontifulbeef.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.parkervallier.bontifulbeef.BontifulBeef;
import net.parkervallier.bontifulbeef.entity.custom.FairyCowEntity;

public class ModEntities {
    public static final EntityType<FairyCowEntity> FAIRYCOW = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(BontifulBeef.MOD_ID, "fairycow"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, FairyCowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build());
}
