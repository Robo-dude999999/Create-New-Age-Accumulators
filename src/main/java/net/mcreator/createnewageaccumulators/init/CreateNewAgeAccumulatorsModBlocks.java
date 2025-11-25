/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createnewageaccumulators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.createnewageaccumulators.block.*;
import net.mcreator.createnewageaccumulators.CreateNewAgeAccumulatorsMod;

public class CreateNewAgeAccumulatorsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateNewAgeAccumulatorsMod.MODID);
	public static final RegistryObject<Block> LITHIUM_ION_ACCUMULATOR;
	public static final RegistryObject<Block> LITHIUM_ORE;
	public static final RegistryObject<Block> LITHIUM_BLOCK;
	public static final RegistryObject<Block> CREATIVE_ACCUMULATOR;
	public static final RegistryObject<Block> NICKEL_BLOCK;
	public static final RegistryObject<Block> NICKEL_CADMIUM_ACCUMULATOR;
	public static final RegistryObject<Block> NUCLEAR_WASTE_HEAT_ACCUMULATOR;
	static {
		LITHIUM_ION_ACCUMULATOR = REGISTRY.register("lithium_ion_accumulator", AccumulatorBlock::new);
		LITHIUM_ORE = REGISTRY.register("lithium_ore", LithiumOreBlock::new);
		LITHIUM_BLOCK = REGISTRY.register("lithium_block", LithiumBlockBlock::new);
		CREATIVE_ACCUMULATOR = REGISTRY.register("creative_accumulator", CreativeAccumulatorBlock::new);
		NICKEL_BLOCK = REGISTRY.register("nickel_block", NickelBlockBlock::new);
		NICKEL_CADMIUM_ACCUMULATOR = REGISTRY.register("nickel_cadmium_accumulator", NickelCadmiumAccumulatorBlock::new);
		NUCLEAR_WASTE_HEAT_ACCUMULATOR = REGISTRY.register("nuclear_waste_heat_accumulator", NuclearWasteHeatAccumulatorBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}