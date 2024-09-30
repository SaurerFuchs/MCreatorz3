package net.mcreator.dddddddd.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.dddddddd.entity.ReaperEntity;

public class ReaperModel extends GeoModel<ReaperEntity> {
	@Override
	public ResourceLocation getAnimationResource(ReaperEntity entity) {
		return new ResourceLocation("ghostsandgraves", "animations/reaper.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ReaperEntity entity) {
		return new ResourceLocation("ghostsandgraves", "geo/reaper.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ReaperEntity entity) {
		return new ResourceLocation("ghostsandgraves", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ReaperEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
