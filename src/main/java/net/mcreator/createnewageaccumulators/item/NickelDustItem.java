
package net.mcreator.createnewageaccumulators.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NickelDustItem extends Item {
	public NickelDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
