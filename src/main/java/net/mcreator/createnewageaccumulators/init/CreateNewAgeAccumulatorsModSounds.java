/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createnewageaccumulators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.createnewageaccumulators.CreateNewAgeAccumulatorsMod;

public class CreateNewAgeAccumulatorsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CreateNewAgeAccumulatorsMod.MODID);
	public static final RegistryObject<SoundEvent> METAL_CREAK = REGISTRY.register("metal_creak", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("create_new_age_accumulators", "metal_creak")));
}