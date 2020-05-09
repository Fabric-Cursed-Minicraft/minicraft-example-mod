package dev.soapy.examplemod.mixin;

import com.mojang.ld22.Game;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Game.class)
public class MixinGameLoad {
    @Inject(method = "start()V", at = @At("HEAD"))
    public void injectStart(CallbackInfo info) {
        System.out.println("Loaded example mod!");
    }
}
