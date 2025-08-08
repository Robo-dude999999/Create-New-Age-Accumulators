
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createnewageaccumulators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.createnewageaccumulators.block.NickelCadmiumAccumulatorBlock;
import net.mcreator.createnewageaccumulators.block.NickelBlockBlock;
import net.mcreator.createnewageaccumulators.block.LithiumOreBlock;
import net.mcreator.createnewageaccumulators.block.LithiumBlockBlock;
import net.mcreator.createnewageaccumulators.block.CreativeAccumulatorBlock;
import net.mcreator.createnewageaccumulators.block.AccumulatorBlock;
import net.mcreator.createnewageaccumulators.CreateNewAgeAccumulatorsMod;

public class CreateNewAgeAccumulatorsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateNewAgeAccumulatorsMod.MODID);
	public static final RegistryObject<Block> LITHIUM_ION_ACCUMULATOR = REGISTRY.register("lithium_ion_accumulator", () -> new AccumulatorBlock());
	public static final RegistryObject<Block> LITHIUM_ORE = REGISTRY.register("lithium_ore", () -> new LithiumOreBlock());
	public static final RegistryObject<Block> LITHIUM_BLOCK = REGISTRY.register("lithium_block", () -> new LithiumBlockBlock());
	public static final RegistryObject<Block> CREATIVE_ACCUMULATOR = REGISTRY.register("creative_accumulator", () -> new CreativeAccumulatorBlock());
	public static final RegistryObject<Block> NICKEL_BLOCK = REGISTRY.register("nickel_block", () -> new NickelBlockBlock());
	public static final RegistryObject<Block> NICKEL_CADMIUM_ACCUMULATOR = REGISTRY.register("nickel_cadmium_accumulator", () -> new NickelCadmiumAccumulatorBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
