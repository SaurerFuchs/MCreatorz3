package net.mcreator.dddddddd.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.dddddddd.entity.PowdermouseEntity;

public class PowdermouseModel extends GeoModel<PowdermouseEntity> {
	@Override
	public ResourceLocation getAnimationResource(PowdermouseEntity entity) {
		return new ResourceLocation("ghostsandgraves", "animations/powdermousemodel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PowdermouseEntity entity) {
		return new ResourceLocation("ghostsandgraves", "geo/powdermousemodel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PowdermouseEntity entity) {
		return new ResourceLocation("ghostsandgraves", "textures/entities/" + entity.getTexture() + ".png");
	}

}
