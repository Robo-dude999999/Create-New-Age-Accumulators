
package net.mcreator.createnewageaccumulators.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ImcompleteAABatteryItem extends Item {
	public ImcompleteAABatteryItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
