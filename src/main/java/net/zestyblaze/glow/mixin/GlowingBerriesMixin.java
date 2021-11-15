package net.zestyblaze.glow.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.zestyblaze.glow.GlowBerries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public class GlowingBerriesMixin {
    @Inject(method = "finishUsing", at = @At("HEAD"), cancellable = true)
    private void glowBerryGlowEffect(ItemStack stack, World world, LivingEntity user, CallbackInfoReturnable<ItemStack> cir) {
        if(!world.isClient) {
            GlowBerries.LOGGER.info("Test");
            if (stack.getItem() == Items.GLOW_BERRIES) {
                user.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100, 0, true, false));
            }
        }
    }
}
