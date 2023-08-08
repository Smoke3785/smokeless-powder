package com.iliad.smokelesspowder.misc;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.EntityDamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;

public class DeferredDamageSource extends EntityDamageSource {
    public static final DamageSource CUSTOM_DAMAGE = new DamageSource("custom_damage");
    private final String deferredID;

    public DeferredDamageSource(String damageTypeIn, Entity damageSourceEntityIn, String deferredID) {
        super(damageTypeIn, damageSourceEntityIn);
        this.deferredID = deferredID;
    }

    public static DeferredDamageSource deferredPlayerAttack(Player player, String deferredID) {
        return (DeferredDamageSource) new DeferredDamageSource("player", player, deferredID);
    }

    public String getIdentifier() {
        return deferredID;
    }

    public static final Boolean isDeferred = true;
}