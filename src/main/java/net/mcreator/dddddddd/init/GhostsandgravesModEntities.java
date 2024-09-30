
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dddddddd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.dddddddd.entity.ReaperEntity;
import net.mcreator.dddddddd.entity.PowdermouseEntity;
import net.mcreator.dddddddd.GhostsandgravesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GhostsandgravesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GhostsandgravesMod.MODID);
	public static final RegistryObject<EntityType<ReaperEntity>> REAPER = register("reaper",
			EntityType.Builder.<ReaperEntity>of(ReaperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ReaperEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PowdermouseEntity>> POWDERMOUSE = register("powdermouse",
			EntityType.Builder.<PowdermouseEntity>of(PowdermouseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PowdermouseEntity::new)

					.sized(0.6f, 0.6f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ReaperEntity.init();
			PowdermouseEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(REAPER.get(), ReaperEntity.createAttributes().build());
		event.put(POWDERMOUSE.get(), PowdermouseEntity.createAttributes().build());
	}
}
