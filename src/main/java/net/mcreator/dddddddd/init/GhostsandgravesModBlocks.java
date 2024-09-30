
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dddddddd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.dddddddd.block.UnderworldPortalBlock;
import net.mcreator.dddddddd.block.AcidBlock;
import net.mcreator.dddddddd.GhostsandgravesMod;

public class GhostsandgravesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GhostsandgravesMod.MODID);
	public static final RegistryObject<Block> ACID = REGISTRY.register("acid", () -> new AcidBlock());
	public static final RegistryObject<Block> UNDERWORLD_PORTAL = REGISTRY.register("underworld_portal", () -> new UnderworldPortalBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
