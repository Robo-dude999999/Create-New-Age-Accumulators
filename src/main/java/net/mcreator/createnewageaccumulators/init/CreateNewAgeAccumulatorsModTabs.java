/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createnewageaccumulators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.createnewageaccumulators.CreateNewAgeAccumulatorsMod;

public class CreateNewAgeAccumulatorsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateNewAgeAccumulatorsMod.MODID);
	public static final RegistryObject<CreativeModeTab> ACCUMULATORS = REGISTRY.register("accumulators", () -> CreativeModeTab.builder().title(Component.translatable("item_group.create_new_age_accumulators.accumulators"))
			.icon(() -> new ItemStack(CreateNewAgeAccumulatorsModBlocks.LITHIUM_ION_ACCUMULATOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreateNewAgeAccumulatorsModBlocks.CREATIVE_ACCUMULATOR.get().asItem());
				tabData.accept(CreateNewAgeAccumulatorsModBlocks.LITHIUM_ION_ACCUMULATOR.get().asItem());
				tabData.accept(CreateNewAgeAccumulatorsModBlocks.NICKEL_CADMIUM_ACCUMULATOR.get().asItem());
				tabData.accept(CreateNewAgeAccumulatorsModBlocks.NUCLEAR_WASTE_HEAT_ACCUMULATOR.get().asItem());
				tabData.accept(CreateNewAgeAccumulatorsModBlocks.LITHIUM_ORE.get().asItem());
				tabData.accept(CreateNewAgeAccumulatorsModBlocks.LITHIUM_BLOCK.get().asItem());
				tabData.accept(CreateNewAgeAccumulatorsModItems.LITHIUM_INGOT.get());
				tabData.accept(CreateNewAgeAccumulatorsModItems.IONIC_LITHIUM.get());
				tabData.accept(CreateNewAgeAccumulatorsModItems.GRAPHITE_POWDER.get());
				tabData.accept(CreateNewAgeAccumulatorsModItems.GRAPHITE.get());
				tabData.accept(CreateNewAgeAccumulatorsModItems.CADMIUM.get());
				tabData.accept(CreateNewAgeAccumulatorsModItems.NICKEL_DUST.get());
				tabData.accept(CreateNewAgeAccumulatorsModBlocks.NICKEL_BLOCK.get().asItem());
				tabData.accept(CreateNewAgeAccumulatorsModItems.BATTERY.get());
				tabData.accept(CreateNewAgeAccumulatorsModItems.BATTERY_PACK.get());
				tabData.accept(CreateNewAgeAccumulatorsModItems.NICKEL_CADMIUM_BATTERY.get());
				tabData.accept(CreateNewAgeAccumulatorsModItems.NICKEL_CADMIUM_BATTERY_PACK.get());
				tabData.accept(CreateNewAgeAccumulatorsModItems.NUCLEAR_WASTE_HEAT_ACCUMULATOR_CORE.get());
				tabData.accept(CreateNewAgeAccumulatorsModItems.REACTOR_CASING_ROD.get());
			}).build());
}