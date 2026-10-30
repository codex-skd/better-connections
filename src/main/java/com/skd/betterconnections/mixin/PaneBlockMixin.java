package com.skd.betterconnections.mixin;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.state.BlockState;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.world.level.block.IronBarsBlock;

@Mixin(IronBarsBlock.class)
public class PaneBlockMixin {

    @Inject(method = "attachsTo", at = @At("RETURN"), cancellable = true)
    private void betterConnections$attachsTo(BlockState state, boolean solid, CallbackInfoReturnable<Boolean> cir) {
        if (cir.getReturnValue()) return;
        if (state.is(BlockTags.FENCES) || state.is(BlockTags.FENCE_GATES) || state.is(BlockTags.WALL_SIGNS)) {
            cir.setReturnValue(true);
        }
    }
}
