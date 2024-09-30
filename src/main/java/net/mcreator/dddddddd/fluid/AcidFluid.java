
package net.mcreator.dddddddd.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.dddddddd.init.GhostsandgravesModItems;
import net.mcreator.dddddddd.init.GhostsandgravesModFluids;
import net.mcreator.dddddddd.init.GhostsandgravesModFluidTypes;
import net.mcreator.dddddddd.init.GhostsandgravesModBlocks;

public abstract class AcidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> GhostsandgravesModFluidTypes.ACID_TYPE.get(), () -> GhostsandgravesModFluids.ACID.get(), () -> GhostsandgravesModFluids.FLOWING_ACID.get())
			.explosionResistance(100f).bucket(() -> GhostsandgravesModItems.ACID_BUCKET.get()).block(() -> (LiquidBlock) GhostsandgravesModBlocks.ACID.get());

	private AcidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends AcidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AcidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
