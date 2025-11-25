package net.mcreator.createnewageaccumulators.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class CreativeAccumulatorOnTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double amount = 0;
		amount = receiveEnergySimulate(world, BlockPos.containing(x, y + 1, z), getEnergyStored(world, BlockPos.containing(x, y, z), null), Direction.DOWN);
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y + 1, z));
			int _amount = (int) amount;
			if (_ent != null)
				_ent.getCapability(ForgeCapabilities.ENERGY, Direction.DOWN).ifPresent(capability -> capability.receiveEnergy(_amount, false));
		}
	}

	public static int getEnergyStored(LevelAccessor level, BlockPos pos, Direction direction) {
		AtomicInteger result = new AtomicInteger(0);
		BlockEntity entity = level.getBlockEntity(pos);
		if (entity != null)
			entity.getCapability(ForgeCapabilities.ENERGY, direction).ifPresent(capability -> result.set(capability.getEnergyStored()));
		return result.get();
	}

	private static int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int amount, Direction direction) {
		AtomicInteger result = new AtomicInteger(0);
		BlockEntity entity = level.getBlockEntity(pos);
		if (entity != null)
			entity.getCapability(ForgeCapabilities.ENERGY, direction).ifPresent(capability -> result.set(capability.receiveEnergy(amount, true)));
		return result.get();
	}
}