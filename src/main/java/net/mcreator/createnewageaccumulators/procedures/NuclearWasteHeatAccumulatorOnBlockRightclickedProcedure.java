package net.mcreator.createnewageaccumulators.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class NuclearWasteHeatAccumulatorOnBlockRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("" + getEnergyStored(world, BlockPos.containing(x, y, z), null))), true);
	}

	public static int getEnergyStored(LevelAccessor level, BlockPos pos, Direction direction) {
		AtomicInteger result = new AtomicInteger(0);
		BlockEntity entity = level.getBlockEntity(pos);
		if (entity != null)
			entity.getCapability(ForgeCapabilities.ENERGY, direction).ifPresent(capability -> result.set(capability.getEnergyStored()));
		return result.get();
	}
}