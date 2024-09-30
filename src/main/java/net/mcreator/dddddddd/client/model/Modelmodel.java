package net.mcreator.dddddddd.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmodel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ghostsandgraves", "modelmodel"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart leg4;
	public final ModelPart reap1;
	public final ModelPart reap4;
	public final ModelPart blade1;
	public final ModelPart reap2;
	public final ModelPart reap3;
	public final ModelPart blade2;

	public Modelmodel(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
		this.reap1 = root.getChild("reap1");
		this.reap4 = root.getChild("reap4");
		this.blade1 = root.getChild("blade1");
		this.reap2 = root.getChild("reap2");
		this.reap3 = root.getChild("reap3");
		this.blade2 = root.getChild("blade2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leg1 = body.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 4.0F));
		PartDefinition leg2 = body.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 4.0F));
		PartDefinition leg3 = body.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(1, 17).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, -4.0F));
		PartDefinition leg4 = body.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(1, 17).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, -4.0F));
		PartDefinition reap1 = body.addOrReplaceChild("reap1", CubeListBuilder.create(), PartPose.offset(0.0F, 18.0F, 0.0F));
		PartDefinition reap1_r1 = reap1.addOrReplaceChild("reap1_r1", CubeListBuilder.create().texOffs(40, 22).addBox(4.0F, 0.0F, -13.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition reap4 = reap1.addOrReplaceChild("reap4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -7.0F));
		PartDefinition reap4_r1 = reap4.addOrReplaceChild("reap4_r1", CubeListBuilder.create().texOffs(40, 13).addBox(4.0F, 0.0F, -13.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition blade1 = reap4.addOrReplaceChild("blade1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition blade5_r1 = blade1.addOrReplaceChild("blade5_r1",
				CubeListBuilder.create().texOffs(24, 4).addBox(5.0F, 14.0F, -12.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 1).addBox(5.0F, 12.0F, -13.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 3)
						.addBox(5.0F, 8.0F, -14.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 2).addBox(5.0F, 8.0F, -13.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 7)
						.addBox(5.0F, 6.0F, -13.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition reap2 = body.addOrReplaceChild("reap2", CubeListBuilder.create(), PartPose.offset(-11.0F, 18.0F, 0.0F));
		PartDefinition reap2_r1 = reap2.addOrReplaceChild("reap2_r1", CubeListBuilder.create().texOffs(40, 22).addBox(4.0F, 0.0F, -13.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition reap3 = reap2.addOrReplaceChild("reap3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -7.0F));
		PartDefinition reap3_r1 = reap3.addOrReplaceChild("reap3_r1", CubeListBuilder.create().texOffs(40, 13).addBox(4.0F, 0.0F, -13.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition blade2 = reap3.addOrReplaceChild("blade2", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0F, 0.0F));
		PartDefinition blade6_r1 = blade2.addOrReplaceChild("blade6_r1",
				CubeListBuilder.create().texOffs(24, 3).addBox(5.0F, 14.0F, -12.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, -1).addBox(5.0F, 12.0F, -13.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, -1)
						.addBox(5.0F, 8.0F, -14.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, -2).addBox(5.0F, 8.0F, -13.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 5)
						.addBox(5.0F, 6.0F, -13.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
