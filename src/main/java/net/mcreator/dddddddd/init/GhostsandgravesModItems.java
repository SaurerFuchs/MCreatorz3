
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dddddddd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.dddddddd.item.UnderworldItem;
import net.mcreator.dddddddd.item.AcidItem;
import net.mcreator.dddddddd.GhostsandgravesMod;

public class GhostsandgravesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GhostsandgravesMod.MODID);
	public static final RegistryObject<Item> REAPER_SPAWN_EGG = REGISTRY.register("reaper_spawn_egg", () -> new ForgeSpawnEggItem(GhostsandgravesModEntities.REAPER, -4555652, -9878717, new Item.Properties()));
	public static final RegistryObject<Item> ACID_BUCKET = REGISTRY.register("acid_bucket", () -> new AcidItem());
	public static final RegistryObject<Item> UNDERWORLD = REGISTRY.register("underworld", () -> new UnderworldItem());
	public static final RegistryObject<Item> POWDERMOUSE_SPAWN_EGG = REGISTRY.register("powdermouse_spawn_egg", () -> new ForgeSpawnEggItem(GhostsandgravesModEntities.POWDERMOUSE, -10004398, -1221073, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
