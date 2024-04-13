package io.github.codedauster.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;

import net.minecraft.block.PillarBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(Blocks.class)
public class DeepslateMixin {
    @Redirect(
            slice = @Slice(
                    from = @At(
                            value = "CONSTANT",
                            args = {"stringValue=deepslate"},
                            ordinal = 0
                    )
            ),
            at = @At(
                    value = "NEW",
                    target = "(Lnet/minecraft/block/AbstractBlock$Settings;)Lnet/minecraft/block/PillarBlock;", ordinal = 0
            ),
            method = {"<clinit>"}
    )
    private static PillarBlock Deepslate(AbstractBlock.Settings settings) {
        return new PillarBlock(settings.hardness(1.5f).resistance(6f));
    }

}



