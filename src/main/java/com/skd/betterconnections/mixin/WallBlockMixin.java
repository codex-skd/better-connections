package com.skd.betterconnections.mixin;

import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.state.BlockState;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.world.level.block.WallBlock;

@Mixin(WallBlock.class)
public class WallBlockMixin {

    @Inject(method = "connectsTo", at = @At("RETURN"), cancellable = true)
    private void betterConnections$connectsTo(BlockState state, boolean solid, Direction direction, CallbackInfoReturnable<Boolean> cir) {
        if (cir.getReturnValue()) return;
        if (state.is(BlockTags.FENCES) || state.is(BlockTags.WALL_SIGNS)) {
            cir.setReturnValue(true);
        }
    }
}
