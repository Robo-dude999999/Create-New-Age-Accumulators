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

import net.mcreator.createnewageaccumulators.item.*;
import net.mcreator.createnewageaccumulators.CreateNewAgeAccumulatorsMod;

public class CreateNewAgeAccumulatorsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateNewAgeAccumulatorsMod.MODID);
	public static final RegistryObject<Item> LITHIUM_ION_ACCUMULATOR;
	public static final RegistryObject<Item> BATTERY;
	public static final RegistryObject<Item> BATTERY_PACK;
	public static final RegistryObject<Item> LITHIUM_INGOT;
	public static final RegistryObject<Item> LITHIUM_ORE;
	public static final RegistryObject<Item> LITHIUM_BLOCK;
	public static final RegistryObject<Item> IONIC_LITHIUM;
	public static final RegistryObject<Item> INCOMPLETE_BATTERY;
	public static final RegistryObject<Item> CREATIVE_ACCUMULATOR;
	public static final RegistryObject<Item> GRAPHITE;
	public static final RegistryObject<Item> CADMIUM;
	public static final RegistryObject<Item> NICKEL_DUST;
	public static final RegistryObject<Item> NICKEL_BLOCK;
	public static final RegistryObject<Item> GRAPHITE_POWDER;
	public static final RegistryObject<Item> NICKEL_CADMIUM_ACCUMULATOR;
	public static final RegistryObject<Item> NICKEL_CADMIUM_BATTERY;
	public static final RegistryObject<Item> NICKEL_CADMIUM_BATTERY_PACK;
	public static final RegistryObject<Item> NUCLEAR_WASTE_HEAT_ACCUMULATOR;
	public static final RegistryObject<Item> NUCLEAR_WASTE_HEAT_ACCUMULATOR_CORE;
	public static final RegistryObject<Item> REACTOR_CASING_ROD;
	static {
		LITHIUM_ION_ACCUMULATOR = block(CreateNewAgeAccumulatorsModBlocks.LITHIUM_ION_ACCUMULATOR);
		BATTERY = REGISTRY.register("battery", AABatteryItem::new);
		BATTERY_PACK = REGISTRY.register("battery_pack", BatteryPackItem::new);
		LITHIUM_INGOT = REGISTRY.register("lithium_ingot", LithiumIngotItem::new);
		LITHIUM_ORE = block(CreateNewAgeAccumulatorsModBlocks.LITHIUM_ORE);
		LITHIUM_BLOCK = block(CreateNewAgeAccumulatorsModBlocks.LITHIUM_BLOCK);
		IONIC_LITHIUM = REGISTRY.register("ionic_lithium", IonicLithiumItem::new);
		INCOMPLETE_BATTERY = REGISTRY.register("incomplete_battery", ImcompleteAABatteryItem::new);
		CREATIVE_ACCUMULATOR = block(CreateNewAgeAccumulatorsModBlocks.CREATIVE_ACCUMULATOR);
		GRAPHITE = REGISTRY.register("graphite", GraphiteItem::new);
		CADMIUM = REGISTRY.register("cadmium", CadmiumItem::new);
		NICKEL_DUST = REGISTRY.register("nickel_dust", NickelDustItem::new);
		NICKEL_BLOCK = block(CreateNewAgeAccumulatorsModBlocks.NICKEL_BLOCK);
		GRAPHITE_POWDER = REGISTRY.register("graphite_powder", GraphitePowderItem::new);
		NICKEL_CADMIUM_ACCUMULATOR = block(CreateNewAgeAccumulatorsModBlocks.NICKEL_CADMIUM_ACCUMULATOR);
		NICKEL_CADMIUM_BATTERY = REGISTRY.register("nickel_cadmium_battery", NickelCadmiumBatteryItem::new);
		NICKEL_CADMIUM_BATTERY_PACK = REGISTRY.register("nickel_cadmium_battery_pack", NickelCadmiumBatteryPackItem::new);
		NUCLEAR_WASTE_HEAT_ACCUMULATOR = block(CreateNewAgeAccumulatorsModBlocks.NUCLEAR_WASTE_HEAT_ACCUMULATOR);
		NUCLEAR_WASTE_HEAT_ACCUMULATOR_CORE = REGISTRY.register("nuclear_waste_heat_accumulator_core", NuclearWasteHeatAccumulatorCoreItem::new);
		REACTOR_CASING_ROD = REGISTRY.register("reactor_casing_rod", ReactorCasingRodItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}