
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createnewageaccumulators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.createnewageaccumulators.block.entity.CreativeAccumulatorBlockEntity;
import net.mcreator.createnewageaccumulators.block.entity.AccumulatorBlockEntity;
import net.mcreator.createnewageaccumulators.CreateNewAgeAccumulatorsMod;

public class CreateNewAgeAccumulatorsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CreateNewAgeAccumulatorsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ACCUMULATOR = register("accumulator", CreateNewAgeAccumulatorsModBlocks.ACCUMULATOR, AccumulatorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CREATIVE_ACCUMULATOR = register("creative_accumulator", CreateNewAgeAccumulatorsModBlocks.CREATIVE_ACCUMULATOR, CreativeAccumulatorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
