
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dddddddd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.dddddddd.fluid.types.AcidFluidType;
import net.mcreator.dddddddd.GhostsandgravesMod;

public class GhostsandgravesModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, GhostsandgravesMod.MODID);
	public static final RegistryObject<FluidType> ACID_TYPE = REGISTRY.register("acid", () -> new AcidFluidType());
}
