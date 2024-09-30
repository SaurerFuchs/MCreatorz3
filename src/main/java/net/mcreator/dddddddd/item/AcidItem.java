
package net.mcreator.dddddddd.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.dddddddd.init.GhostsandgravesModFluids;

public class AcidItem extends BucketItem {
	public AcidItem() {
		super(GhostsandgravesModFluids.ACID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
