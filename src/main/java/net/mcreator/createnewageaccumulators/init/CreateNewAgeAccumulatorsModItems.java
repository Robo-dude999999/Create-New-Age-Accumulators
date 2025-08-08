
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createnewageaccumulators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.createnewageaccumulators.item.LithiumIngotItem;
import net.mcreator.createnewageaccumulators.item.IonicLithiumItem;
import net.mcreator.createnewageaccumulators.item.ImcompleteAABatteryItem;
import net.mcreator.createnewageaccumulators.item.GraphiteItem;
import net.mcreator.createnewageaccumulators.item.CadmiumItem;
import net.mcreator.createnewageaccumulators.item.BatteryPackItem;
import net.mcreator.createnewageaccumulators.item.AABatteryItem;
import net.mcreator.createnewageaccumulators.CreateNewAgeAccumulatorsMod;

public class CreateNewAgeAccumulatorsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateNewAgeAccumulatorsMod.MODID);
	public static final RegistryObject<Item> ACCUMULATOR = block(CreateNewAgeAccumulatorsModBlocks.ACCUMULATOR);
	public static final RegistryObject<Item> BATTERY = REGISTRY.register("battery", () -> new AABatteryItem());
	public static final RegistryObject<Item> BATTERY_PACK = REGISTRY.register("battery_pack", () -> new BatteryPackItem());
	public static final RegistryObject<Item> LITHIUM_INGOT = REGISTRY.register("lithium_ingot", () -> new LithiumIngotItem());
	public static final RegistryObject<Item> LITHIUM_ORE = block(CreateNewAgeAccumulatorsModBlocks.LITHIUM_ORE);
	public static final RegistryObject<Item> LITHIUM_BLOCK = block(CreateNewAgeAccumulatorsModBlocks.LITHIUM_BLOCK);
	public static final RegistryObject<Item> IONIC_LITHIUM = REGISTRY.register("ionic_lithium", () -> new IonicLithiumItem());
	public static final RegistryObject<Item> INCOMPLETE_BATTERY = REGISTRY.register("incomplete_battery", () -> new ImcompleteAABatteryItem());
	public static final RegistryObject<Item> CREATIVE_ACCUMULATOR = block(CreateNewAgeAccumulatorsModBlocks.CREATIVE_ACCUMULATOR);
	public static final RegistryObject<Item> GRAPHITE = REGISTRY.register("graphite", () -> new GraphiteItem());
	public static final RegistryObject<Item> CADMIUM = REGISTRY.register("cadmium", () -> new CadmiumItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
