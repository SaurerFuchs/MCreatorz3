
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dddddddd.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.dddddddd.client.renderer.ReaperRenderer;
import net.mcreator.dddddddd.client.renderer.PowdermouseRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GhostsandgravesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(GhostsandgravesModEntities.REAPER.get(), ReaperRenderer::new);
		event.registerEntityRenderer(GhostsandgravesModEntities.POWDERMOUSE.get(), PowdermouseRenderer::new);
	}
}
