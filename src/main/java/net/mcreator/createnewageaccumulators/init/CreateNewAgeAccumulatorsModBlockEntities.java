/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createnewageaccumulators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;

import net.mcreator.createnewageaccumulators.block.entity.NuclearWasteHeatAccumulatorBlockEntity;
import net.mcreator.createnewageaccumulators.block.entity.NickelCadmiumAccumulatorBlockEntity;
import net.mcreator.createnewageaccumulators.block.entity.CreativeAccumulatorBlockEntity;
import net.mcreator.createnewageaccumulators.block.entity.AccumulatorBlockEntity;
import net.mcreator.createnewageaccumulators.CreateNewAgeAccumulatorsMod;

public class CreateNewAgeAccumulatorsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CreateNewAgeAccumulatorsMod.MODID);
	public static final RegistryObject<BlockEntityType<AccumulatorBlockEntity>> LITHIUM_ION_ACCUMULATOR = register("lithium_ion_accumulator", CreateNewAgeAccumulatorsModBlocks.LITHIUM_ION_ACCUMULATOR, AccumulatorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<CreativeAccumulatorBlockEntity>> CREATIVE_ACCUMULATOR = register("creative_accumulator", CreateNewAgeAccumulatorsModBlocks.CREATIVE_ACCUMULATOR, CreativeAccumulatorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<NickelCadmiumAccumulatorBlockEntity>> NICKEL_CADMIUM_ACCUMULATOR = register("nickel_cadmium_accumulator", CreateNewAgeAccumulatorsModBlocks.NICKEL_CADMIUM_ACCUMULATOR,
			NickelCadmiumAccumulatorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<NuclearWasteHeatAccumulatorBlockEntity>> NUCLEAR_WASTE_HEAT_ACCUMULATOR = register("nuclear_waste_heat_accumulator", CreateNewAgeAccumulatorsModBlocks.NUCLEAR_WASTE_HEAT_ACCUMULATOR,
			NuclearWasteHeatAccumulatorBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}