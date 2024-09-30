
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dddddddd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.dddddddd.GhostsandgravesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GhostsandgravesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GhostsandgravesMod.MODID);
	public static final RegistryObject<CreativeModeTab> GHOSTS_AND_GRAVES = REGISTRY.register("ghosts_and_graves",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ghostsandgraves.ghosts_and_graves")).icon(() -> new ItemStack(GhostsandgravesModItems.REAPER_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GhostsandgravesModItems.REAPER_SPAWN_EGG.get());
				tabData.accept(GhostsandgravesModItems.ACID_BUCKET.get());
				tabData.accept(GhostsandgravesModItems.POWDERMOUSE_SPAWN_EGG.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(GhostsandgravesModItems.REAPER_SPAWN_EGG.get());
			tabData.accept(GhostsandgravesModItems.POWDERMOUSE_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(GhostsandgravesModItems.UNDERWORLD.get());
		}
	}
}
